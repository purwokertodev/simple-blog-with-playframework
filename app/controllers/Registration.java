package controllers;

import models.Author;
import org.apache.commons.io.FileUtils;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import java.io.File;

/**
 * Created by WURI on 24/02/2016.
 */
public class Registration extends Controller {

    public static Form<Author> regForm = Form.form(Author.class);

    public static Result registration(){
        return ok(views.html.registration.render(regForm));
    }

    public static Result registrationFinish(){
        Form<Author> fa = regForm.bindFromRequest();
        if(fa.hasErrors()){
            flash("errors", "All field is required !!");
            return badRequest(views.html.registration.render(regForm));
        }else{
            //handling file
            Http.MultipartFormData body = request().body().asMultipartFormData();
            Http.MultipartFormData.FilePart filePart = body.getFile("picture");

            if(filePart != null){
                Long timeNow = System.currentTimeMillis();
                String fileName = filePart.getFilename();
                File file = filePart.getFile();
                String newName = timeNow+"_"+fa.get().getAuthorName();
                File destination = new File("public/author_file/"+newName+"/"+newName+".jpg");
                String pictureLocation = "author_file/"+newName+"/"+newName+".jpg";

                try{
                    if(!destination.exists()){
                        file.mkdir();
                        FileUtils.moveFile(file, destination);
                    }else{
                        FileUtils.moveFile(file, destination);
                    }
                }catch (Exception ex){
                    System.out.println("Error upload.."+ex.getMessage());
                }

                Author a = new Author();
                a.setAuthorName(fa.get().getAuthorName());
                a.setEmail(fa.get().getEmail());
                a.setWebsite(fa.get().getWebsite());
                a.setPassword(fa.get().getPassword());
                a.setPictureLocation(pictureLocation);
                a.save();
                return redirect(routes.Application.login());
            }else{
                flash("errors", "All field is required !!");
                return badRequest(views.html.registration.render(regForm));
            }
        }
    }

}
