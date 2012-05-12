// @SOURCE:/home/sas/dev/apps/RestOpenGov/PlayBafici/conf/routes
// @HASH:ea7ee6b49a59abfa8153efe899cf692e7c5aac2a
// @DATE:Sat May 12 11:53:31 ART 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseFilms {
    


 
// @LINE:7
def list(page:Long = 1, sort:String = "", filter:String = "", year:String = "2012") = {
   Call("GET", "/films" + queryString(List(if(page == 1) None else Some(implicitly[QueryStringBindable[Long]].unbind("page", page)), if(sort == "") None else Some(implicitly[QueryStringBindable[String]].unbind("sort", sort)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)), if(year == "2012") None else Some(implicitly[QueryStringBindable[String]].unbind("year", year)))))
}
                                                        
 
// @LINE:10
def test() = {
   Call("GET", "/test")
}
                                                        
 
// @LINE:8
def show(id:String) = {
   Call("GET", "/film/" + implicitly[PathBindable[String]].unbind("id", id))
}
                                                        
 
// @LINE:6
def home() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:13
class ReverseAssets {
    


 
// @LINE:13
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseFilms {
    


 
// @LINE:7
def list = JavascriptReverseRoute(
   "controllers.Films.list",
   """
      function(page,sort,filter,year) {
      return _wA({method:"GET", url:"/films" + _qS([(page == """ +  implicitly[JavascriptLitteral[Long]].to(1) + """ ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("page", page)), (sort == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("sort", sort)), (filter == """ +  implicitly[JavascriptLitteral[String]].to("") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter)), (year == """ +  implicitly[JavascriptLitteral[String]].to("2012") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("year", year))])})
      }
   """
)
                                                        
 
// @LINE:10
def test = JavascriptReverseRoute(
   "controllers.Films.test",
   """
      function() {
      return _wA({method:"GET", url:"/test"})
      }
   """
)
                                                        
 
// @LINE:8
def show = JavascriptReverseRoute(
   "controllers.Films.show",
   """
      function(id) {
      return _wA({method:"GET", url:"/film/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:6
def home = JavascriptReverseRoute(
   "controllers.Films.home",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:13
class ReverseAssets {
    


 
// @LINE:13
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:13
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseFilms {
    


 
// @LINE:7
def list(page:Long, sort:String, filter:String, year:String) = new play.api.mvc.HandlerRef(
   controllers.Films.list(page, sort, filter, year), HandlerDef(this, "controllers.Films", "list", Seq(classOf[Long], classOf[String], classOf[String], classOf[String]))
)
                              
 
// @LINE:10
def test() = new play.api.mvc.HandlerRef(
   controllers.Films.test(), HandlerDef(this, "controllers.Films", "test", Seq())
)
                              
 
// @LINE:8
def show(id:String) = new play.api.mvc.HandlerRef(
   controllers.Films.show(id), HandlerDef(this, "controllers.Films", "show", Seq(classOf[String]))
)
                              
 
// @LINE:6
def home() = new play.api.mvc.HandlerRef(
   controllers.Films.home(), HandlerDef(this, "controllers.Films", "home", Seq())
)
                              

                      
    
}
                            

// @LINE:13
class ReverseAssets {
    


 
// @LINE:13
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                