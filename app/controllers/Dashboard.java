package controllers;

import models.Author;
import models.Post;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

import java.util.List;

/**
 * Created by WURI on 23/02/2016.
 */
public class Dashboard extends Controller {

    @Security.Authenticated(Secured.class)
    public static Result index(){
        Author a = Author.findByEmail(request().username());
        List<Post> posts = Post.findByAuthor(a);
        return ok(views.html.dashboard.render(posts, a));
    }

}
