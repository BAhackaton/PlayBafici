
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template7[Long,String,String,String,Long,Long,Seq[Film],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(
	page: Long = 1, 
	sort: String = "", 
	filter: String = "", 
	year: String = "2012", 
	found: Long, 
	total: Long, 
	films: Seq[Film] = Seq[Film]()
):play.api.templates.Html = {
        _display_ {
def /*88.2*/pager/*88.7*/(page: Long, found: Long):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*88.36*/("""
<hr/>
<div class="row-fluid controls">
   <div class="span12">
	   <ul class="pager">
		  <li>
		   """),_display_(Seq[Any](/*94.7*/if(page>1)/*94.17*/ {_display_(Seq[Any](format.raw/*94.19*/("""
			    <a href=""""),_display_(Seq[Any](/*95.18*/routes/*95.24*/.Films.list(page-1, sort, filter))),format.raw/*95.57*/("""" class="btn-large">&larr; Anterior</a>
		  	""")))}/*96.7*/else/*96.11*/{_display_(Seq[Any](format.raw/*96.12*/("""
			    <a href="javascript:;" class="btn-large disabled">&larr; Anterior</a>
		  	""")))})),format.raw/*98.7*/("""
		  </li>
		  <li>
		  	|
		  </li>
		  <li>
		    <a href=""""),_display_(Seq[Any](/*104.17*/routes/*104.23*/.Films.list(page+1, sort, filter))),format.raw/*104.56*/("""" class="btn-large">Siguiente &rarr;</a>
		  </li>
		</ul>
	</div>
	"""),_display_(Seq[Any](/*108.3*/if(films.size == 0)/*108.22*/ {_display_(Seq[Any](format.raw/*108.24*/("""
	    """),_display_(Seq[Any](/*109.7*/if(filter == "")/*109.23*/ {_display_(Seq[Any](format.raw/*109.25*/("""
	    	<em>Busque algo</em>
	    """)))}/*111.8*/else/*111.13*/{_display_(Seq[Any](format.raw/*111.14*/("""
	     	<em>0 Elementos</em>
	    """)))})),format.raw/*113.7*/("""	
	  """)))}/*114.6*/else/*114.11*/{_display_(Seq[Any](format.raw/*114.12*/("""
	     <em> """),_display_(Seq[Any](/*115.13*/films/*115.18*/.size)),format.raw/*115.23*/(""" elementos de """),_display_(Seq[Any](/*115.38*/found)),format.raw/*115.43*/("""</em>        
	""")))})),format.raw/*116.3*/("""
</div>
<hr/>
""")))};
Seq[Any](format.raw/*9.2*/("""

"""),_display_(Seq[Any](/*11.2*/main("Open Bafici")/*11.21*/{_display_(Seq[Any](format.raw/*11.22*/("""<p></p>""")))}/*11.30*/{_display_(Seq[Any](format.raw/*11.31*/("""

<div class="row-fluid">
	<div class="span6 hidden-phone">
		<div class="hero-unit">
			<blockquote>
			  <p>"La fotografía es verdad.<br/> Y el cine es verdad 24 veces por segundo"</p>
			  <small>Jean Luc Godard</small>
			</blockquote>
		</div>
	</div>
	<!-- ver http://foro.elaleph.com/viewtopic.php?t=8365 y http://www.citasyproverbios.com/citas.aspx?tema=Cine -->
	<div class="span3">
		<br/>
		<div class="span12">
			<h3>Ingrese una palabra<span class="visible-desktop">:</span></h3>
		</div>
		<div class="span12">
			<div class="row-fluid">

				<form class="form-search" id="search">
					<input type="text" value=""""),_display_(Seq[Any](/*32.33*/filter)),format.raw/*32.39*/("""" class="filterText search-query visible-desktop" style="width:80%" />
					<input type="text" value=""""),_display_(Seq[Any](/*33.33*/filter)),format.raw/*33.39*/("""" class="filterText search-query hidden-desktop" style="width:90%" />
					<p class="help-block">Busca por título, género, actor, etc.</p>

					<p>
					<input type="radio" name="year" value="2010" class="yearText" """),_display_(Seq[Any](/*37.69*/(if(year=="2010") " checked"))),format.raw/*37.98*/("""/>&nbsp;2010&nbsp;&nbsp;
					<input type="radio" name="year" value="2011" class="yearText" """),_display_(Seq[Any](/*38.69*/(if(year=="2011") " checked"))),format.raw/*38.98*/("""/>&nbsp;2011&nbsp;&nbsp;
					<input type="radio" name="year" value="2012" class="yearText" """),_display_(Seq[Any](/*39.69*/(if(year=="2012") " checked"))),format.raw/*39.98*/("""/>&nbsp;2012
					</p>

					<input type="submit" class="buscar btn btn-large visible-desktop" value="Buscar" />
					<input type="submit" class="buscar btn btn-large hidden-desktop" value="Buscar" />

				</form>
				
			</div>
		</div>
	</div>
	<div class="span3 hidden-phone hidden-tablet">
		<div class="hero-unit">
			<p>Buscando en más de """),_display_(Seq[Any](/*52.27*/total)),format.raw/*52.32*/(""" películas.</p>
		</div>
	</div>
</div>
  
"""),_display_(Seq[Any](/*57.2*/if(films.size > 0)/*57.20*/ {_display_(Seq[Any](format.raw/*57.22*/("""
  
  	"""),_display_(Seq[Any](/*59.5*/pager(page, found))),format.raw/*59.23*/("""

	<div class="row-fluid">
		<div class="span12">
			  <table class="table table-striped">
			  <thead>
			   	<tr>
			  		<th>Título</th>
			  		<th></th>
			  	</tr>
			  </thead>
			  <tbody>
			  	"""),_display_(Seq[Any](/*71.8*/for(film:Film <- films) yield /*71.31*/{_display_(Seq[Any](format.raw/*71.32*/("""
			  		<tr class="filmItem">
			  			<td class="titulo">"""),_display_(Seq[Any](/*73.29*/film/*73.33*/.title)),format.raw/*73.39*/("""</td>
			  			<td><a href=""""),_display_(Seq[Any](/*74.23*/routes/*74.29*/.Films.show(film.id))),format.raw/*74.49*/("""" class="btn btn-success pull-right">+ INFO</a></td>
			  		</tr>	
			  	""")))})),format.raw/*76.8*/("""
			  </tbody>        	    
			  </table>
	  	</div>
	</div>
  
"""),_display_(Seq[Any](/*82.2*/pager(page, found))),format.raw/*82.20*/("""
  
  """)))})),format.raw/*84.4*/("""

""")))})),format.raw/*86.2*/("""

"""))}
    }
    
    def render(page:Long,sort:String,filter:String,year:String,found:Long,total:Long,films:Seq[Film]) = apply(page,sort,filter,year,found,total,films)
    
    def f:((Long,String,String,String,Long,Long,Seq[Film]) => play.api.templates.Html) = (page,sort,filter,year,found,total,films) => apply(page,sort,filter,year,found,total,films)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 12 11:53:34 ART 2012
                    SOURCE: /home/sas/dev/apps/RestOpenGov/PlayBafici/app/views/list.scala.html
                    HASH: acd3e942fe54873de2c356920fb33a7310c09083
                    MATRIX: 543->1|756->2377|769->2382|862->2411|999->2513|1018->2523|1058->2525|1112->2543|1127->2549|1182->2582|1246->2628|1259->2632|1298->2633|1413->2717|1512->2779|1528->2785|1584->2818|1689->2887|1718->2906|1759->2908|1802->2915|1828->2931|1869->2933|1922->2968|1936->2973|1976->2974|2043->3009|2068->3016|2082->3021|2122->3022|2172->3035|2187->3040|2215->3045|2267->3060|2295->3065|2343->3081|2396->153|2434->156|2462->175|2501->176|2528->184|2567->185|3231->813|3259->819|3398->922|3426->928|3679->1145|3730->1174|3859->1267|3910->1296|4039->1389|4090->1418|4472->1764|4499->1769|4578->1813|4605->1831|4645->1833|4688->1841|4728->1859|4965->2061|5004->2084|5043->2085|5137->2143|5150->2147|5178->2153|5242->2181|5257->2187|5299->2207|5404->2281|5504->2346|5544->2364|5582->2371|5616->2374
                    LINES: 19->1|29->88|29->88|31->88|37->94|37->94|37->94|38->95|38->95|38->95|39->96|39->96|39->96|41->98|47->104|47->104|47->104|51->108|51->108|51->108|52->109|52->109|52->109|54->111|54->111|54->111|56->113|57->114|57->114|57->114|58->115|58->115|58->115|58->115|58->115|59->116|63->9|65->11|65->11|65->11|65->11|65->11|86->32|86->32|87->33|87->33|91->37|91->37|92->38|92->38|93->39|93->39|106->52|106->52|111->57|111->57|111->57|113->59|113->59|125->71|125->71|125->71|127->73|127->73|127->73|128->74|128->74|128->74|130->76|136->82|136->82|138->84|140->86
                    -- GENERATED --
                */
            