// @SOURCE:/home/sas/dev/apps/RestOpenGov/PlayBafici/conf/routes
// @HASH:ea7ee6b49a59abfa8153efe899cf692e7c5aac2a
// @DATE:Sat May 12 11:53:31 ART 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Films_home0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_Films_list1 = Route("GET", PathPattern(List(StaticPart("/films"))))
                    

// @LINE:8
val controllers_Films_show2 = Route("GET", PathPattern(List(StaticPart("/film/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:10
val controllers_Films_test3 = Route("GET", PathPattern(List(StaticPart("/test"))))
                    

// @LINE:13
val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Films.home"""),("""GET""","""/films""","""controllers.Films.list(page:Long ?= 1, sort:String ?= "", filter:String ?= "", year:String ?= "2012")"""),("""GET""","""/film/$id<[^/]+>""","""controllers.Films.show(id:String)"""),("""GET""","""/test""","""controllers.Films.test"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Films_home0(params) => {
   call { 
        invokeHandler(_root_.controllers.Films.home, HandlerDef(this, "controllers.Films", "home", Nil))
   }
}
                    

// @LINE:7
case controllers_Films_list1(params) => {
   call(params.fromQuery[Long]("page", Some(1)), params.fromQuery[String]("sort", Some("")), params.fromQuery[String]("filter", Some("")), params.fromQuery[String]("year", Some("2012"))) { (page, sort, filter, year) =>
        invokeHandler(_root_.controllers.Films.list(page, sort, filter, year), HandlerDef(this, "controllers.Films", "list", Seq(classOf[Long], classOf[String], classOf[String], classOf[String])))
   }
}
                    

// @LINE:8
case controllers_Films_show2(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Films.show(id), HandlerDef(this, "controllers.Films", "show", Seq(classOf[String])))
   }
}
                    

// @LINE:10
case controllers_Films_test3(params) => {
   call { 
        invokeHandler(_root_.controllers.Films.test, HandlerDef(this, "controllers.Films", "test", Nil))
   }
}
                    

// @LINE:13
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                