
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
def /*33.2*/renderOption/*33.14*/(id: String,title: String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*33.44*/("""
	<li class="option" id=""""),_display_(Seq[Any](/*34.26*/id)),format.raw/*34.28*/("""">"""),_display_(Seq[Any](/*34.31*/title)),format.raw/*34.36*/("""<span></span></li>
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
			<a id="next" class="btn-large btw btn-danger disabled" style="display:none;width:100% !important;" href="javascript:;">Siguiente &rarr;</a>
      </div>
    </div>

""")))})),format.raw/*31.2*/("""

"""),format.raw/*35.2*/("""

<script type="text/javascript">
	$('.option').bind('click',function()"""),format.raw("""{"""),format.raw/*38.39*/("""
		$('.option').unbind('click');
		var correct = '"""),_display_(Seq[Any](/*40.19*/film/*40.23*/.id)),format.raw/*40.26*/("""';
		var puntaje = 0;
		var msg = 'Incorrecto!';
		
		if($(this).attr('id')==correct)"""),format.raw("""{"""),format.raw/*44.35*/("""
			puntaje = 10;
			msg = 'Correcto!';
		"""),format.raw("""}"""),format.raw/*47.4*/("""

		$('#score').html(parseInt($('#score').html()) + puntaje);

		$('.option').each(function(i,e)"""),format.raw("""{"""),format.raw/*51.35*/("""
			if($(e).attr('id')==correct)"""),format.raw("""{"""),format.raw/*52.33*/("""
				$(e).addClass('bien');
			"""),format.raw("""}"""),format.raw/*54.5*/("""else"""),format.raw("""{"""),format.raw/*54.10*/("""
				$(e).addClass('mal');
			"""),format.raw("""}"""),format.raw/*56.5*/("""
		"""),format.raw("""}"""),format.raw/*57.4*/(""");

		$('#msg').html(msg);
		//$('#scoreValue').val(puntaje);
		$('#next').attr('href','/game/'+puntaje)
		$('#next').show();
	"""),format.raw("""}"""),format.raw/*63.3*/(""");

</script>
"""))}
    }
    
    def render(film:Film,score:Int,options:Seq[Film]) = apply(film,score,options)
    
    def f:((Film,Int,Seq[Film]) => play.api.templates.Html) = (film,score,options) => apply(film,score,options)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 12 18:43:15 ART 2012
                    SOURCE: /home/sas/dev/apps/RestOpenGov/PlayBafici/app/views/show.scala.html
                    HASH: 42837b5fa05c31a9f495b26bb28bca31144b7b01
                    MATRIX: 516->1|640->760|661->772|755->802|817->828|841->830|880->833|907->838|966->64|1003->67|1029->85|1068->87|1189->173|1215->178|1401->328|1414->332|1446->342|1617->478|1658->503|1697->504|1737->509|1791->541|1826->545|2069->757|2098->858|2217->930|2304->981|2317->985|2342->988|2475->1074|2564->1117|2708->1214|2788->1247|2866->1279|2918->1284|2995->1315|3045->1319|3219->1447
                    LINES: 19->1|21->33|21->33|23->33|24->34|24->34|24->34|24->34|26->1|28->3|28->3|28->3|32->7|32->7|37->12|37->12|37->12|47->22|47->22|47->22|48->23|48->23|49->24|56->31|58->35|61->38|63->40|63->40|63->40|67->44|70->47|74->51|75->52|77->54|77->54|79->56|80->57|86->63
                    -- GENERATED --
                */
            