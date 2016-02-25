// @SOURCE:E:/JIMAT/play-project/user_management/conf/routes
// @HASH:941ab40526a4503d31db99447ee449f8dded63df
// @DATE:Thu Feb 25 10:47:32 ICT 2016


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:11
private[this] lazy val controllers_Application_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:12
private[this] lazy val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:13
private[this] lazy val controllers_Application_authenticate4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate"))))
        

// @LINE:14
private[this] lazy val controllers_Application_authorProfile5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("author_detail/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:16
private[this] lazy val controllers_Registration_registration6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registration"))))
        

// @LINE:17
private[this] lazy val controllers_Registration_registrationFinish7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registration_finish"))))
        

// @LINE:18
private[this] lazy val controllers_Dashboard_index8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("my_dashboard"))))
        

// @LINE:19
private[this] lazy val controllers_Dashboard_myProfile9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("my_profile"))))
        

// @LINE:20
private[this] lazy val controllers_Dashboard_newPost10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newpost"))))
        

// @LINE:21
private[this] lazy val controllers_Dashboard_newPostFinish11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("newpost_finish"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """author_detail/$id<[^/]+>""","""controllers.Application.authorProfile(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registration""","""controllers.Registration.registration()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registration_finish""","""controllers.Registration.registrationFinish()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """my_dashboard""","""controllers.Dashboard.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """my_profile""","""controllers.Dashboard.myProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newpost""","""controllers.Dashboard.newPost()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """newpost_finish""","""controllers.Dashboard.newPostFinish()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:11
case controllers_Application_login2(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:12
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:13
case controllers_Application_authenticate4(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """authenticate"""))
   }
}
        

// @LINE:14
case controllers_Application_authorProfile5(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.Application.authorProfile(id), HandlerDef(this, "controllers.Application", "authorProfile", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """author_detail/$id<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_Registration_registration6(params) => {
   call { 
        invokeHandler(controllers.Registration.registration(), HandlerDef(this, "controllers.Registration", "registration", Nil,"GET", """ GET /public/*path 				controllers.Application.getAuthorPicture(path)""", Routes.prefix + """registration"""))
   }
}
        

// @LINE:17
case controllers_Registration_registrationFinish7(params) => {
   call { 
        invokeHandler(controllers.Registration.registrationFinish(), HandlerDef(this, "controllers.Registration", "registrationFinish", Nil,"POST", """""", Routes.prefix + """registration_finish"""))
   }
}
        

// @LINE:18
case controllers_Dashboard_index8(params) => {
   call { 
        invokeHandler(controllers.Dashboard.index(), HandlerDef(this, "controllers.Dashboard", "index", Nil,"GET", """""", Routes.prefix + """my_dashboard"""))
   }
}
        

// @LINE:19
case controllers_Dashboard_myProfile9(params) => {
   call { 
        invokeHandler(controllers.Dashboard.myProfile(), HandlerDef(this, "controllers.Dashboard", "myProfile", Nil,"GET", """""", Routes.prefix + """my_profile"""))
   }
}
        

// @LINE:20
case controllers_Dashboard_newPost10(params) => {
   call { 
        invokeHandler(controllers.Dashboard.newPost(), HandlerDef(this, "controllers.Dashboard", "newPost", Nil,"GET", """""", Routes.prefix + """newpost"""))
   }
}
        

// @LINE:21
case controllers_Dashboard_newPostFinish11(params) => {
   call { 
        invokeHandler(controllers.Dashboard.newPostFinish(), HandlerDef(this, "controllers.Dashboard", "newPostFinish", Nil,"POST", """""", Routes.prefix + """newpost_finish"""))
   }
}
        
}

}
     