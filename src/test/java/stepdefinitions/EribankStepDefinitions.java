package stepdefinitions;

import com.choucair.app.models.MakePaymentModel;
import com.choucair.app.models.MortgageRequestModel;
import com.choucair.app.questions.ValidateMessage;
import com.choucair.app.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EribankStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que Christian desea iniciar sesion en la aplicacion Eribank con el usuario {string} y contraseña {string}")
    public void queChristianDeseaIniciarSesionEnLaAplicacionEribankConElUsuarioYContraseña(String user, String password) {
        theActorCalled("actor").wasAbleTo(LogIn.app(user, password));
    }

    @Given("Christian desea realizar un pago")
    public void christianDeseaRealizarUnPago(DataTable data) {
        theActorInTheSpotlight().attemptsTo(FillFormMakePayment.fill(MakePaymentModel.setData(data).get(0)));
    }


    @Given("Christian desea realizar una solicitud de hipoteca")
    public void christianDeseaRealizarUnaSolicitudDeHipoteca(DataTable data) {
        theActorInTheSpotlight().attemptsTo(FillFormMortage.fill(MortgageRequestModel.setData(data).get(0)));
    }
    @When("ingresa los datos para diligenciar el formulario")
    public void ingresaLosDatosParaDiligenciarElFormulario(DataTable data) {
        theActorInTheSpotlight().attemptsTo(FillFormMortage.fill(MortgageRequestModel.setData(data).get(0)));
    }

    @Then("^visualiza la pantalla de saldo con el mensaje (.*)$")
    public void visualizaLaPantallaDeSaldoConElMensaje(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ValidateMessage.verifiedPayment(mensaje)));
    }

}
