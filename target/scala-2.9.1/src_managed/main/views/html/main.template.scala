
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
  <head>
    <title>"""),_display_(Seq[Any](/*7.13*/title)),format.raw/*7.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="apple-mobile-web-app-capable" content="yes" /> 
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.50*/routes/*10.56*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*10.95*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.50*/routes/*11.56*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*11.106*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.50*/routes/*12.56*/.Assets.at("stylesheets/main.css"))),format.raw/*12.90*/("""">
    <link href=""""),_display_(Seq[Any](/*13.18*/routes/*13.24*/.Assets.at("stylesheets/docs.css"))),format.raw/*13.58*/("""" rel="stylesheet">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*14.55*/routes/*14.61*/.Assets.at("images/favicon.png"))),format.raw/*14.93*/("""">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <script src=""""),_display_(Seq[Any](/*17.19*/routes/*17.25*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*17.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*18.19*/routes/*18.25*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*18.67*/("""" type="text/javascript"></script>

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <link rel="shortcut icon" href="assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href=""""),_display_(Seq[Any](/*25.69*/routes/*25.75*/.Assets.at("ico/apple-touch-icon-144-precomposed.png"))),format.raw/*25.129*/("""">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href=""""),_display_(Seq[Any](/*26.69*/routes/*26.75*/.Assets.at("ico/apple-touch-icon-114-precomposed.png"))),format.raw/*26.129*/("""">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href=""""),_display_(Seq[Any](/*27.67*/routes/*27.73*/.Assets.at("ico/apple-touch-icon-72-precomposed.png"))),format.raw/*27.126*/("""">
    <link rel="apple-touch-icon-precomposed" href=""""),_display_(Seq[Any](/*28.53*/routes/*28.59*/.Assets.at("ico/apple-touch-icon-57-precomposed.png"))),format.raw/*28.112*/("""">
  </head>
  <body data-spy="scroll" data-target=".subnav" data-offset="50">
    <div class="container">
      <header class="jumbotron masthead">
        <div class="inner">
          <h1>Bafici</h1>
        </div>
      </header>
      <div class="container">
        """),_display_(Seq[Any](/*38.10*/content)),format.raw/*38.17*/("""
      </div>
    </div>
  </body>
</html>"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 12 17:40:45 ART 2012
                    SOURCE: /home/sas/dev/apps/RestOpenGov/PlayBafici/app/views/main.scala.html
                    HASH: 4b5729ecc57789ef7e64830204e2c35ca4b646fb
                    MATRIX: 509->1|616->31|698->78|724->83|957->280|972->286|1033->325|1121->377|1136->383|1209->433|1297->485|1312->491|1368->525|1424->545|1439->551|1495->585|1605->659|1620->665|1674->697|1898->885|1913->891|1980->936|2069->989|2084->995|2148->1037|2533->1386|2548->1392|2625->1446|2732->1517|2747->1523|2824->1577|2929->1646|2944->1652|3020->1705|3111->1760|3126->1766|3202->1819|3511->2092|3540->2099
                    LINES: 19->1|22->1|28->7|28->7|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13|35->14|35->14|35->14|38->17|38->17|38->17|39->18|39->18|39->18|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|49->28|49->28|49->28|59->38|59->38
                    -- GENERATED --
                */
            