
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
        </div class="panel-body">
        <div>
            """),_display_(Seq[Any](/*10.14*/for(p <- posts) yield /*10.29*/{_display_(Seq[Any](format.raw/*10.30*/("""
            """),_display_(Seq[Any](/*11.14*/if(p.getId() % 2 != 0)/*11.36*/{_display_(Seq[Any](format.raw/*11.37*/("""
            <div class="alert alert-success">
                <strong>
                    """),_display_(Seq[Any](/*14.22*/p/*14.23*/.getPostTitle())),format.raw/*14.38*/("""
                </strong>
                <p>"""),_display_(Seq[Any](/*16.21*/p/*16.22*/.getPostContent())),format.raw/*16.39*/("""</p>
                <p>"""),_display_(Seq[Any](/*17.21*/p/*17.22*/.getAuthor().getAuthorName())),format.raw/*17.50*/("""</p>
            </div>
            """)))}/*19.14*/else/*19.18*/{_display_(Seq[Any](format.raw/*19.19*/("""
            <div class="alert alert-info">
                <strong>
                    """),_display_(Seq[Any](/*22.22*/p/*22.23*/.getPostTitle())),format.raw/*22.38*/("""
                </strong>
                <p>"""),_display_(Seq[Any](/*24.21*/p/*24.22*/.getPostContent())),format.raw/*24.39*/("""</p>
                <p>"""),_display_(Seq[Any](/*25.21*/p/*25.22*/.getAuthor().getAuthorName())),format.raw/*25.50*/("""</p>
            </div>
            """)))})),format.raw/*27.14*/("""
            """)))})),format.raw/*28.14*/("""
        </div>
    </div>

""")))})),format.raw/*32.2*/("""
"""))}
    }
    
    def render(posts:List[Post]): play.api.templates.HtmlFormat.Appendable = apply(posts)
    
    def f:((List[Post]) => play.api.templates.HtmlFormat.Appendable) = (posts) => apply(posts)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 23 14:25:09 ICT 2016
                    SOURCE: E:/JIMAT/play-project/user_management/app/views/index.scala.html
                    HASH: 6b73be9ed0069c3665d40308ca6492a39e7e43a3
                    MATRIX: 778->1|891->20|928->23|953->40|992->42|1183->197|1214->212|1253->213|1303->227|1334->249|1373->250|1502->343|1512->344|1549->359|1632->406|1642->407|1681->424|1742->449|1752->450|1802->478|1858->515|1871->519|1910->520|2036->610|2046->611|2083->626|2166->673|2176->674|2215->691|2276->716|2286->717|2336->745|2405->782|2451->796|2511->825
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|39->11|39->11|39->11|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|47->19|47->19|47->19|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|55->27|56->28|60->32
                    -- GENERATED --
                */
            