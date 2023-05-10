package steps;

import baseconfig.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TsoftEventosPage;
import pages.TsoftHomePage;
import pages.TsoftWebinarPage;

public class EventosClickDevopsSteps extends DriverManager {
    protected TsoftHomePage homePage = null;
    protected TsoftEventosPage eventosPage = null;
    protected TsoftWebinarPage webinarPage = null;

    @Given("Ingresar a la pagina de TSOFT3")
    public void IngresarTsoftPage3() {
        System.out.println("ingreso a Tsoft");
        homePage = new TsoftHomePage(driver);
        eventosPage = new TsoftEventosPage(driver);
        webinarPage = new TsoftWebinarPage(driver);
        homePage.irHomePage();
    }

    @When("Entro a la seccion {string}")
    public void ingresoEventosSeccion(String seccion) {
        System.out.println("Ingreso a la seccion " + seccion);
        homePage.clickearSeccionEventos(seccion);
        Assert.assertEquals("https://www.tsoftglobal.com/eventos/", driver.getCurrentUrl());
    }

    @And("Clickeo dentro del apartado {string} la webinar {string}")
    public void clickWebinar(String apartado, String webinar) {

        System.out.println("Ingreso al apartado " + apartado + "y entro a la webinar" + webinar);
        //Ademas de clickear la webinar, verifica si el titulo "biblioteca de webinars" se encuentra en la pagina
        eventosPage.clickearWebinarDevops(apartado);
    }

    @Then("Clickeo en el boton {string}")
    public void clickBtnTsoftInspiracion(String btnTsoftInspiracion) {
        System.out.println("clickeo el boton " + btnTsoftInspiracion);
        webinarPage.clickVolverTsoftInspiracion(btnTsoftInspiracion);
    }
}