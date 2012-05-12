// @SOURCE:/home/sas/dev/apps/RestOpenGov/PlayBafici/conf/routes
// @HASH:0176c5862fad3e9489a6aee7d216df8bd57a817c
// @DATE:Sat May 12 17:40:41 ART 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Films_home0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_Films_filmsForGame1 = Route("GET", PathPattern(List(StaticPart("/game"))))
                    

// @LINE:8
val controllers_Films_filmsForGame2 = Route("GET", PathPattern(List(StaticPart("/game/"),DynamicPart("points", """[^/]+"""))))
                    

// @LINE:12
val controllers_Assets_at3 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Films.home"""),("""GET""","""/game""","""controllers.Films.filmsForGame(points:Int = 0)"""),("""GET""","""/game/$points<[^/]+>""","""controllers.Films.filmsForGame(points:Int)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Films_home0(params) => {
   call { 
        invokeHandler(_root_.controllers.Films.home, HandlerDef(this, "controllers.Films", "home", Nil))
   }
}
                    

// @LINE:7
case controllers_Films_filmsForGame1(params) => {
   call(Param[Int]("points", Right(0))) { (points) =>
        invokeHandler(_root_.controllers.Films.filmsForGame(points), HandlerDef(this, "controllers.Films", "filmsForGame", Seq(classOf[Int])))
   }
}
                    

// @LINE:8
case controllers_Films_filmsForGame2(params) => {
   call(params.fromPath[Int]("points", None)) { (points) =>
        invokeHandler(_root_.controllers.Films.filmsForGame(points), HandlerDef(this, "controllers.Films", "filmsForGame", Seq(classOf[Int])))
   }
}
                    

// @LINE:12
case controllers_Assets_at3(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                