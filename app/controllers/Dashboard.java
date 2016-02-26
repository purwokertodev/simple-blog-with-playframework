package controllers;

import models.Author;
import models.Post;
import play.mvc.Controller;
import play.data.Form;
import play.mvc.Result;
import play.mvc.Security;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by WURI on 23/02/2016.
 */
public class Dashboard extends Controller {

	public static Form<Post> postForm = Form.form(Post.class);

    @Security.Authenticated(Secured.class)
    public static Result index(){
		return pagingDashboard(1);
    }
	
	@Security.Authenticated(Secured.class)
	public static Result pagingDashboard(Integer page){
		Author a = Author.findByEmail(request().username());
		
		Integer banyakBaris = 2;
		Integer totalData = Post.find.where().eq("author", a).findRowCount();
		Integer totalHalaman = (int) Math.ceil(totalData.doubleValue() / banyakBaris.doubleValue());
		List<Post> listPost = Post.find.where().eq("author", a).orderBy("postingDate DESC").findPagingList(banyakBaris).getPage(page-1).getList();

		int current = page;
		int begin = Math.max(1, current - banyakBaris);
		int end = Math.min(begin + 4, totalHalaman);
		List<Integer> listNum = new ArrayList<>();
		for(int i=begin;i<end;i++){
			listNum.add(i);
		}
		return ok(views.html.dashboard.render(listPost, current, listNum,totalHalaman, totalData));
    }

    @Security.Authenticated(Secured.class)
    public static Result myProfile(){
        Author a = Author.findByEmail(request().username());
        return ok(views.html.profile.render(a));
    }
	
	@Security.Authenticated(Secured.class)
	public static Result newPost(){
		Author a = Author.findByEmail(request().username());
		return ok(views.html.post.render(postForm));
	}
	
	@Security.Authenticated(Secured.class)
	public static Result newPostFinish(){
		Form<Post> fp = postForm.bindFromRequest();
		if(fp.get().getPostTitle().equals("") && fp.get().getPostContent().equals("")){
            flash("errors", "All field is required !!");
            return badRequest(views.html.post.render(postForm));
        }else{
			Author a = Author.findByEmail(request().username());
			Post p = new Post();
			p.setAuthor(a);
			p.setPostingDate(new Date());
			p.setPostTitle(fp.get().getPostTitle());
			p.setPostContent(fp.get().getPostContent());
			p.save();
			flash("success", "Your new posts...");
			return redirect(routes.Dashboard.index());
		}
	}

}
