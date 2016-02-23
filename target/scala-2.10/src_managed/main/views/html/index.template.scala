
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
                <strong>
                    """),_display_(Seq[Any](/*14.22*/p/*14.23*/.getPostTitle())),format.raw/*14.38*/("""
                </strong>
                <p>"""),_display_(Seq[Any](/*16.21*/p/*16.22*/.getPostContent())),format.raw/*16.39*/("""</p>
                <span>by """),_display_(Seq[Any](/*17.27*/p/*17.28*/.getAuthor().getAuthorName())),format.raw/*17.56*/("""</span>
                <time>"""),_display_(Seq[Any](/*18.24*/p/*18.25*/.getPostingDate().format("MMM dd yyyy, hh:mm:ss"))),format.raw/*18.74*/("""</time>
            </div>
            """)))}/*20.14*/else/*20.18*/{_display_(Seq[Any](format.raw/*20.19*/("""
            <div class="alert alert-info">
                <strong>
                    """),_display_(Seq[Any](/*23.22*/p/*23.23*/.getPostTitle())),format.raw/*23.38*/("""
                </strong>
                <p>"""),_display_(Seq[Any](/*25.21*/p/*25.22*/.getPostContent())),format.raw/*25.39*/("""</p>
                <span>by """),_display_(Seq[Any](/*26.27*/p/*26.28*/.getAuthor().getAuthorName())),format.raw/*26.56*/("""</span>
                <time>"""),_display_(Seq[Any](/*27.24*/p/*27.25*/.getPostingDate().format("MMM dd yyyy, hh:mm:ss"))),format.raw/*27.74*/("""</time>
            </div>
            """)))})),format.raw/*29.14*/("""
            """)))})),format.raw/*30.14*/("""
        </div>
    </div>

""")))})),format.raw/*34.2*/("""
"""))}
    }
    
    def render(posts:List[Post]): play.api.templates.HtmlFormat.Appendable = apply(posts)
    
    def f:((List[Post]) => play.api.templates.HtmlFormat.Appendable) = (posts) => apply(posts)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 23 21:47:26 ICT 2016
                    SOURCE: E:/JIMAT/play-project/user_management/app/views/index.scala.html
                    HASH: 6a8d14bd7e49d96a0f1651f83e8f05bebd65cb2c
                    MATRIX: 778->1|891->20|928->23|953->40|992->42|1183->197|1214->212|1253->213|1303->227|1334->249|1373->250|1502->343|1512->344|1549->359|1632->406|1642->407|1681->424|1748->455|1758->456|1808->484|1875->515|1885->516|1956->565|2015->605|2028->609|2067->610|2193->700|2203->701|2240->716|2323->763|2333->764|2372->781|2439->812|2449->813|2499->841|2566->872|2576->873|2647->922|2719->962|2765->976|2825->1005
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|39->11|39->11|39->11|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|48->20|51->23|51->23|51->23|53->25|53->25|53->25|54->26|54->26|54->26|55->27|55->27|55->27|57->29|58->30|62->34
                    -- GENERATED --
                */
            