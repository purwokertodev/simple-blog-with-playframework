
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
object registration extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Author],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(regForm: Form[Author]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Play Blog")/*5.19*/{_display_(Seq[Any](format.raw/*5.20*/("""

<div class="panel panel-default">
    <div class="panel-heading">
        Registration
    </div>
    <div class="panel-body">
        """),_display_(Seq[Any](/*12.10*/if(flash.contains("errors"))/*12.38*/ {_display_(Seq[Any](format.raw/*12.40*/("""
        <div class="alert alert-danger">
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
            <strong>"""),_display_(Seq[Any](/*15.22*/flash/*15.27*/.get("errors"))),format.raw/*15.41*/("""</strong>
        </div>
        """)))})),format.raw/*17.10*/("""
        """),_display_(Seq[Any](/*18.10*/form(action = routes.Registration.registrationFinish(), 'enctype -> "multipart/form-data")/*18.100*/{_display_(Seq[Any](format.raw/*18.101*/("""
        <div class="form-horizontal" role="form">
            <div class="form-group">
                <label class="control-label col-sm-2" for="full_name">Full Name:</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="full_name" name="authorName"/>
                </div>

            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="picture">Profile Picture:</label>
                <div class="col-sm-4">
                    <input type="file" class="form-control" id="picture" name="picture"/>
                </div>

            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="email">Email address:</label>
                <div class="col-sm-4">
                    <input type="email" class="form-control" id="email" name="email"/>
                </div>

            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="website">Website:</label>
                <div class="col-sm-4">
                    <input type="text" class="form-control" id="website" name="website"/>
                </div>

            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="pwd">Password:</label>
                <div class="col-sm-4">
                    <input type="password" class="form-control" id="pwd" name="password"/>
                </div>
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </div>
        """)))})),format.raw/*56.10*/("""
    </div>
</div>

""")))})))}
    }
    
    def render(regForm:Form[Author]): play.api.templates.HtmlFormat.Appendable = apply(regForm)
    
    def f:((Form[Author]) => play.api.templates.HtmlFormat.Appendable) = (regForm) => apply(regForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Feb 24 14:01:23 ICT 2016
                    SOURCE: E:/JIMAT/play-project/user_management/app/views/registration.scala.html
                    HASH: fec21d427ea12506f68a89358a5cb1e5b826b130
                    MATRIX: 787->1|921->24|951->46|988->49|1013->66|1051->67|1232->212|1269->240|1309->242|1501->398|1515->403|1551->417|1619->453|1666->464|1766->554|1806->555|3510->2227
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|40->12|40->12|40->12|43->15|43->15|43->15|45->17|46->18|46->18|46->18|84->56
                    -- GENERATED --
                */
            