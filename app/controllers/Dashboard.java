package controllers;

import models.Post;
import models.Secured;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;

/**
 * Created by WURI on 23/02/2016.
 */
public class Dashboard extends Controller {

    @Security.Authenticated(Secured.class)
    public static Result index(){
        return ok(views.html.dashboard.render(Post.find.all()));
    }

}
