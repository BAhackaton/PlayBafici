
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="es">
<head>
    <title>OpenBafici</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*5.50*/routes/*5.56*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*5.95*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.50*/routes/*6.56*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*6.106*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.50*/routes/*7.56*/.Assets.at("stylesheets/main.css"))),format.raw/*7.90*/("""">
    <link href='https://fonts.googleapis.com/css?family=Arvo:400,700' rel='stylesheet' type='text/css'>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.js"></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*12.42*/routes/*12.48*/.Assets.at("javascripts/RestOpenGov.js"))),format.raw/*12.88*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*13.42*/routes/*13.48*/.Assets.at("javascripts/intro.js"))),format.raw/*13.82*/(""""></script>
</head>
<body id="intro">
    <div id="title">
        <h1>Play Bafici</h1>
        <p>Adiviná el título de las películas del Festival de Cine de Buenos Aires en tu celular</p>
        <a href=""""),_display_(Seq[Any](/*19.19*/routes/*19.25*/.Films.filmsForGame(0))),format.raw/*19.47*/("""" class="btn btn-large visible-desktop btn-warning">Jugar Ya!</a>
        <a href=""""),_display_(Seq[Any](/*20.19*/routes/*20.25*/.Films.filmsForGame(0))),format.raw/*20.47*/("""" class="btn btn-large hidden-desktop btn-warning">Jugar Ya!</a>
    </div>
    <div id="screen" class="navbar-fixed-top"></div>
    <div id="container"></div>
</body>
</html>"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 12 17:40:45 ART 2012
                    SOURCE: /home/sas/dev/apps/RestOpenGov/PlayBafici/app/views/index.scala.html
                    HASH: ff5366c5cfb57132452b3c55bc3bf71e2570fe69
                    MATRIX: 569->0|723->119|737->125|797->164|884->216|898->222|970->272|1057->324|1071->330|1126->364|1567->769|1582->775|1644->815|1733->868|1748->874|1804->908|2047->1115|2062->1121|2106->1143|2226->1227|2241->1233|2285->1255
                    LINES: 22->1|26->5|26->5|26->5|27->6|27->6|27->6|28->7|28->7|28->7|33->12|33->12|33->12|34->13|34->13|34->13|40->19|40->19|40->19|41->20|41->20|41->20
                    -- GENERATED --
                */
            