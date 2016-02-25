// @SOURCE:E:/JIMAT/play-project/user_management/conf/routes
// @HASH:85f5e4bb9f830bad2de830ab115f9f7a9359a2f6
// @DATE:Thu Feb 25 16:01:08 ICT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:18
// @LINE:17
class ReverseRegistration {
    

// @LINE:17
def registration(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "play/registration")
}
                                                

// @LINE:18
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
                          

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReverseDashboard {
    

// @LINE:22
def newPostFinish(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "play/newpost_finish")
}
                                                

// @LINE:21
def newPost(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "play/newpost")
}
                                                

// @LINE:19
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "play/my_dashboard")
}
                                                

// @LINE:20
def myProfile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "play/my_profile")
}
                                                
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:7
// @LINE:6
class ReverseApplication {
    

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
                  


// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:18
// @LINE:17
class ReverseRegistration {
    

// @LINE:17
def registration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Registration.registration",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/registration"})
      }
   """
)
                        

// @LINE:18
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
              

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReverseDashboard {
    

// @LINE:22
def newPostFinish : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.newPostFinish",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "play/newpost_finish"})
      }
   """
)
                        

// @LINE:21
def newPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.newPost",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/newpost"})
      }
   """
)
                        

// @LINE:19
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/my_dashboard"})
      }
   """
)
                        

// @LINE:20
def myProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.myProfile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play/my_profile"})
      }
   """
)
                        
    
}
              

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:7
// @LINE:6
class ReverseApplication {
    

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
        


// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:18
// @LINE:17
class ReverseRegistration {
    

// @LINE:17
def registration(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Registration.registration(), HandlerDef(this, "controllers.Registration", "registration", Seq(), "GET", """ GET /public/*path 				controllers.Application.getAuthorPicture(path)""", _prefix + """play/registration""")
)
                      

// @LINE:18
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
                          

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
class ReverseDashboard {
    

// @LINE:22
def newPostFinish(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.newPostFinish(), HandlerDef(this, "controllers.Dashboard", "newPostFinish", Seq(), "POST", """""", _prefix + """play/newpost_finish""")
)
                      

// @LINE:21
def newPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.newPost(), HandlerDef(this, "controllers.Dashboard", "newPost", Seq(), "GET", """""", _prefix + """play/newpost""")
)
                      

// @LINE:19
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.index(), HandlerDef(this, "controllers.Dashboard", "index", Seq(), "GET", """""", _prefix + """play/my_dashboard""")
)
                      

// @LINE:20
def myProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.myProfile(), HandlerDef(this, "controllers.Dashboard", "myProfile", Seq(), "GET", """""", _prefix + """play/my_profile""")
)
                      
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:7
// @LINE:6
class ReverseApplication {
    

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
        
    