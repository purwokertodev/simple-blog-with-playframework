// @SOURCE:E:/JIMAT/play-project/user_management/conf/routes
// @HASH:7c2b1fc8b7b467fb587c1be91231d79e9de716c4
// @DATE:Mon Feb 29 10:59:29 ICT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:20
// @LINE:19
class ReverseRegistration {
    

// @LINE:19
def registration(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "play/registration")
}
                                                

// @LINE:20
def registrationFinish(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "play/registration_finish")
}
                                                
    
}
                          

// @LINE:10
class ReverseAssets {
    

// @LINE:10
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseDashboard {
    

// @LINE:22
def pagingDashboard(page:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "play/my_dashboard/" + implicitly[PathBindable[Integer]].unbind("page", page))
}
                                                

// @LINE:23
def myProfile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "play/my_profile")
}
                                                

// @LINE:25
def newPostFinish(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "play/newpost_finish")
}
                                                

// @LINE:24
def newPost(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "play/newpost")
}
                                                

// @LINE:21
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "play/my_dashboard")
}
                                                
    
}
                          

// @LINE:29
// @LINE:28
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:28
def allPostJson(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/all_post_json")
}
                                                

// @LINE:29
def onePostJson(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "api/one_post_json/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:17
def addCommentFinish(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "play/add_comment")
}
                                                

// @LINE:16
def postDetail(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "play/post_detail/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:13
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "play/logout")
}
                                                

// @LINE:15
def authorProfile(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "play/author_detail/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:7
def paging(page:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[Integer]].unbind("page", page))
}
                                                

// @LINE:14
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "play/authenticate")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:12
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "play/login")
}
                                                
    
}
                          
}
                  


// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:20
// @LINE:19
class ReverseRegistration {
    

// @LINE:19
def registration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Registration.registration",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/registration"})
      }
   """
)
                        

// @LINE:20
def registrationFinish : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Registration.registrationFinish",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "play/registration_finish"})
      }
   """
)
                        
    
}
              

// @LINE:10
class ReverseAssets {
    

// @LINE:10
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseDashboard {
    

// @LINE:22
def pagingDashboard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.pagingDashboard",
   """
      function(page) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/my_dashboard/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("page", page)})
      }
   """
)
                        

// @LINE:23
def myProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.myProfile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/my_profile"})
      }
   """
)
                        

// @LINE:25
def newPostFinish : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.newPostFinish",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "play/newpost_finish"})
      }
   """
)
                        

// @LINE:24
def newPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.newPost",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/newpost"})
      }
   """
)
                        

// @LINE:21
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/my_dashboard"})
      }
   """
)
                        
    
}
              

// @LINE:29
// @LINE:28
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:28
def allPostJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.allPostJson",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/all_post_json"})
      }
   """
)
                        

// @LINE:29
def onePostJson : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.onePostJson",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/one_post_json/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:17
def addCommentFinish : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addCommentFinish",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "play/add_comment"})
      }
   """
)
                        

// @LINE:16
def postDetail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postDetail",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/post_detail/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:13
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/logout"})
      }
   """
)
                        

// @LINE:15
def authorProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authorProfile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/author_detail/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:7
def paging : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.paging",
   """
      function(page) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("page", page)})
      }
   """
)
                        

// @LINE:14
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "play/authenticate"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:12
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:29
// @LINE:28
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:20
// @LINE:19
class ReverseRegistration {
    

// @LINE:19
def registration(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Registration.registration(), HandlerDef(this, "controllers.Registration", "registration", Seq(), "GET", """ GET 	/public/*path 				     	 controllers.Application.getAuthorPicture(path)""", _prefix + """play/registration""")
)
                      

// @LINE:20
def registrationFinish(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Registration.registrationFinish(), HandlerDef(this, "controllers.Registration", "registrationFinish", Seq(), "POST", """""", _prefix + """play/registration_finish""")
)
                      
    
}
                          

// @LINE:10
class ReverseAssets {
    

// @LINE:10
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseDashboard {
    

// @LINE:22
def pagingDashboard(page:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.pagingDashboard(page), HandlerDef(this, "controllers.Dashboard", "pagingDashboard", Seq(classOf[Integer]), "GET", """""", _prefix + """play/my_dashboard/$page<[^/]+>""")
)
                      

// @LINE:23
def myProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.myProfile(), HandlerDef(this, "controllers.Dashboard", "myProfile", Seq(), "GET", """""", _prefix + """play/my_profile""")
)
                      

// @LINE:25
def newPostFinish(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.newPostFinish(), HandlerDef(this, "controllers.Dashboard", "newPostFinish", Seq(), "POST", """""", _prefix + """play/newpost_finish""")
)
                      

// @LINE:24
def newPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.newPost(), HandlerDef(this, "controllers.Dashboard", "newPost", Seq(), "GET", """""", _prefix + """play/newpost""")
)
                      

// @LINE:21
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.index(), HandlerDef(this, "controllers.Dashboard", "index", Seq(), "GET", """""", _prefix + """play/my_dashboard""")
)
                      
    
}
                          

// @LINE:29
// @LINE:28
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:28
def allPostJson(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.allPostJson(), HandlerDef(this, "controllers.Application", "allPostJson", Seq(), "GET", """JSON""", _prefix + """api/all_post_json""")
)
                      

// @LINE:29
def onePostJson(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.onePostJson(id), HandlerDef(this, "controllers.Application", "onePostJson", Seq(classOf[Integer]), "GET", """""", _prefix + """api/one_post_json/$id<[^/]+>""")
)
                      

// @LINE:17
def addCommentFinish(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addCommentFinish(), HandlerDef(this, "controllers.Application", "addCommentFinish", Seq(), "POST", """""", _prefix + """play/add_comment""")
)
                      

// @LINE:16
def postDetail(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postDetail(id), HandlerDef(this, "controllers.Application", "postDetail", Seq(classOf[Integer]), "GET", """""", _prefix + """play/post_detail/$id<[^/]+>""")
)
                      

// @LINE:13
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """play/logout""")
)
                      

// @LINE:15
def authorProfile(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authorProfile(id), HandlerDef(this, "controllers.Application", "authorProfile", Seq(classOf[Integer]), "GET", """""", _prefix + """play/author_detail/$id<[^/]+>""")
)
                      

// @LINE:7
def paging(page:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.paging(page), HandlerDef(this, "controllers.Application", "paging", Seq(classOf[Integer]), "GET", """""", _prefix + """$page<[^/]+>""")
)
                      

// @LINE:14
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """play/authenticate""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:12
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """play/login""")
)
                      
    
}
                          
}
        
    