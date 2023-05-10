package baseconfig;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumBase {
    WebDriver driver;
    public SeleniumBase(WebDriver driver){
        this.driver = driver;
    }
    public void esperaExplicitaPrescenciaElemento(By localizador, int time) {
        WebDriverWait espera;
        espera = new WebDriverWait(driver, Duration.ofSeconds(time));
        espera.until(ExpectedConditions.presenceOfElementLocated(localizador));
    }

    public void esperaExplicitaElementoClickeable(By localizador, int time) {
        WebDriverWait espera;
        espera = new WebDriverWait(driver, Duration.ofSeconds(time));
        espera.until(ExpectedConditions.elementToBeClickable(localizador));
    }

    public WebElement encontrarElemento(By localizador) {
        return driver.findElement(localizador);
    }

    public void irUrl(String URL) {
        driver.get(URL);
    }

    public void clickear(By localizador) {
        WebElement element = encontrarElemento(localizador);
        boolean isclicked;
        try {
            esperaExplicitaElementoClickeable(localizador, 10);
            element.click();
            isclicked = true;
        } catch (Exception e) {
            isclicked = false;
        }
        Assert.assertTrue(isclicked);
    }

    public String obtenerTexto(By localizador) {
        return encontrarElemento(localizador).getText();
    }

    public void  clickearSeccion(By localizador,String seccion)
    {
        esperaExplicitaPrescenciaElemento(localizador, 10);
        Assert.assertEquals(obtenerTexto(localizador), seccion);
        clickear(localizador);
    }

}
