package steps;

import baseconfig.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TsoftSolucionesBusinessPage;
import pages.TsoftHomePage;
import pages.TsoftSolucionesPage;

public class SolucionesClickDevelopmentAssessmentSteps extends DriverManager {
    protected TsoftHomePage homePage = null;
    protected TsoftSolucionesBusinessPage businessPage = null;
    protected TsoftSolucionesPage solucionesPage = null;

    @Given("Ingresar a la pagina de TSOFT2")
    public void IngresarTsoftPage2() {
        System.out.println("ingreso a Tsoft");
        homePage = new TsoftHomePage(driver);
        businessPage = new TsoftSolucionesBusinessPage(driver);
        solucionesPage = new TsoftSolucionesPage(driver);

        homePage.irHomePage();
    }

    @When("Clickear seccion {string}")
    public void ClickearApartadoSoluciones(String seccion) {
        System.out.println("clickea el apartado " + seccion);
        homePage.clickearSeccionSoluciones(seccion);
    }


    @And("Clickeo la opcion {string}")
    public void clickearBusinessSystemTeams(String seccion) {
        System.out.println("Clickeo la opcion "+ seccion);
        solucionesPage.clickearBusiness();
        Assert.assertEquals("https://www.tsoftglobal.com/soluciones/business-system-teams/", driver.getCurrentUrl());
    }



    @Then("clickeo la seccion {string}")
    public void clickeoDevelopmentAssessment(String seccion) {
        System.out.println("clickeo seccion " + seccion);
        businessPage.clickearDevelopmentAssessment(seccion);
    }
}
