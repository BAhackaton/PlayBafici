
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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Film,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(film: Film):play.api.templates.Html = {
        _display_ {
def /*68.2*/movieInfo/*68.11*/(k: String, sv: String, ev: String=""):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*68.53*/("""
	"""),_display_(Seq[Any](/*69.3*/if(sv!="NULL" && sv!="0" && sv!="" )/*69.39*/{_display_(Seq[Any](format.raw/*69.40*/("""
		<div class="row-fluid">
			<h2 class="span3 key">
				"""),_display_(Seq[Any](/*72.6*/k)),format.raw/*72.7*/("""
			</h2>
			"""),_display_(Seq[Any](/*74.5*/if(ev!="")/*74.15*/{_display_(Seq[Any](format.raw/*74.16*/("""		
				"""),_display_(Seq[Any](/*75.6*/movieInfoValue(sv,"es activeLang"))),format.raw/*75.40*/("""
				"""),_display_(Seq[Any](/*76.6*/movieInfoValue(ev,"en"))),format.raw/*76.29*/("""
			""")))}/*77.5*/else/*77.9*/{_display_(Seq[Any](format.raw/*77.10*/("""
				"""),_display_(Seq[Any](/*78.6*/movieInfoValue(sv,""))),format.raw/*78.27*/("""
			""")))})),format.raw/*79.5*/("""
		</div>
		<hr/>
	""")))})),format.raw/*82.3*/("""
""")))};def /*85.2*/movieInfoValue/*85.16*/(v: String,c: String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*85.41*/("""
	<div class="span9 value """),_display_(Seq[Any](/*86.27*/c)),format.raw/*86.28*/("""">
		"""),_display_(Seq[Any](/*87.4*/v)),format.raw/*87.5*/("""
	</div>	
""")))};
Seq[Any](format.raw/*1.14*/("""

"""),_display_(Seq[Any](/*3.2*/main("Open Bafici")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
<div id="langSelector" class="btn-group pull-right">
	<a class="btn btn-warning" rel="en">Inglés</a>
	<a class="btn btn-warning active" rel="es">Español</a>
</div>
""")))}/*8.2*/ {_display_(Seq[Any](format.raw/*8.4*/("""

<div class="row-fluid">
	<div class="hero-unit">
		<div class="row-fluid">
			<div class="span6">
				<h1 class="en">"""),_display_(Seq[Any](/*14.21*/film/*14.25*/.title)),format.raw/*14.31*/("""</h1>
				<h1 class="es activeLang">"""),_display_(Seq[Any](/*15.32*/film/*15.36*/.title_es)),format.raw/*15.45*/("""</h1>
			</div>
			<div class="span6">
				"""),_display_(Seq[Any](/*18.6*/if(film.filepic1!="")/*18.27*/{_display_(Seq[Any](format.raw/*18.28*/("""
					<img class="thumb" alt=""""),_display_(Seq[Any](/*19.31*/film/*19.35*/.title)),format.raw/*19.41*/("""" src=""""),_display_(Seq[Any](/*19.49*/film/*19.53*/.image_url)),format.raw/*19.63*/("""">
				""")))}/*20.6*/else/*20.10*/{_display_(Seq[Any](format.raw/*20.11*/("""
					<img class="thumb" alt=""""),_display_(Seq[Any](/*21.31*/film/*21.35*/.title)),format.raw/*21.41*/("""" src="http://www.bitacoradevuelo.com.ar/wp-content/uploads/2010/07/MINIATURA-bafici-640x250.jpg">
				""")))})),format.raw/*22.6*/("""
			</div>
		</div>	
	</div>	
</div>

<hr/>

"""),_display_(Seq[Any](/*30.2*/movieInfo("Genero",film.generes_list,""))),format.raw/*30.42*/("""

"""),_display_(Seq[Any](/*32.2*/movieInfo("Reparto",film.cast,""))),format.raw/*32.35*/("""

"""),_display_(Seq[Any](/*34.2*/movieInfo("Sinopsis",film.synopsis_es,film.synopsis_en))),format.raw/*34.57*/("""

"""),_display_(Seq[Any](/*36.2*/if(film.id_youtube!="")/*36.25*/{_display_(Seq[Any](format.raw/*36.26*/("""
	<div class="row-fluid">
		<h2 class="span3 key">
			Trailer
		</h2>		
		<div class="span9">
			<iframe class="trailer visible-desktop" width="560" height="315" src="http://www.youtube.com/embed/"""),_display_(Seq[Any](/*42.104*/film/*42.108*/.id_youtube)),format.raw/*42.119*/("""" frameborder="0" allowfullscreen></iframe>
			<iframe class="trailer hidden-desktop" width="100%" height="200" src="http://www.youtube.com/embed/"""),_display_(Seq[Any](/*43.104*/film/*43.108*/.id_youtube)),format.raw/*43.119*/("""" frameborder="0" allowfullscreen></iframe>
		</div>
	</div>	
<hr/>
""")))})),format.raw/*47.2*/("""

"""),_display_(Seq[Any](/*49.2*/movieInfo("Director",film.director))),format.raw/*49.37*/("""

"""),_display_(Seq[Any](/*51.2*/movieInfo("Duracion",film.duration+""))),format.raw/*51.40*/("""

"""),_display_(Seq[Any](/*53.2*/movieInfo("Año",film.year+""))),format.raw/*53.31*/("""

"""),_display_(Seq[Any](/*55.2*/movieInfo("Fecha",film.updated_ts))),format.raw/*55.36*/("""

"""),_display_(Seq[Any](/*57.2*/movieInfo("Productora",film.prodteam))),format.raw/*57.39*/("""

<div class="filmItem">
	<div class="value">
		<a class="btn btn-success btn-large visible-desktop" href=""""),_display_(Seq[Any](/*61.63*/film/*61.67*/.url_ticket)),format.raw/*61.78*/("""">COMPRAR TICKET</a>  
		<a class="btn btn-success btn-large hidden-desktop" href=""""),_display_(Seq[Any](/*62.62*/film/*62.66*/.url_ticket)),format.raw/*62.77*/("""">COMPRAR TICKET</a>  
	</div>
</div>

""")))})),format.raw/*66.2*/("""

"""),format.raw/*83.2*/("""

"""),format.raw/*89.2*/("""
"""))}
    }
    
    def render(film:Film) = apply(film)
    
    def f:((Film) => play.api.templates.Html) = (film) => apply(film)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 12 11:53:34 ART 2012
                    SOURCE: /home/sas/dev/apps/RestOpenGov/PlayBafici/app/views/show.scala.html
                    HASH: 54f96d66d8c3c3c6ad0d54b03dfebf01ebdab50f
                    MATRIX: 502->1|575->1775|593->1784|699->1826|737->1829|782->1865|821->1866|914->1924|936->1925|985->1939|1004->1949|1043->1950|1086->1958|1142->1992|1183->1998|1228->2021|1251->2026|1263->2030|1302->2031|1343->2037|1386->2058|1422->2063|1473->2083|1498->2088|1521->2102|1610->2127|1673->2154|1696->2155|1737->2161|1759->2162|1809->13|1846->16|1873->35|1912->37|2095->203|2133->205|2289->325|2302->329|2330->335|2403->372|2416->376|2447->385|2526->429|2556->450|2595->451|2662->482|2675->486|2703->492|2747->500|2760->504|2792->514|2818->522|2831->526|2870->527|2937->558|2950->562|2978->568|3113->672|3194->718|3256->758|3294->761|3349->794|3387->797|3464->852|3502->855|3534->878|3573->879|3807->1076|3821->1080|3855->1091|4039->1238|4053->1242|4087->1253|4187->1322|4225->1325|4282->1360|4320->1363|4380->1401|4418->1404|4469->1433|4507->1436|4563->1470|4601->1473|4660->1510|4804->1618|4817->1622|4850->1633|4970->1717|4983->1721|5016->1732|5087->1772|5116->2085|5145->2173
                    LINES: 19->1|21->68|21->68|23->68|24->69|24->69|24->69|27->72|27->72|29->74|29->74|29->74|30->75|30->75|31->76|31->76|32->77|32->77|32->77|33->78|33->78|34->79|37->82|38->85|38->85|40->85|41->86|41->86|42->87|42->87|45->1|47->3|47->3|47->3|52->8|52->8|58->14|58->14|58->14|59->15|59->15|59->15|62->18|62->18|62->18|63->19|63->19|63->19|63->19|63->19|63->19|64->20|64->20|64->20|65->21|65->21|65->21|66->22|74->30|74->30|76->32|76->32|78->34|78->34|80->36|80->36|80->36|86->42|86->42|86->42|87->43|87->43|87->43|91->47|93->49|93->49|95->51|95->51|97->53|97->53|99->55|99->55|101->57|101->57|105->61|105->61|105->61|106->62|106->62|106->62|110->66|112->83|114->89
                    -- GENERATED --
                */
            