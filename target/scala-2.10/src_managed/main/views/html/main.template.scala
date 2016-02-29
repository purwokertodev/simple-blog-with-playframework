
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*9.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*10.103*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*12.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*13.23*/routes/*13.29*/.Assets.at("javascripts/bootstrap.js"))),format.raw/*13.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*14.71*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*15.17*/routes/*15.23*/.Assets.at("javascripts/password-check.js"))),format.raw/*15.66*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("javascripts/my-play.js"))),format.raw/*16.65*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*17.17*/routes/*17.23*/.Assets.at("javascripts/upload_prev.js"))),format.raw/*17.63*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div class="jumbotron text-center">
            <h1>Play Blog</h1>
            <p>Lets play some blog</p>
        </div>
        <div class="container">
        <nav class="navbar navbar-inverse">
          <div class="container-fluid">
            <div class="navbar-header">
              <a class="navbar-brand" href="#">Play Blog</a>
            </div>
            <ul class="nav navbar-nav">
              <li><a href=""""),_display_(Seq[Any](/*31.29*/routes/*31.35*/.Application.index())),format.raw/*31.55*/("""">Home</a></li>
              <li><a href=""""),_display_(Seq[Any](/*32.29*/routes/*32.35*/.Registration.registration())),format.raw/*32.63*/("""">Registration</a></li>
              <li><a href=""""),_display_(Seq[Any](/*33.29*/routes/*33.35*/.Application.login())),format.raw/*33.55*/("""">Login</a></li>
            </ul>
          </div>
        </nav>
            """),_display_(Seq[Any](/*37.14*/content)),format.raw/*37.21*/("""
        </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Feb 29 17:56:51 ICT 2016
                    SOURCE: E:/JIMAT/play-project/user_management/app/views/main.scala.html
                    HASH: 13fdbce136539dfdae89648756aac560d52f62b8
                    MATRIX: 778->1|902->31|996->90|1022->95|1120->158|1134->164|1189->198|1281->255|1295->261|1355->300|1448->357|1463->363|1529->406|1627->468|1642->474|1696->506|1758->532|1773->538|1840->583|1934->641|1949->647|2009->685|2103->743|2118->749|2182->791|2270->843|2285->849|2350->892|2444->950|2459->956|2517->992|2605->1044|2620->1050|2682->1090|3223->1595|3238->1601|3280->1621|3361->1666|3376->1672|3426->1700|3515->1753|3530->1759|3572->1779|3692->1863|3721->1870
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|59->31|59->31|59->31|60->32|60->32|60->32|61->33|61->33|61->33|65->37|65->37
                    -- GENERATED --
                */
            