
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
                    <a href=""""),_display_(Seq[Any](/*14.31*/routes/*14.37*/.Application.postDetail(p.getId()))),format.raw/*14.71*/("""">"""),_display_(Seq[Any](/*14.74*/p/*14.75*/.getPostTitle())),format.raw/*14.90*/("""</a>
                </h3>
                <p>"""),_display_(Seq[Any](/*16.21*/p/*16.22*/.getPostContent())),format.raw/*16.39*/("""</p>
				<p></p>
                <a href=""""),_display_(Seq[Any](/*18.27*/routes/*18.33*/.Application.authorProfile(p.getAuthor().getId()))),format.raw/*18.82*/("""" class="btn btn-warning btn-sm"><img src=""""),_display_(Seq[Any](/*18.126*/routes/*18.132*/.Assets.at(p.getAuthor().getPictureLocation()))),format.raw/*18.178*/(""""  class="img-rounded" alt="My Picture" width="40" height="40"> <span class="badge">"""),_display_(Seq[Any](/*18.263*/p/*18.264*/.getAuthor().getAuthorName())),format.raw/*18.292*/("""</span></a><br>
                <time>"""),_display_(Seq[Any](/*19.24*/p/*19.25*/.getPostingDate().format("MMM dd yyyy, HH:mm:ss"))),format.raw/*19.74*/("""</time>
            </div>
            """)))}/*21.14*/else/*21.18*/{_display_(Seq[Any](format.raw/*21.19*/("""
            <div class="alert alert-info">
                <h3>
                    <a href=""""),_display_(Seq[Any](/*24.31*/routes/*24.37*/.Application.postDetail(p.getId()))),format.raw/*24.71*/("""">"""),_display_(Seq[Any](/*24.74*/p/*24.75*/.getPostTitle())),format.raw/*24.90*/("""</a>
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
                    DATE: Mon Feb 29 10:33:06 ICT 2016
                    SOURCE: E:/JIMAT/play-project/user_management/app/views/index.scala.html
                    HASH: 31bcf890d50cc5702d970a52ee58a94066e4ebb8
                    MATRIX: 816->1|1007->98|1046->103|1071->120|1110->122|1308->284|1339->299|1378->300|1429->315|1460->337|1499->338|1636->439|1651->445|1707->479|1746->482|1756->483|1793->498|1878->547|1888->548|1927->565|2008->610|2023->616|2094->665|2175->709|2191->715|2260->761|2382->846|2393->847|2444->875|2520->915|2530->916|2601->965|2662->1007|2675->1011|2714->1012|2848->1110|2863->1116|2919->1150|2958->1153|2968->1154|3005->1169|3090->1218|3100->1219|3139->1236|3208->1269|3223->1275|3294->1324|3375->1368|3391->1374|3460->1420|3582->1505|3593->1506|3644->1534|3720->1574|3730->1575|3801->1624|3875->1666|3922->1681|4069->1792|4094->1808|4133->1809|4325->1982|4338->1986|4377->1987|4453->2027|4468->2033|4512->2055|4620->2127|4635->2133|4689->2165|4782->2226|4888->2296|4916->2308|4955->2309|5029->2347|5054->2363|5093->2364|5180->2415|5195->2421|5239->2443|5278->2446|5301->2447|5362->2489|5375->2493|5414->2494|5502->2546|5525->2547|5564->2550|5587->2551|5661->2593|5727->2627|5846->2710|5883->2738|5922->2739|6113->2911|6126->2915|6165->2916|6241->2956|6256->2962|6310->2994|6420->3068|6435->3074|6491->3108|6581->3166|6717->3271
                    LINES: 26->1|29->1|31->3|31->3|31->3|38->10|38->10|38->10|39->11|39->11|39->11|42->14|42->14|42->14|42->14|42->14|42->14|44->16|44->16|44->16|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|52->24|52->24|52->24|52->24|52->24|52->24|54->26|54->26|54->26|56->28|56->28|56->28|56->28|56->28|56->28|56->28|56->28|56->28|57->29|57->29|57->29|59->31|60->32|64->36|64->36|64->36|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|72->44|72->44|72->44|73->45|73->45|73->45|74->46|74->46|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|76->48|77->49|78->50|80->52|80->52|80->52|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|86->58|93->65
                    -- GENERATED --
                */
            