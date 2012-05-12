
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Html,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(langSelector: Html)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.52*/("""

<!DOCTYPE html>

<html>
  <head>
  <title>"""),_display_(Seq[Any](/*7.11*/title)),format.raw/*7.16*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.50*/routes/*8.56*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*8.95*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.50*/routes/*9.56*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*9.106*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.50*/routes/*10.56*/.Assets.at("stylesheets/main.css"))),format.raw/*10.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.55*/routes/*11.61*/.Assets.at("images/favicon.png"))),format.raw/*11.93*/("""">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/> 
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src=""""),_display_(Seq[Any](/*14.19*/routes/*14.25*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*14.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*15.19*/routes/*15.25*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*15.67*/("""" type="text/javascript"></script>
  </head>
  <body>
    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">
          <a class="brand" href=""""),_display_(Seq[Any](/*21.35*/routes/*21.41*/.Films.list())),format.raw/*21.54*/("""">Open Bafici</a>
          """),_display_(Seq[Any](/*22.12*/langSelector)),format.raw/*22.24*/("""
        </div>
      </div>
    </div>
	<div class="row-fluid visible-desktop" style="height:60px;">
	</div>
    <div class="container-fluid">
    	 <div class="row-fluid">
      		<div class="span1 visible-desktop"></div>	
      			<div class="span10 pagination-centered">
      				"""),_display_(Seq[Any](/*32.12*/content)),format.raw/*32.19*/("""
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
$(document).ready(function()"""),format.raw("""{"""),format.raw/*49.30*/("""
  $('#langSelector a').on("click",function()"""),format.raw("""{"""),format.raw/*50.46*/("""
    var lang = $(this).attr('rel');
    $('#langSelector a').removeClass('active');
    $(this).addClass('active');
    
    $('.activeLang').removeClass('activeLang');
    $('.'+lang).addClass('activeLang');
  """),format.raw("""}"""),format.raw/*57.4*/(""");
  
  $('.filmItem').on('click', function() """),format.raw("""{"""),format.raw/*59.42*/("""
    window.location.href = $('a', this).attr('href');
  """),format.raw("""}"""),format.raw/*61.4*/(""");

  $("#search").on("submit",function(e)"""),format.raw("""{"""),format.raw/*63.40*/("""
     e.preventDefault();

     var filter = $(".filterText").val();
     var page = 1;
     var sort = "";
     var year = $(".yearText:checked").val();
     var url = "/films?page="+page+"&sort="+sort+"&filter="+filter+"&year="+year;
     
     window.location= url;
   """),format.raw("""}"""),format.raw/*73.5*/(""");
"""),format.raw("""}"""),format.raw/*74.2*/("""); 
</script>"""))}
    }
    
    def render(title:String,langSelector:Html,content:Html) = apply(title)(langSelector)(content)
    
    def f:((String) => (Html) => (Html) => play.api.templates.Html) = (title) => (langSelector) => (content) => apply(title)(langSelector)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat May 12 11:53:35 ART 2012
                    SOURCE: /home/sas/dev/apps/RestOpenGov/PlayBafici/app/views/main.scala.html
                    HASH: d0a5f771fa3538241475690c7c09252eeaeb21a9
                    MATRIX: 514->1|641->51|721->96|747->101|840->159|854->165|914->204|1001->256|1015->262|1087->312|1175->364|1190->370|1246->404|1339->461|1354->467|1408->499|1614->669|1629->675|1696->720|1785->773|1800->779|1864->821|2101->1022|2116->1028|2151->1041|2216->1070|2250->1082|2572->1368|2601->1375|3111->1838|3204->1884|3463->2097|3557->2144|3661->2202|3751->2245|4070->2518|4120->2522
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|35->14|35->14|35->14|36->15|36->15|36->15|42->21|42->21|42->21|43->22|43->22|53->32|53->32|70->49|71->50|78->57|80->59|82->61|84->63|94->73|95->74
                    -- GENERATED --
                */
            