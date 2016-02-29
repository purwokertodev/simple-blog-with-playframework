
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
            <span class="close" data-dismiss="alert">&times;</span>
            <strong>"""),_display_(Seq[Any](/*15.22*/flash/*15.27*/.get("errors"))),format.raw/*15.41*/("""</strong>
        </div>
        """)))})),format.raw/*17.10*/("""
        """),_display_(Seq[Any](/*18.10*/form(action = routes.Registration.registrationFinish(), 'enctype -> "multipart/form-data")/*18.100*/{_display_(Seq[Any](format.raw/*18.101*/("""
        <div class="form-horizontal" role="form">
            <div class="form-group">
                <label class="control-label col-sm-2" for="full_name">Full Name:</label>
                <div class="col-sm-4">
                    <input type="text" required="true" class="form-control" id="full_name" name="authorName" placeholder="Full name"/>
                </div>

            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="picture">Profile Picture:</label>
                <div class="col-sm-4">
                    <input type="file" required="true" class="form-control" id="picture" name="picture"/>
                </div>
            </div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="picture">Picture preview:</label>
				<div class="col-sm-4">
					<img id="image_upload_preview" class="img-rounded" alt="My Picture" width="304" height="236">
				</div>
			</div>
			<script type="text/javascript">
				    function readURL(input) """),format.raw/*40.33*/("""{"""),format.raw/*40.34*/("""
					if (input.files && input.files[0]) """),format.raw/*41.41*/("""{"""),format.raw/*41.42*/("""
						var reader = new FileReader();

						reader.onload = function (e) """),format.raw/*44.36*/("""{"""),format.raw/*44.37*/("""
							$('#image_upload_preview').attr('src', e.target.result);
						"""),format.raw/*46.7*/("""}"""),format.raw/*46.8*/("""

						reader.readAsDataURL(input.files[0]);
					"""),format.raw/*49.6*/("""}"""),format.raw/*49.7*/("""
				"""),format.raw/*50.5*/("""}"""),format.raw/*50.6*/("""

				$("#picture").change(function () """),format.raw/*52.38*/("""{"""),format.raw/*52.39*/("""
					readURL(this);
				"""),format.raw/*54.5*/("""}"""),format.raw/*54.6*/(""");
			</script>
            <div class="form-group">
                <label class="control-label col-sm-2" for="email">Email address:</label>
                <div class="col-sm-4">
                    <input type="email" required="true" class="form-control" id="email" name="email" placeholder="Email"/>
                </div>

            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="website">Website:</label>
                <div class="col-sm-4">
                    <input type="text" required="true" class="form-control" id="website" name="website" placeholder="Website"/>
                </div>

            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="pwd">Password:</label>
                <div class="col-sm-4">
                    <input type="password" required="true" class="form-control" id="pwd1" name="password" placeholder="Password" onchange="checkPassword(); return false;" onkeyup="checkPassword(); return false;"/>
                </div>
				<span id="passwordLengthMessage"></span>
            </div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="pwd2">Confirm Password:</label>
				<div class="col-sm-4">
					<input type="password" required="true" class="form-control" id="pwd2" name="password2" placeholder="Type your password again" onchange="checkPassord(); return false;" onkeyup="checkPassword(); return false;"/>
				</div>
				<span id="confirmMessage"></span>
			</div>
            <button type="submit" class="btn btn-primary" id="sm_button" disabled="true">Submit</button>
        </div>
        """)))})),format.raw/*86.10*/("""
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
                    DATE: Mon Feb 29 20:08:40 ICT 2016
                    SOURCE: E:/JIMAT/play-project/user_management/app/views/registration.scala.html
                    HASH: b25b3e5ed5803ea09e11c9485a8f26d080e99320
                    MATRIX: 787->1|921->24|951->46|988->49|1013->66|1051->67|1232->212|1269->240|1309->242|1479->376|1493->381|1529->395|1597->431|1644->442|1744->532|1784->533|2868->1589|2897->1590|2967->1632|2996->1633|3101->1710|3130->1711|3230->1784|3258->1785|3339->1839|3367->1840|3400->1846|3428->1847|3497->1888|3526->1889|3580->1916|3608->1917|5347->3624
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|40->12|40->12|40->12|43->15|43->15|43->15|45->17|46->18|46->18|46->18|68->40|68->40|69->41|69->41|72->44|72->44|74->46|74->46|77->49|77->49|78->50|78->50|80->52|80->52|82->54|82->54|114->86
                    -- GENERATED --
                */
            