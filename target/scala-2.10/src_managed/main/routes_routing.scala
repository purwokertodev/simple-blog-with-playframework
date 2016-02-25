// @SOURCE:E:/JIMAT/play-project/user_management/conf/routes
// @HASH:85f5e4bb9f830bad2de830ab115f9f7a9359a2f6
// @DATE:Thu Feb 25 16:01:08 ICT 2016


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
        

// @LINE:7
private[this] lazy val controllers_Application_paging1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("page", """[^/]+""",true))))
        

// @LINE:10
private[this] lazy val controllers_Assets_at2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:12
private[this] lazy val controllers_Application_login3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/login"))))
        

// @LINE:13
private[this] lazy val controllers_Application_logout4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/logout"))))
        

// @LINE:14
private[this] lazy val controllers_Application_authenticate5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/authenticate"))))
        

// @LINE:15
private[this] lazy val controllers_Application_authorProfile6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/author_detail/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:17
private[this] lazy val controllers_Registration_registration7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/registration"))))
        

// @LINE:18
private[this] lazy val controllers_Registration_registrationFinish8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/registration_finish"))))
        

// @LINE:19
private[this] lazy val controllers_Dashboard_index9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/my_dashboard"))))
        

// @LINE:20
private[this] lazy val controllers_Dashboard_myProfile10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/my_profile"))))
        

// @LINE:21
private[this] lazy val controllers_Dashboard_newPost11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/newpost"))))
        

// @LINE:22
private[this] lazy val controllers_Dashboard_newPostFinish12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/newpost_finish"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$page<[^/]+>""","""controllers.Application.paging(page:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/logout""","""controllers.Application.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/authenticate""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/author_detail/$id<[^/]+>""","""controllers.Application.authorProfile(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/registration""","""controllers.Registration.registration()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/registration_finish""","""controllers.Registration.registrationFinish()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/my_dashboard""","""controllers.Dashboard.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/my_profile""","""controllers.Dashboard.myProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/newpost""","""controllers.Dashboard.newPost()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/newpost_finish""","""controllers.Dashboard.newPostFinish()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:7
case controllers_Application_paging1(params) => {
   call(params.fromPath[Integer]("page", None)) { (page) =>
        invokeHandler(controllers.Application.paging(page), HandlerDef(this, "controllers.Application", "paging", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """$page<[^/]+>"""))
   }
}
        

// @LINE:10
case controllers_Assets_at2(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:12
case controllers_Application_login3(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """play/login"""))
   }
}
        

// @LINE:13
case controllers_Application_logout4(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """play/logout"""))
   }
}
        

// @LINE:14
case controllers_Application_authenticate5(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """play/authenticate"""))
   }
}
        

// @LINE:15
case controllers_Application_authorProfile6(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.Application.authorProfile(id), HandlerDef(this, "controllers.Application", "authorProfile", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """play/author_detail/$id<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_Registration_registration7(params) => {
   call { 
        invokeHandler(controllers.Registration.registration(), HandlerDef(this, "controllers.Registration", "registration", Nil,"GET", """ GET /public/*path 				controllers.Application.getAuthorPicture(path)""", Routes.prefix + """play/registration"""))
   }
}
        

// @LINE:18
case controllers_Registration_registrationFinish8(params) => {
   call { 
        invokeHandler(controllers.Registration.registrationFinish(), HandlerDef(this, "controllers.Registration", "registrationFinish", Nil,"POST", """""", Routes.prefix + """play/registration_finish"""))
   }
}
        

// @LINE:19
case controllers_Dashboard_index9(params) => {
   call { 
        invokeHandler(controllers.Dashboard.index(), HandlerDef(this, "controllers.Dashboard", "index", Nil,"GET", """""", Routes.prefix + """play/my_dashboard"""))
   }
}
        

// @LINE:20
case controllers_Dashboard_myProfile10(params) => {
   call { 
        invokeHandler(controllers.Dashboard.myProfile(), HandlerDef(this, "controllers.Dashboard", "myProfile", Nil,"GET", """""", Routes.prefix + """play/my_profile"""))
   }
}
        

// @LINE:21
case controllers_Dashboard_newPost11(params) => {
   call { 
        invokeHandler(controllers.Dashboard.newPost(), HandlerDef(this, "controllers.Dashboard", "newPost", Nil,"GET", """""", Routes.prefix + """play/newpost"""))
   }
}
        

// @LINE:22
case controllers_Dashboard_newPostFinish12(params) => {
   call { 
        invokeHandler(controllers.Dashboard.newPostFinish(), HandlerDef(this, "controllers.Dashboard", "newPostFinish", Nil,"POST", """""", Routes.prefix + """play/newpost_finish"""))
   }
}
        
}

}
     