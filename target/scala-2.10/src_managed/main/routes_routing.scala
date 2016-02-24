// @SOURCE:E:/JIMAT/play-project/user_management/conf/routes
// @HASH:27ee16a10d8d7868cfab46fa5cc5834ed3569a96
// @DATE:Wed Feb 24 16:28:42 ICT 2016


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
private[this] lazy val controllers_Application_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login.htm"))))
        

// @LINE:12
private[this] lazy val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout.htm"))))
        

// @LINE:13
private[this] lazy val controllers_Application_authenticate4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("authenticate.htm"))))
        

// @LINE:14
private[this] lazy val controllers_Registration_registration5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registration.htm"))))
        

// @LINE:15
private[this] lazy val controllers_Registration_registrationFinish6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("registration_finish.htm"))))
        

// @LINE:16
private[this] lazy val controllers_Dashboard_index7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("my_dashboard.htm"))))
        

// @LINE:17
private[this] lazy val controllers_Dashboard_myProfile8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("my_profile.htm"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login.htm""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout.htm""","""controllers.Application.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """authenticate.htm""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registration.htm""","""controllers.Registration.registration()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """registration_finish.htm""","""controllers.Registration.registrationFinish()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """my_dashboard.htm""","""controllers.Dashboard.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """my_profile.htm""","""controllers.Dashboard.myProfile()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login.htm"""))
   }
}
        

// @LINE:12
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout.htm"""))
   }
}
        

// @LINE:13
case controllers_Application_authenticate4(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """authenticate.htm"""))
   }
}
        

// @LINE:14
case controllers_Registration_registration5(params) => {
   call { 
        invokeHandler(controllers.Registration.registration(), HandlerDef(this, "controllers.Registration", "registration", Nil,"GET", """""", Routes.prefix + """registration.htm"""))
   }
}
        

// @LINE:15
case controllers_Registration_registrationFinish6(params) => {
   call { 
        invokeHandler(controllers.Registration.registrationFinish(), HandlerDef(this, "controllers.Registration", "registrationFinish", Nil,"POST", """""", Routes.prefix + """registration_finish.htm"""))
   }
}
        

// @LINE:16
case controllers_Dashboard_index7(params) => {
   call { 
        invokeHandler(controllers.Dashboard.index(), HandlerDef(this, "controllers.Dashboard", "index", Nil,"GET", """""", Routes.prefix + """my_dashboard.htm"""))
   }
}
        

// @LINE:17
case controllers_Dashboard_myProfile8(params) => {
   call { 
        invokeHandler(controllers.Dashboard.myProfile(), HandlerDef(this, "controllers.Dashboard", "myProfile", Nil,"GET", """""", Routes.prefix + """my_profile.htm"""))
   }
}
        
}

}
     