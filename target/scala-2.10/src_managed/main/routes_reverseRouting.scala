// @SOURCE:E:/JIMAT/play-project/user_management/conf/routes
// @HASH:77ccd72c6ccdb978bf3af724e02808813498036c
// @DATE:Wed Feb 24 20:52:06 ICT 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:15
// @LINE:14
class ReverseRegistration {
    

// @LINE:14
def registration(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "registration.html")
}
                                                

// @LINE:15
def registrationFinish(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "registration_finish.html")
}
                                                
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseDashboard {
    

// @LINE:19
def newPostFinish(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "newpost_finish.html")
}
                                                

// @LINE:18
def newPost(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "newpost.html")
}
                                                

// @LINE:16
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "my_dashboard.html")
}
                                                

// @LINE:17
def myProfile(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "my_profile.html")
}
                                                
    
}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout.html")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:13
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "authenticate.html")
}
                                                

// @LINE:11
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login.html")
}
                                                
    
}
                          
}
                  


// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:15
// @LINE:14
class ReverseRegistration {
    

// @LINE:14
def registration : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Registration.registration",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "registration.html"})
      }
   """
)
                        

// @LINE:15
def registrationFinish : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Registration.registrationFinish",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registration_finish.html"})
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
              

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseDashboard {
    

// @LINE:19
def newPostFinish : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.newPostFinish",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "newpost_finish.html"})
      }
   """
)
                        

// @LINE:18
def newPost : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.newPost",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newpost.html"})
      }
   """
)
                        

// @LINE:16
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "my_dashboard.html"})
      }
   """
)
                        

// @LINE:17
def myProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Dashboard.myProfile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "my_profile.html"})
      }
   """
)
                        
    
}
              

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
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout.html"})
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
                        

// @LINE:13
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate.html"})
      }
   """
)
                        

// @LINE:11
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login.html"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:15
// @LINE:14
class ReverseRegistration {
    

// @LINE:14
def registration(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Registration.registration(), HandlerDef(this, "controllers.Registration", "registration", Seq(), "GET", """""", _prefix + """registration.html""")
)
                      

// @LINE:15
def registrationFinish(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Registration.registrationFinish(), HandlerDef(this, "controllers.Registration", "registrationFinish", Seq(), "POST", """""", _prefix + """registration_finish.html""")
)
                      
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
class ReverseDashboard {
    

// @LINE:19
def newPostFinish(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.newPostFinish(), HandlerDef(this, "controllers.Dashboard", "newPostFinish", Seq(), "POST", """""", _prefix + """newpost_finish.html""")
)
                      

// @LINE:18
def newPost(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.newPost(), HandlerDef(this, "controllers.Dashboard", "newPost", Seq(), "GET", """""", _prefix + """newpost.html""")
)
                      

// @LINE:16
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.index(), HandlerDef(this, "controllers.Dashboard", "index", Seq(), "GET", """""", _prefix + """my_dashboard.html""")
)
                      

// @LINE:17
def myProfile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Dashboard.myProfile(), HandlerDef(this, "controllers.Dashboard", "myProfile", Seq(), "GET", """""", _prefix + """my_profile.html""")
)
                      
    
}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout.html""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:13
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """authenticate.html""")
)
                      

// @LINE:11
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login.html""")
)
                      
    
}
                          
}
        
    