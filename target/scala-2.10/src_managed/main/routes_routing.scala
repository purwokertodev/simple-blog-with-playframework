// @SOURCE:E:/JIMAT/play-project/user_management/conf/routes
// @HASH:785cb3948cab6b229c7ca9be5fda4e8662e15b1f
// @DATE:Thu Mar 24 14:09:31 ICT 2016


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
        

// @LINE:16
private[this] lazy val controllers_Application_postDetail7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/post_detail/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:17
private[this] lazy val controllers_Application_addCommentFinish8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/add_comment"))))
        

// @LINE:19
private[this] lazy val controllers_Registration_registration9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/registration"))))
        

// @LINE:20
private[this] lazy val controllers_Registration_registrationFinish10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/registration_finish"))))
        

// @LINE:21
private[this] lazy val controllers_Dashboard_index11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/my_dashboard"))))
        

// @LINE:22
private[this] lazy val controllers_Dashboard_pagingDashboard12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/my_dashboard/"),DynamicPart("page", """[^/]+""",true))))
        

// @LINE:23
private[this] lazy val controllers_Dashboard_myProfile13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/my_profile"))))
        

// @LINE:24
private[this] lazy val controllers_Dashboard_newPost14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/newpost"))))
        

// @LINE:25
private[this] lazy val controllers_Dashboard_newPostFinish15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play/newpost_finish"))))
        

// @LINE:28
private[this] lazy val controllers_Application_allPostJson16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/all_post_json"))))
        

// @LINE:29
private[this] lazy val controllers_Application_onePostJson17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/one_post_json/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:30
private[this] lazy val controllers_Application_oneAuthorJson18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/one_author_json/"),DynamicPart("id", """[^/]+""",true))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$page<[^/]+>""","""controllers.Application.paging(page:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/logout""","""controllers.Application.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/authenticate""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/author_detail/$id<[^/]+>""","""controllers.Application.authorProfile(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/post_detail/$id<[^/]+>""","""controllers.Application.postDetail(id:Integer)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/add_comment""","""controllers.Application.addCommentFinish()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/registration""","""controllers.Registration.registration()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/registration_finish""","""controllers.Registration.registrationFinish()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/my_dashboard""","""controllers.Dashboard.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/my_dashboard/$page<[^/]+>""","""controllers.Dashboard.pagingDashboard(page:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/my_profile""","""controllers.Dashboard.myProfile()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/newpost""","""controllers.Dashboard.newPost()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play/newpost_finish""","""controllers.Dashboard.newPostFinish()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/all_post_json""","""controllers.Application.allPostJson()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/one_post_json/$id<[^/]+>""","""controllers.Application.onePostJson(id:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/one_author_json/$id<[^/]+>""","""controllers.Application.oneAuthorJson(id:Integer)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:16
case controllers_Application_postDetail7(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.Application.postDetail(id), HandlerDef(this, "controllers.Application", "postDetail", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """play/post_detail/$id<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_Application_addCommentFinish8(params) => {
   call { 
        invokeHandler(controllers.Application.addCommentFinish(), HandlerDef(this, "controllers.Application", "addCommentFinish", Nil,"POST", """""", Routes.prefix + """play/add_comment"""))
   }
}
        

// @LINE:19
case controllers_Registration_registration9(params) => {
   call { 
        invokeHandler(controllers.Registration.registration(), HandlerDef(this, "controllers.Registration", "registration", Nil,"GET", """ GET 	/public/*path 				     	 controllers.Application.getAuthorPicture(path)""", Routes.prefix + """play/registration"""))
   }
}
        

// @LINE:20
case controllers_Registration_registrationFinish10(params) => {
   call { 
        invokeHandler(controllers.Registration.registrationFinish(), HandlerDef(this, "controllers.Registration", "registrationFinish", Nil,"POST", """""", Routes.prefix + """play/registration_finish"""))
   }
}
        

// @LINE:21
case controllers_Dashboard_index11(params) => {
   call { 
        invokeHandler(controllers.Dashboard.index(), HandlerDef(this, "controllers.Dashboard", "index", Nil,"GET", """""", Routes.prefix + """play/my_dashboard"""))
   }
}
        

// @LINE:22
case controllers_Dashboard_pagingDashboard12(params) => {
   call(params.fromPath[Integer]("page", None)) { (page) =>
        invokeHandler(controllers.Dashboard.pagingDashboard(page), HandlerDef(this, "controllers.Dashboard", "pagingDashboard", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """play/my_dashboard/$page<[^/]+>"""))
   }
}
        

// @LINE:23
case controllers_Dashboard_myProfile13(params) => {
   call { 
        invokeHandler(controllers.Dashboard.myProfile(), HandlerDef(this, "controllers.Dashboard", "myProfile", Nil,"GET", """""", Routes.prefix + """play/my_profile"""))
   }
}
        

// @LINE:24
case controllers_Dashboard_newPost14(params) => {
   call { 
        invokeHandler(controllers.Dashboard.newPost(), HandlerDef(this, "controllers.Dashboard", "newPost", Nil,"GET", """""", Routes.prefix + """play/newpost"""))
   }
}
        

// @LINE:25
case controllers_Dashboard_newPostFinish15(params) => {
   call { 
        invokeHandler(controllers.Dashboard.newPostFinish(), HandlerDef(this, "controllers.Dashboard", "newPostFinish", Nil,"POST", """""", Routes.prefix + """play/newpost_finish"""))
   }
}
        

// @LINE:28
case controllers_Application_allPostJson16(params) => {
   call { 
        invokeHandler(controllers.Application.allPostJson(), HandlerDef(this, "controllers.Application", "allPostJson", Nil,"GET", """JSON""", Routes.prefix + """api/all_post_json"""))
   }
}
        

// @LINE:29
case controllers_Application_onePostJson17(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.Application.onePostJson(id), HandlerDef(this, "controllers.Application", "onePostJson", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """api/one_post_json/$id<[^/]+>"""))
   }
}
        

// @LINE:30
case controllers_Application_oneAuthorJson18(params) => {
   call(params.fromPath[Integer]("id", None)) { (id) =>
        invokeHandler(controllers.Application.oneAuthorJson(id), HandlerDef(this, "controllers.Application", "oneAuthorJson", Seq(classOf[Integer]),"GET", """""", Routes.prefix + """api/one_author_json/$id<[^/]+>"""))
   }
}
        
}

}
     