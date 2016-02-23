package controllers;

import models.Post;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render(Post.find.orderBy("postingDate DESC").findList()));
    }

}
