package steps;

import baseconfig.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TsoftADNTsoftPage;
import pages.TsoftHomePage;

public class TsoftADNVideoSteps extends DriverManager {
    protected TsoftADNTsoftPage adnPage = null;
    protected TsoftHomePage homePage = null;

    @Given("Ingresar a la pagina de TSOFT")
    public void IngresarTsoftPage() {
        System.out.println("ingreso a TSOFT");
        homePage = new TsoftHomePage(driver);
        adnPage = new TsoftADNTsoftPage(driver);

        homePage.irHomePage();

    }

    @When("Clickeo la seccion de {string}")
    public void ingresoSeccionADNTsoft(String seccion) {
        System.out.println("Busco la palabra " + seccion);
        homePage.clickearSeccionADNTsoft(seccion);
        Assert.assertEquals("https://www.tsoftglobal.com/adn-tsoft/", driver.getCurrentUrl());
    }

    @And("Clickeo el primer video en pantalla")
    public void entroVideo() {
        System.out.println("clickeo el video");
        adnPage.entrarVideo();
    }
    @Then("Cierro el video con la 'X' en la parte superior derecha")
    public void cierroVideo() {
        System.out.println("cierro el video");
        adnPage.cerrarVideo();
    }
}

