package models;

import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

/**
 * Created by WURI on 23/02/2016.
 */
public class Secured extends Security.Authenticator {

    @Override
    public String getUsername(Http.Context ctx) {
        return ctx.session().get("email");
    }

    @Override
    public Result onUnauthorized(Http.Context ctx) {
        return redirect(routers.Application.login());
    }
}
