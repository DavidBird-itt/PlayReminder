
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
	<head>
		<title>ADK """),_display_(/*5.15*/pagename),format.raw/*5.23*/("""</title>
		
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<style>
			#search-form """),format.raw/*10.17*/("""{"""),format.raw/*10.18*/("""
				"""),format.raw/*11.5*/("""background-color:#1f9a95;
				color:white;
				text-align:center;
				padding-bottom:1em;
			"""),format.raw/*15.4*/("""}"""),format.raw/*15.5*/("""
			"""),format.raw/*16.4*/("""#slide-show """),format.raw/*16.16*/("""{"""),format.raw/*16.17*/("""
				"""),format.raw/*17.5*/("""background-color:#d5f1ef;
				height:350px;
				/*margin-left:150px;*/
			"""),format.raw/*20.4*/("""}"""),format.raw/*20.5*/("""
			"""),format.raw/*21.4*/("""#slide-show img """),format.raw/*21.20*/("""{"""),format.raw/*21.21*/("""
				"""),format.raw/*22.5*/("""height:100%;
				width:350px;
				float:left;
			"""),format.raw/*25.4*/("""}"""),format.raw/*25.5*/("""
			"""),format.raw/*26.4*/("""#slide-show .property-text """),format.raw/*26.31*/("""{"""),format.raw/*26.32*/("""
				"""),format.raw/*27.5*/("""background-color:green;
				height:70%;
			"""),format.raw/*29.4*/("""}"""),format.raw/*29.5*/("""
			"""),format.raw/*30.4*/("""#search-form select """),format.raw/*30.24*/("""{"""),format.raw/*30.25*/("""
				"""),format.raw/*31.5*/("""color:black;
			"""),format.raw/*32.4*/("""}"""),format.raw/*32.5*/("""
			"""),format.raw/*33.4*/(""".title """),format.raw/*33.11*/("""{"""),format.raw/*33.12*/("""
				"""),format.raw/*34.5*/("""display:block;
				color:white;
				text-align:center;
				background-color:rgba(0,0,0,0.2);
				padding:0.7em;
				font-size:1.2em;
				margin-bottom:0.4em;
			"""),format.raw/*41.4*/("""}"""),format.raw/*41.5*/("""
		"""),format.raw/*42.3*/("""</style>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	</head>
	<body>
            <nav class="navbar navbar-inverse">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a class="navbar-brand" href=""""),_display_(/*50.60*/routes/*50.66*/.HomeController.index()),format.raw/*50.89*/("""">ADK Houses</a>
                        </div>
                        <ul class="nav navbar-nav">
                            <li """),_display_(/*53.34*/if(pagename== "Home")/*53.55*/{_display_(Seq[Any](format.raw/*53.56*/("""class="active"""")))}),format.raw/*53.71*/("""><a href=""""),_display_(/*53.82*/routes/*53.88*/.HomeController.index()),format.raw/*53.111*/("""">Home</a></li>
                            <li """),_display_(/*54.34*/if(pagename == "Payment")/*54.59*/{_display_(Seq[Any](format.raw/*54.60*/("""class="active"""")))}),format.raw/*54.75*/("""><a href=""""),_display_(/*54.86*/routes/*54.92*/.HomeController.payment()),format.raw/*54.117*/("""">Payment</a></li>
							<li """),_display_(/*55.13*/if(pagename == "Database")/*55.39*/{_display_(Seq[Any](format.raw/*55.40*/("""class="active"""")))}),format.raw/*55.55*/("""><a href=""""),_display_(/*55.66*/routes/*55.72*/.HomeController.database()),format.raw/*55.98*/("""">Database</a></li>
							<li """),_display_(/*56.13*/if(pagename == "Login")/*56.36*/{_display_(Seq[Any](format.raw/*56.37*/("""class="active"""")))}),format.raw/*56.52*/("""><a href=""""),_display_(/*56.63*/routes/*56.69*/.LoginController.login()),format.raw/*56.93*/("""">Login</a></li>
                        </ul>
                    </div>
                </nav>
        """),_display_(/*60.10*/content),format.raw/*60.17*/("""
    """),format.raw/*61.5*/("""</body>
    <script src=""""),_display_(/*62.19*/routes/*62.25*/.Assets.versioned("javascripts/main.js")),format.raw/*62.65*/(""""></script>
</html>"""))
      }
    }
  }

  def render(pagename:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename) => (content) => apply(pagename)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 18 17:06:04 GMT 2019
                  SOURCE: /home/wdd/play/PlayReminder/app/views/main.scala.html
                  HASH: b536d8306f2f4262a87544bbe74c0813a83bced7
                  MATRIX: 952->1|1079->35|1150->80|1178->88|1318->200|1347->201|1379->206|1499->299|1527->300|1558->304|1598->316|1627->317|1659->322|1760->396|1788->397|1819->401|1863->417|1892->418|1924->423|2000->472|2028->473|2059->477|2114->504|2143->505|2175->510|2245->553|2273->554|2304->558|2352->578|2381->579|2413->584|2456->600|2484->601|2515->605|2550->612|2579->613|2611->618|2799->779|2827->780|2857->783|3333->1232|3348->1238|3392->1261|3552->1394|3582->1415|3621->1416|3667->1431|3705->1442|3720->1448|3765->1471|3841->1520|3875->1545|3914->1546|3960->1561|3998->1572|4013->1578|4060->1603|4118->1634|4153->1660|4192->1661|4238->1676|4276->1687|4291->1693|4338->1719|4397->1751|4429->1774|4468->1775|4514->1790|4552->1801|4567->1807|4612->1831|4745->1937|4773->1944|4805->1949|4858->1975|4873->1981|4934->2021
                  LINES: 28->1|33->2|36->5|36->5|41->10|41->10|42->11|46->15|46->15|47->16|47->16|47->16|48->17|51->20|51->20|52->21|52->21|52->21|53->22|56->25|56->25|57->26|57->26|57->26|58->27|60->29|60->29|61->30|61->30|61->30|62->31|63->32|63->32|64->33|64->33|64->33|65->34|72->41|72->41|73->42|81->50|81->50|81->50|84->53|84->53|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|87->56|91->60|91->60|92->61|93->62|93->62|93->62
                  -- GENERATED --
              */
          