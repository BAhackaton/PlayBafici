
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

"""),_display_(Seq[Any](/*3.2*/main("Open Bafici")/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""<p></p>""")))}/*3.30*/{_display_(Seq[Any](format.raw/*3.31*/("""

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
                    DATE: Sat May 12 15:15:21 ART 2012
                    SOURCE: /home/sas/dev/apps/RestOpenGov/PlayBafici/app/views/test.scala.html
                    HASH: a3c3acc34fd1e54f28f626c1f703b7b5db0f15cd
                    MATRIX: 507->1|602->19|639->22|666->41|704->42|730->50|768->51|814->62|827->67|853->72|899->84|932->102|971->104|1023->121|1035->125|1062->131|1127->160|1140->164|1174->176|1238->204|1251->208|1284->219|1351->250|1364->254|1396->264|1453->290
                    LINES: 19->1|22->1|24->3|24->3|24->3|24->3|24->3|26->5|26->5|26->5|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|36->15
                    -- GENERATED --
                */
            