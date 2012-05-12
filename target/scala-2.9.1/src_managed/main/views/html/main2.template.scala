
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
object main2 extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Html,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(scoreBlock: Html)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.50*/("""

<!DOCTYPE html>

<html>
  <head>
    <title>"""),_display_(Seq[Any](/*7.13*/title)),format.raw/*7.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="apple-mobile-web-app-capable" content="yes" /> 
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.50*/routes/*10.56*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*10.95*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.50*/routes/*11.56*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*11.106*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.50*/routes/*12.56*/.Assets.at("stylesheets/main.css"))),format.raw/*12.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.55*/routes/*13.61*/.Assets.at("images/favicon.png"))),format.raw/*13.93*/("""">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <script src=""""),_display_(Seq[Any](/*16.19*/routes/*16.25*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*16.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*17.19*/routes/*17.25*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*17.67*/("""" type="text/javascript"></script>
  </head>
  <body>
    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">
          <div class="row-fluid pagination-centered">
            <a class="brand" href=""""),_display_(Seq[Any](/*24.37*/routes/*24.43*/.Films.home())),format.raw/*24.56*/("""">Play Bafici</a>
          </div>
          <div class="row-fluid pagination-centered">
            """),_display_(Seq[Any](/*27.14*/scoreBlock)),format.raw/*27.24*/("""
          </div>
        </div>
      </div>
    </div>
	<div class="row-fluid visible-desktop" style="height:60px;">
	</div>
    <div class="container-fluid">
    	 <div class="row-fluid">
      		<div class="span1 visible-desktop"></div>	
      			<div class="span10 pagination-centered">
      				"""),_display_(Seq[Any](/*38.12*/content)),format.raw/*38.19*/("""
      			</div>
    	 	<div class="span1"></div>
    	 </div>
    	 <hr/>   
		<footer class="row-fluid">
			<p class="pagination-centered">
				<a href="https://github.com/PlayArgentina/openBafici" target="_blank">OpenBafici on GitHub</a>
				 - 
				<a href="https://github.com/Nardoz/RestOpenGov/wiki/Hackaton" target="_blank">RestOpenGov.org</a>
			</p>
		</footer>
    </div> 
  </body>
</html>

<script type="text/javascript">
$(document).ready(function()"""),format.raw("""{"""),format.raw/*55.30*/("""

  window.scrollTo(0, 1);

  $('#langSelector a').on("click",function()"""),format.raw("""{"""),format.raw/*59.46*/("""
    var lang = $(this).attr('rel');
    $('#langSelector a').removeClass('active');
    $(this).addClass('active');
    
    $('.activeLang').removeClass('activeLang');
    $('.'+lang).addClass('activeLang');
  """),format.raw("""}"""),format.raw/*66.4*/(""");
  
  $('.filmItem').on('click', function() """),format.raw("""{"""),format.raw/*68.42*/("""
    window.location.href = $('a', this).attr('href');
  """),format.raw("""}"""),format.raw/*70.4*/(""");

  $("#search").on("submit",function(e)"""),format.raw("""{"""),format.raw/*72.40*/("""
     e.preventDefault();

     var filter = $(".filterText").val();
     var page = 1;
     var sort = "";
     var year = $(".yearText:checked").val();
     var url = "/films?page="+page+"&sort="+sort+"&filter="+filter+"&year="+year;
     
     window.location= url;
   """),format.raw("""}"""),format.raw/*82.5*/(""");
"""),format.raw("""}"""),format.raw/*83.2*/("""); 
</script>"""))}
    }
    
    def render(title:String,scoreBlock:Html,content:Html) = apply(title)(scoreBlock)(content)
    
    def f:((String) => (Html) => (Html) => play.api.templates.Html) = (title) => (scoreBlock) => (content) => apply(title)(scoreBlock)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 12 17:40:44 ART 2012
                    SOURCE: /home/sas/dev/apps/RestOpenGov/PlayBafici/app/views/main2.scala.html
                    HASH: 9859f7b5a0a0d2f34d1e53042d3d47a28bd5a806
                    MATRIX: 515->1|640->49|722->96|748->101|981->298|996->304|1057->343|1145->395|1160->401|1233->451|1321->503|1336->509|1392->543|1485->600|1500->606|1554->638|1778->826|1793->832|1860->877|1949->930|1964->936|2028->978|2321->1235|2336->1241|2371->1254|2509->1356|2541->1366|2880->1669|2909->1676|3419->2139|3539->2212|3798->2425|3892->2472|3996->2530|4086->2573|4405->2846|4455->2850
                    LINES: 19->1|22->1|28->7|28->7|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13|37->16|37->16|37->16|38->17|38->17|38->17|45->24|45->24|45->24|48->27|48->27|59->38|59->38|76->55|80->59|87->66|89->68|91->70|93->72|103->82|104->83
                    -- GENERATED --
                */
            