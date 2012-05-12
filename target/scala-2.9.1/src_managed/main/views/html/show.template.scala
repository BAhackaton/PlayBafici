
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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Film,Int,Seq[Film],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(film: Film, score: Int = 10, options: Seq[Film] = Seq[Film]()):play.api.templates.Html = {
        _display_ {
def /*36.2*/renderOption/*36.14*/(id: String,title: String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*36.44*/("""
	<li class="option" id=""""),_display_(Seq[Any](/*37.26*/id)),format.raw/*37.28*/("""">"""),_display_(Seq[Any](/*37.31*/title)),format.raw/*37.36*/("""<span></span></li>
""")))};
Seq[Any](format.raw/*1.65*/("""

"""),_display_(Seq[Any](/*3.2*/main("PlayBafici")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
	
	<div class="for-points">
      <h2>Por 10 puntos</h2>
      <h4><span id="score">"""),_display_(Seq[Any](/*7.29*/score)),format.raw/*7.34*/("""</span> <span>puntos</span></h4>
    </div>
    <ul class="thumbnails">
      <li class="span3">
        <div class="thumbnail">
          <img src=""""),_display_(Seq[Any](/*12.22*/film/*12.26*/.image_url)),format.raw/*12.36*/("""" alt="">
        </div>
      </li>
    </ul>

	<hr/>

    <div class="quiz">
      <h3>¿Cómo se llama la película?</h3>
      <ul>
		"""),_display_(Seq[Any](/*22.4*/for(film:Film <- options) yield /*22.29*/{_display_(Seq[Any](format.raw/*22.30*/("""
			"""),_display_(Seq[Any](/*23.5*/renderOption(film.id,film.title))),format.raw/*23.37*/("""
		""")))})),format.raw/*24.4*/("""
      </ul>
      <div class="post-quiz">
      	<form id="scoreForm" action="/game">
			<input id="scoreValue" name="scoreValue" type="hidden" value="" />
			<input type="submit" id="next" class="btn-large btw btn-danger disabled" value="Siguiente" />
		</form>
      </div>
    </div>

""")))})),format.raw/*34.2*/("""

"""),format.raw/*38.2*/("""

<script type="text/javascript">
	$('.option').bind('click',function()"""),format.raw("""{"""),format.raw/*41.39*/("""
		$('.option').unbind('click');
		var correct = '"""),_display_(Seq[Any](/*43.19*/film/*43.23*/.id)),format.raw/*43.26*/("""';
		var puntaje = 0;
		var msg = 'Incorrecto!';
		
		if($(this).attr('id')==correct)"""),format.raw("""{"""),format.raw/*47.35*/("""
			puntaje = 10;
			msg = 'Correcto!';
		"""),format.raw("""}"""),format.raw/*50.4*/("""

		$('#score').html(parseInt($('#score').html()) + puntaje);

		$('.option').each(function(i,e)"""),format.raw("""{"""),format.raw/*54.35*/("""
			if($(e).attr('id')==correct)"""),format.raw("""{"""),format.raw/*55.33*/("""
				$(e).addClass('bien');
			"""),format.raw("""}"""),format.raw/*57.5*/("""else"""),format.raw("""{"""),format.raw/*57.10*/("""
				$(e).addClass('mal');
			"""),format.raw("""}"""),format.raw/*59.5*/("""
		"""),format.raw("""}"""),format.raw/*60.4*/(""");

		$('#msg').html(msg);
		//$('#scoreValue').val(puntaje);
		$('#next').attr('href','/game/'+puntaje)
		$('#next').removeClass('disabled');
	"""),format.raw("""}"""),format.raw/*66.3*/(""");

</script>
"""))}
    }
    
    def render(film:Film,score:Int,options:Seq[Film]) = apply(film,score,options)
    
    def f:((Film,Int,Seq[Film]) => play.api.templates.Html) = (film,score,options) => apply(film,score,options)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 12 17:40:44 ART 2012
                    SOURCE: /home/sas/dev/apps/RestOpenGov/PlayBafici/app/views/show.scala.html
                    HASH: 27918d1999f0e7305137545de9dd50c39ca85401
                    MATRIX: 516->1|640->838|661->850|755->880|817->906|841->908|880->911|907->916|966->64|1003->67|1029->85|1068->87|1189->173|1215->178|1401->328|1414->332|1446->342|1617->478|1658->503|1697->504|1737->509|1791->541|1826->545|2147->835|2176->936|2295->1008|2382->1059|2395->1063|2420->1066|2553->1152|2642->1195|2786->1292|2866->1325|2944->1357|2996->1362|3073->1393|3123->1397|3314->1542
                    LINES: 19->1|21->36|21->36|23->36|24->37|24->37|24->37|24->37|26->1|28->3|28->3|28->3|32->7|32->7|37->12|37->12|37->12|47->22|47->22|47->22|48->23|48->23|49->24|59->34|61->38|64->41|66->43|66->43|66->43|70->47|73->50|77->54|78->55|80->57|80->57|82->59|83->60|89->66
                    -- GENERATED --
                */
            