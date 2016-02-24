package controllers;

import models.Author;
import models.Post;
import play.data.Form;
import play.mvc.*;


public class Application extends Controller {

    public static Form<Login> loginForm = Form.form(Login.class);

    public static Result index() {
        return ok(views.html.index.render(Post.find.orderBy("postingDate DESC").findList()));
    }

    public static Result login(){
        return ok(views.html.login.render(loginForm));
    }

    public static Result logout(){
        session().clear();
        flash("success", "You've been logged out..");
        return redirect(routes.Application.login());
    }

    public static Result authenticate(){
        Form<Login> lf = loginForm.bindFromRequest();
        if(lf.hasErrors()){
            return badRequest(views.html.login.render(loginForm));
        }else {
            session().clear();
            session("email", lf.get().getEmail());
            return redirect(routes.Dashboard.index());
        }
    }

    public static class Login{
        private String email;
        private String password;

        public String validate(){
            if(Author.authenticate(getEmail(), getPassword()) == null){
                return "Invalid email or password !!";
            }
            return null;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

}
