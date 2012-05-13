
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
object test extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Seq[Film],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(films: Seq[Film]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

"""),_display_(Seq[Any](/*3.2*/main2("Open Bafici")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""<p></p>""")))}/*3.31*/{_display_(Seq[Any](format.raw/*3.32*/("""

  size: """),_display_(Seq[Any](/*5.10*/films/*5.15*/.size)),format.raw/*5.20*/("""

  <ul>
  """),_display_(Seq[Any](/*8.4*/for(film <- films) yield /*8.22*/ {_display_(Seq[Any](format.raw/*8.24*/("""
    <li>title: """),_display_(Seq[Any](/*9.17*/film/*9.21*/.title)),format.raw/*9.27*/(""" </li>
    <li>synopsis_es: """),_display_(Seq[Any](/*10.23*/film/*10.27*/.synopsis_es)),format.raw/*10.39*/(""" </li>
    <li>id_youtube: """),_display_(Seq[Any](/*11.22*/film/*11.26*/.id_youtube)),format.raw/*11.37*/(""" </li>
    <li>pic: <img src=""""),_display_(Seq[Any](/*12.25*/film/*12.29*/.image_url)),format.raw/*12.39*/("""" /> </li>

    <hr />
  """)))})),format.raw/*15.4*/("""
  </ul>

""")))})))}
    }
    
    def render(films:Seq[Film]) = apply(films)
    
    def f:((Seq[Film]) => play.api.templates.Html) = (films) => apply(films)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 12 18:43:15 ART 2012
                    SOURCE: /home/sas/dev/apps/RestOpenGov/PlayBafici/app/views/test.scala.html
                    HASH: 92568b1b6b8871f0208048c77b33272d4c9142b7
                    MATRIX: 507->1|602->19|639->22|667->42|705->43|731->51|769->52|815->63|828->68|854->73|900->85|933->103|972->105|1024->122|1036->126|1063->132|1128->161|1141->165|1175->177|1239->205|1252->209|1285->220|1352->251|1365->255|1397->265|1454->291
                    LINES: 19->1|22->1|24->3|24->3|24->3|24->3|24->3|26->5|26->5|26->5|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|36->15
                    -- GENERATED --
                */
            