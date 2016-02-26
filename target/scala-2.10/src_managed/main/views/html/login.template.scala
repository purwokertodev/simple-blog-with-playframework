
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
            <div class="alert alert-info">
                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                <strong>"""),_display_(Seq[Any](/*15.26*/flash/*15.31*/.get("success"))),format.raw/*15.46*/("""</strong>
            </div>
            """)))})),format.raw/*17.14*/("""
            """),_display_(Seq[Any](/*18.14*/if(flash.contains("errors"))/*18.42*/ {_display_(Seq[Any](format.raw/*18.44*/("""
            <div class="alert alert-danger">
                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                <strong>"""),_display_(Seq[Any](/*21.26*/flash/*21.31*/.get("errors"))),format.raw/*21.45*/("""</strong>
            </div>
            """)))})),format.raw/*23.14*/("""
            """),_display_(Seq[Any](/*24.14*/form(action = routes.Application.authenticate())/*24.62*/{_display_(Seq[Any](format.raw/*24.63*/("""
                <div class="form-horizontal" role="form">
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="email">Email address:</label>
                        <div class="col-sm-4">
                            <input type="email" class="form-control" id="email" name="email" value='"""),_display_(Seq[Any](/*29.102*/loginForm("email")/*29.120*/.value)),format.raw/*29.126*/("""' placeholder="Your Email"/>
                        </div>

                    </div>
                    <div class="form-group">
                        <label class="control-label col-sm-2" for="pwd">Password:</label>
                        <div class="col-sm-4">
                            <input type="password" class="form-control" id="pwd" name="password" placeholder="Your Password" onchange="checkLoginForm(); return false;" onkeyup="checkLoginForm(); return false;"/>
                        </div>
                    </div>
                    <div class="checkbox">
                        <label><input type="checkbox"> Remember me</label>
                    </div>
                    <button type="submit" class="btn btn-default" id="login_button" disabled="true"">Login</button>
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
                    DATE: Fri Feb 26 17:30:26 ICT 2016
                    SOURCE: E:/JIMAT/play-project/user_management/app/views/login.scala.html
                    HASH: 3bd1ce3dd468dd2c33457ad34659cbf47edd03e0
                    MATRIX: 791->1|938->37|968->59|1005->62|1030->79|1068->80|1266->242|1304->271|1344->273|1546->439|1560->444|1597->459|1673->503|1724->518|1761->546|1801->548|2005->716|2019->721|2055->735|2131->779|2182->794|2239->842|2278->843|2669->1197|2697->1215|2726->1221|3610->2073
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|40->12|40->12|40->12|43->15|43->15|43->15|45->17|46->18|46->18|46->18|49->21|49->21|49->21|51->23|52->24|52->24|52->24|57->29|57->29|57->29|72->44
                    -- GENERATED --
                */
            