package steps;

import baseconfig.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TsoftSolucionesBusinessPage;
import pages.TsoftHomePage;

public class SolucionesClickDevelopmentAssessmentSteps extends DriverManager {
    protected TsoftHomePage homePage = null;
    protected TsoftSolucionesBusinessPage solucionesPage = null;

    @Given("Ingresar a la pagina de TSOFT2")
    public void IngresarTsoftPage2() {
        System.out.println("ingreso a Tsoft");
        homePage = new TsoftHomePage(driver);
        solucionesPage = new TsoftSolucionesBusinessPage(driver);

        homePage.irHomePage();
    }

    @When("Colapsar lista en apartado {string}")
    public void ColapsarApartadoSoluciones(String seccion) {
        System.out.println("colapso el apartado " + seccion);
        homePage.hovearSeccionSolucionesApartadoBusiness(seccion);
    }


    @And("Clickeo la opcion {string}")
    public void clickearBusinessSystemTeams(String seccion) {
        System.out.println("Clickeo la opcion "+ seccion);
        homePage.clickearSeccionSolucionesApartadoBusiness(seccion);
        Assert.assertEquals("https://www.tsoftglobal.com/soluciones/business-system-teams/", driver.getCurrentUrl());
    }



    @Then("clickeo la seccion {string}")
    public void clickeoDevelopmentAssessment(String seccion) {
        System.out.println("clickeo seccion " + seccion);
        solucionesPage.clickearDevelopmentAssessment(seccion);
    }
}
