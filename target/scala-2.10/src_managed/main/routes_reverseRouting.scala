// @SOURCE:E:/JIMAT/play-project/user_management/conf/routes
// @HASH:941ab40526a4503d31db99447ee449f8dded63df
// @DATE:Thu Feb 25 10:47:32 ICT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:17
// @LINE:16
class ReverseRegistration {
    

// @LINE:16
def registration(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "registration")
}
                                                

// @LINE:17
def registrationFinish(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registration_finish")
}
                                                
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseDashboard {
    

// @LINE:21
def newPostFinish(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "newpost_finish")
}
                                                

// @LINE:20
def newPost(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newpost")
}
                                                

// @LINE:18
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "my_dashboard")
}
                                                

// @LINE:19
def myProfile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "my_profile")
}
                                                
    
}
                          

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:14
def authorProfile(id:Integer): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "author_detail/" + implicitly[PathBindable[Integer]].unbind("id", id))
}
                                                

// @LINE:13
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "authenticate")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:11
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:17
// @LINE:16
class ReverseRegistration {
    

// @LINE:16
def registration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Registration.registration",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registration"})
      }
   """
)
                        

// @LINE:17
def registrationFinish : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Registration.registrationFinish",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registration_finish"})
      }
   """
)
                        
    
}
              

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseDashboard {
    

// @LINE:21
def newPostFinish : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.newPostFinish",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newpost_finish"})
      }
   """
)
                        

// @LINE:20
def newPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.newPost",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newpost"})
      }
   """
)
                        

// @LINE:18
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "my_dashboard"})
      }
   """
)
                        

// @LINE:19
def myProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.myProfile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "my_profile"})
      }
   """
)
                        
    
}
              

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:14
def authorProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authorProfile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "author_detail/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:13
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
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
                        

// @LINE:11
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:17
// @LINE:16
class ReverseRegistration {
    

// @LINE:16
def registration(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Registration.registration(), HandlerDef(this, "controllers.Registration", "registration", Seq(), "GET", """ GET /public/*path 				controllers.Application.getAuthorPicture(path)""", _prefix + """registration""")
)
                      

// @LINE:17
def registrationFinish(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Registration.registrationFinish(), HandlerDef(this, "controllers.Registration", "registrationFinish", Seq(), "POST", """""", _prefix + """registration_finish""")
)
                      
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
class ReverseDashboard {
    

// @LINE:21
def newPostFinish(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.newPostFinish(), HandlerDef(this, "controllers.Dashboard", "newPostFinish", Seq(), "POST", """""", _prefix + """newpost_finish""")
)
                      

// @LINE:20
def newPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.newPost(), HandlerDef(this, "controllers.Dashboard", "newPost", Seq(), "GET", """""", _prefix + """newpost""")
)
                      

// @LINE:18
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.index(), HandlerDef(this, "controllers.Dashboard", "index", Seq(), "GET", """""", _prefix + """my_dashboard""")
)
                      

// @LINE:19
def myProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.myProfile(), HandlerDef(this, "controllers.Dashboard", "myProfile", Seq(), "GET", """""", _prefix + """my_profile""")
)
                      
    
}
                          

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:14
def authorProfile(id:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authorProfile(id), HandlerDef(this, "controllers.Application", "authorProfile", Seq(classOf[Integer]), "GET", """""", _prefix + """author_detail/$id<[^/]+>""")
)
                      

// @LINE:13
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """authenticate""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:11
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    