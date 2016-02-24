
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Post],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(posts: List[Post]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""

"""),_display_(Seq[Any](/*3.2*/main("Play Blog")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

    <div class="panel panel-default">
        <div class="panel-heading">
            Posts
        </div>
        <div class="panel-body">
            """),_display_(Seq[Any](/*10.14*/for(p <- posts) yield /*10.29*/{_display_(Seq[Any](format.raw/*10.30*/("""
            """),_display_(Seq[Any](/*11.14*/if(p.getId() % 2 != 0)/*11.36*/{_display_(Seq[Any](format.raw/*11.37*/("""
            <div class="alert alert-success">
                <h3>
                    """),_display_(Seq[Any](/*14.22*/p/*14.23*/.getPostTitle())),format.raw/*14.38*/("""
                </h3>
                <p>"""),_display_(Seq[Any](/*16.21*/p/*16.22*/.getPostContent())),format.raw/*16.39*/("""</p>
				<p></p>
                <a href="#" class="btn btn-warning btn-sm"><img src=""""),_display_(Seq[Any](/*18.71*/routes/*18.77*/.Assets.at(p.getAuthor().getPictureLocation()))),format.raw/*18.123*/(""""  class="img-rounded" alt="My Picture" width="40" height="40"> <span class="badge">"""),_display_(Seq[Any](/*18.208*/p/*18.209*/.getAuthor().getAuthorName())),format.raw/*18.237*/("""</span></a><br>
                <time>"""),_display_(Seq[Any](/*19.24*/p/*19.25*/.getPostingDate().format("MMM dd yyyy, HH:mm:ss"))),format.raw/*19.74*/("""</time>
            </div>
            """)))}/*21.14*/else/*21.18*/{_display_(Seq[Any](format.raw/*21.19*/("""
            <div class="alert alert-info">
                <h3>
                    """),_display_(Seq[Any](/*24.22*/p/*24.23*/.getPostTitle())),format.raw/*24.38*/("""
                </h3>
                <p>"""),_display_(Seq[Any](/*26.21*/p/*26.22*/.getPostContent())),format.raw/*26.39*/("""</p>
				<p></p>
				<a href="#" class="btn btn-warning btn-sm"><img src=""""),_display_(Seq[Any](/*28.59*/routes/*28.65*/.Assets.at(p.getAuthor().getPictureLocation()))),format.raw/*28.111*/(""""  class="img-rounded" alt="My Picture" width="40" height="40"> <span class="badge">"""),_display_(Seq[Any](/*28.196*/p/*28.197*/.getAuthor().getAuthorName())),format.raw/*28.225*/("""</span></a><br>
                <time>"""),_display_(Seq[Any](/*29.24*/p/*29.25*/.getPostingDate().format("MMM dd yyyy, HH:mm:ss"))),format.raw/*29.74*/("""</time>
            </div>
            """)))})),format.raw/*31.14*/("""
            """)))})),format.raw/*32.14*/("""
        </div>
    </div>

""")))})),format.raw/*36.2*/("""
"""))}
    }
    
    def render(posts:List[Post]): play.api.templates.HtmlFormat.Appendable = apply(posts)
    
    def f:((List[Post]) => play.api.templates.HtmlFormat.Appendable) = (posts) => apply(posts)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 24 21:25:50 ICT 2016
                    SOURCE: E:/JIMAT/play-project/user_management/app/views/index.scala.html
                    HASH: 68dd3ff29fb2483670e37eff0c2d03b97ffaef9b
                    MATRIX: 778->1|891->20|928->23|953->40|992->42|1183->197|1214->212|1253->213|1303->227|1334->249|1373->250|1498->339|1508->340|1545->355|1624->398|1634->399|1673->416|1796->503|1811->509|1880->555|2002->640|2013->641|2064->669|2139->708|2149->709|2220->758|2279->798|2292->802|2331->803|2453->889|2463->890|2500->905|2579->948|2589->949|2628->966|2739->1041|2754->1047|2823->1093|2945->1178|2956->1179|3007->1207|3082->1246|3092->1247|3163->1296|3235->1336|3281->1350|3341->1379
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|39->11|39->11|39->11|42->14|42->14|42->14|44->16|44->16|44->16|46->18|46->18|46->18|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|52->24|52->24|52->24|54->26|54->26|54->26|56->28|56->28|56->28|56->28|56->28|56->28|57->29|57->29|57->29|59->31|60->32|64->36
                    -- GENERATED --
                */
            