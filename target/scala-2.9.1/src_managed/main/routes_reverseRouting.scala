// @SOURCE:/home/sas/dev/apps/RestOpenGov/PlayBafici/conf/routes
// @HASH:0176c5862fad3e9489a6aee7d216df8bd57a817c
// @DATE:Sat May 12 18:43:15 ART 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseFilms {
    


 
// @LINE:8
// @LINE:7
def filmsForGame(points:Int) = {
   (points) match {
// @LINE:7
case (points) if points == 0 => Call("GET", "/game")
                                                                
// @LINE:8
case (points) if true => Call("GET", "/game/" + implicitly[PathBindable[Int]].unbind("points", points))
                                                                    
   }
}
                                                        
 
// @LINE:6
def home() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseFilms {
    


 
// @LINE:8
// @LINE:7
def filmsForGame = JavascriptReverseRoute(
   "controllers.Films.filmsForGame",
   """
      function(points) {
      if (points == """ + implicitly[JavascriptLitteral[Int]].to(0) + """) {
      return _wA({method:"GET", url:"/game"})
      }
      if (true) {
      return _wA({method:"GET", url:"/game/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("points", points)})
      }
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
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
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
                    


// @LINE:12
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:8
// @LINE:7
// @LINE:6
class ReverseFilms {
    


 
// @LINE:7
def filmsForGame(points:Int) = new play.api.mvc.HandlerRef(
   controllers.Films.filmsForGame(points), HandlerDef(this, "controllers.Films", "filmsForGame", Seq(classOf[Int]))
)
                              
 
// @LINE:6
def home() = new play.api.mvc.HandlerRef(
   controllers.Films.home(), HandlerDef(this, "controllers.Films", "home", Seq())
)
                              

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                