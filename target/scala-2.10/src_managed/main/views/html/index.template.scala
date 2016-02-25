
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[List[Post],Integer,List[Integer],Integer,Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(posts: List[Post], current:Integer, li:List[Integer], totalHalaman: Integer, totalData: Integer):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.99*/("""

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
                <a href=""""),_display_(Seq[Any](/*18.27*/routes/*18.33*/.Application.authorProfile(p.getAuthor().getId()))),format.raw/*18.82*/("""" class="btn btn-warning btn-sm"><img src=""""),_display_(Seq[Any](/*18.126*/routes/*18.132*/.Assets.at(p.getAuthor().getPictureLocation()))),format.raw/*18.178*/(""""  class="img-rounded" alt="My Picture" width="40" height="40"> <span class="badge">"""),_display_(Seq[Any](/*18.263*/p/*18.264*/.getAuthor().getAuthorName())),format.raw/*18.292*/("""</span></a><br>
                <time>"""),_display_(Seq[Any](/*19.24*/p/*19.25*/.getPostingDate().format("MMM dd yyyy, HH:mm:ss"))),format.raw/*19.74*/("""</time>
            </div>
            """)))}/*21.14*/else/*21.18*/{_display_(Seq[Any](format.raw/*21.19*/("""
            <div class="alert alert-info">
                <h3>
                    """),_display_(Seq[Any](/*24.22*/p/*24.23*/.getPostTitle())),format.raw/*24.38*/("""
                </h3>
                <p>"""),_display_(Seq[Any](/*26.21*/p/*26.22*/.getPostContent())),format.raw/*26.39*/("""</p>
				<p></p>
				<a href=""""),_display_(Seq[Any](/*28.15*/routes/*28.21*/.Application.authorProfile(p.getAuthor().getId()))),format.raw/*28.70*/("""" class="btn btn-warning btn-sm"><img src=""""),_display_(Seq[Any](/*28.114*/routes/*28.120*/.Assets.at(p.getAuthor().getPictureLocation()))),format.raw/*28.166*/(""""  class="img-rounded" alt="My Picture" width="40" height="40"> <span class="badge">"""),_display_(Seq[Any](/*28.251*/p/*28.252*/.getAuthor().getAuthorName())),format.raw/*28.280*/("""</span></a><br>
                <time>"""),_display_(Seq[Any](/*29.24*/p/*29.25*/.getPostingDate().format("MMM dd yyyy, HH:mm:ss"))),format.raw/*29.74*/("""</time>
            </div>
            """)))})),format.raw/*31.14*/("""
            """)))})),format.raw/*32.14*/("""
            <table align="center">
                <tr>
                    <td>
                        """),_display_(Seq[Any](/*36.26*/if(current == 1)/*36.42*/{_display_(Seq[Any](format.raw/*36.43*/("""
                            <a href="#" class="btn btn-info">First</a>
                            <a href="#" class="btn btn-success">Prev</a>
                        """)))}/*39.26*/else/*39.30*/{_display_(Seq[Any](format.raw/*39.31*/("""
                            <a href=""""),_display_(Seq[Any](/*40.39*/routes/*40.45*/.Application.paging(1))),format.raw/*40.67*/("""" class="btn btn-info">First</a>
                            <a href=""""),_display_(Seq[Any](/*41.39*/routes/*41.45*/.Application.paging(current - 1))),format.raw/*41.77*/("""" class="btn btn-success">Prev</a>
                        """)))})),format.raw/*42.26*/("""
                        <!-- Page -->
                        <!--"""),_display_(Seq[Any](/*44.30*/for(i <- li) yield /*44.42*/{_display_(Seq[Any](format.raw/*44.43*/("""-->
                            <!--"""),_display_(Seq[Any](/*45.34*/if(i == current)/*45.50*/{_display_(Seq[Any](format.raw/*45.51*/("""-->
                                <!--<a href=""""),_display_(Seq[Any](/*46.47*/routes/*46.53*/.Application.paging(i))),format.raw/*46.75*/("""">"""),_display_(Seq[Any](/*46.78*/i)),format.raw/*46.79*/("""</a>-->
                            <!--""")))}/*47.34*/else/*47.38*/{_display_(Seq[Any](format.raw/*47.39*/("""-->
                                 <!--<a href=""""),_display_(Seq[Any](/*48.48*/i)),format.raw/*48.49*/("""">"""),_display_(Seq[Any](/*48.52*/i)),format.raw/*48.53*/("""</a>-->
                            <!--""")))})),format.raw/*49.34*/("""-->
                        <!--""")))})),format.raw/*50.30*/("""-->
                        <!-- Next and last page -->
                        """),_display_(Seq[Any](/*52.26*/if(current == totalHalaman )/*52.54*/{_display_(Seq[Any](format.raw/*52.55*/("""
                            <a href="#" class="btn btn-success">Next</a>
                            <a href="#" class="btn btn-info">Last</a>
                        """)))}/*55.26*/else/*55.30*/{_display_(Seq[Any](format.raw/*55.31*/("""
                            <a href=""""),_display_(Seq[Any](/*56.39*/routes/*56.45*/.Application.paging(current + 1))),format.raw/*56.77*/("""" class="btn btn-success">Next</a>
                            <a href=""""),_display_(Seq[Any](/*57.39*/routes/*57.45*/.Application.paging(totalHalaman ))),format.raw/*57.79*/("""" class="btn btn-info">Last</a>
                        """)))})),format.raw/*58.26*/("""
                    </td>
                </tr>
            </table>
        </div>
    </div>

""")))})),format.raw/*65.2*/("""
"""))}
    }
    
    def render(posts:List[Post],current:Integer,li:List[Integer],totalHalaman:Integer,totalData:Integer): play.api.templates.HtmlFormat.Appendable = apply(posts,current,li,totalHalaman,totalData)
    
    def f:((List[Post],Integer,List[Integer],Integer,Integer) => play.api.templates.HtmlFormat.Appendable) = (posts,current,li,totalHalaman,totalData) => apply(posts,current,li,totalHalaman,totalData)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Feb 25 15:59:41 ICT 2016
                    SOURCE: E:/JIMAT/play-project/user_management/app/views/index.scala.html
                    HASH: dcb0000bfb52d551a7d9f7f94b10df8a6b9bccfb
                    MATRIX: 816->1|1007->98|1046->103|1071->120|1110->122|1308->284|1339->299|1378->300|1429->315|1460->337|1499->338|1627->430|1637->431|1674->446|1755->491|1765->492|1804->509|1885->554|1900->560|1971->609|2052->653|2068->659|2137->705|2259->790|2270->791|2321->819|2397->859|2407->860|2478->909|2539->951|2552->955|2591->956|2716->1045|2726->1046|2763->1061|2844->1106|2854->1107|2893->1124|2962->1157|2977->1163|3048->1212|3129->1256|3145->1262|3214->1308|3336->1393|3347->1394|3398->1422|3474->1462|3484->1463|3555->1512|3629->1554|3676->1569|3823->1680|3848->1696|3887->1697|4079->1870|4092->1874|4131->1875|4207->1915|4222->1921|4266->1943|4374->2015|4389->2021|4443->2053|4536->2114|4642->2184|4670->2196|4709->2197|4783->2235|4808->2251|4847->2252|4934->2303|4949->2309|4993->2331|5032->2334|5055->2335|5116->2377|5129->2381|5168->2382|5256->2434|5279->2435|5318->2438|5341->2439|5415->2481|5481->2515|5600->2598|5637->2626|5676->2627|5867->2799|5880->2803|5919->2804|5995->2844|6010->2850|6064->2882|6174->2956|6189->2962|6245->2996|6335->3054|6471->3159
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|39->11|39->11|39->11|42->14|42->14|42->14|44->16|44->16|44->16|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|52->24|52->24|52->24|54->26|54->26|54->26|56->28|56->28|56->28|56->28|56->28|56->28|56->28|56->28|56->28|57->29|57->29|57->29|59->31|60->32|64->36|64->36|64->36|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|76->48|77->49|78->50|80->52|80->52|80->52|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|86->58|93->65
                    -- GENERATED --
                */
            