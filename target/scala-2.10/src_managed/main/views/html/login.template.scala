
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginForm: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Play Blog")/*5.19*/{_display_(Seq[Any](format.raw/*5.20*/("""

    <div class="panel panel-default">
        <div class="panel-heading">
            Login
        </div>
        <div class="panel-body">
            """),_display_(Seq[Any](/*12.14*/if(flash.contains("success"))/*12.43*/ {_display_(Seq[Any](format.raw/*12.45*/("""
            <div class="alert alert-danger">
                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                <strong>"""),_display_(Seq[Any](/*15.26*/flash/*15.31*/.get("success"))),format.raw/*15.46*/("""</strong>
            </div>
            """)))})),format.raw/*17.14*/("""
            """),_display_(Seq[Any](/*18.14*/if(loginForm.hasGlobalErrors)/*18.43*/{_display_(Seq[Any](format.raw/*18.44*/("""
                <div class="alert alert-danger">
                    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                    <strong>"""),_display_(Seq[Any](/*21.30*/loginForm/*21.39*/.globalError.message)),format.raw/*21.59*/("""</strong>
                </div>
            """)))})),format.raw/*23.14*/("""
            """),_display_(Seq[Any](/*24.14*/form(action = routes.Application.authenticate())/*24.62*/{_display_(Seq[Any](format.raw/*24.63*/("""
                <div class="form-horizontal" role="form">
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="email">Email address:</label>
                        <div class="col-sm-4">
                            <input type="email" class="form-control" id="email" name="email" value='"""),_display_(Seq[Any](/*29.102*/loginForm("email")/*29.120*/.value)),format.raw/*29.126*/("""'/>
                        </div>

                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="pwd">Password:</label>
                        <div class="col-sm-4">
                            <input type="password" class="form-control" id="pwd" name="password"/>
                        </div>
                    </div>
                    <div class="checkbox">
                        <label><input type="checkbox"> Remember me</label>
                    </div>
                    <button type="submit" class="btn btn-default">Login</button>
                </div>
            """)))})),format.raw/*44.14*/("""
        </div>
    </div>

""")))})))}
    }
    
    def render(loginForm:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(loginForm)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 24 00:36:40 ICT 2016
                    SOURCE: E:/JIMAT/play-project/user_management/app/views/login.scala.html
                    HASH: 29562a2bc06cd74fbc5d9c45fb9ece0bc37346a2
                    MATRIX: 791->1|938->37|968->59|1005->62|1030->79|1068->80|1266->242|1304->271|1344->273|1548->441|1562->446|1599->461|1675->505|1726->520|1764->549|1803->550|2019->730|2037->739|2079->759|2159->807|2210->822|2267->870|2306->871|2697->1225|2725->1243|2754->1249|3465->1928
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|40->12|40->12|40->12|43->15|43->15|43->15|45->17|46->18|46->18|46->18|49->21|49->21|49->21|51->23|52->24|52->24|52->24|57->29|57->29|57->29|72->44
                    -- GENERATED --
                */
            