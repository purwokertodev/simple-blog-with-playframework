
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
              <li class="active"><a href=""""),_display_(Seq[Any](/*28.44*/routes/*28.50*/.Application.index())),format.raw/*28.70*/("""">Home</a></li>
              <li><a href=""""),_display_(Seq[Any](/*29.29*/routes/*29.35*/.Registration.registration())),format.raw/*29.63*/("""">Registration</a></li>
              <li><a href=""""),_display_(Seq[Any](/*30.29*/routes/*30.35*/.Application.login())),format.raw/*30.55*/("""">Login</a></li>
            </ul>
          </div>
        </nav>
            """),_display_(Seq[Any](/*34.14*/content)),format.raw/*34.21*/("""
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
                    DATE: Wed Feb 24 16:10:49 ICT 2016
                    SOURCE: E:/JIMAT/play-project/user_management/app/views/main.scala.html
                    HASH: ca38cb55284bd705b805a7b4569b843519c576b8
                    MATRIX: 778->1|902->31|990->84|1016->89|1113->151|1127->157|1182->191|1273->247|1287->253|1347->292|1439->348|1454->354|1520->397|1617->458|1632->464|1686->496|1747->521|1762->527|1829->572|1922->629|1937->635|1997->673|2090->730|2105->736|2169->778|2711->1284|2726->1290|2768->1310|2848->1354|2863->1360|2913->1388|3001->1440|3016->1446|3058->1466|3174->1546|3203->1553
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|62->34|62->34
                    -- GENERATED --
                */
            