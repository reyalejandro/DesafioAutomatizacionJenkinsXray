package pages;

import baseconfig.DriverManager;
import baseconfig.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TsoftHomePage extends SeleniumBase{

    public TsoftHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);}

    By btnADNTsoftSeccion = By.xpath("//a[contains(text(),'ADN TSOFT')]");
    By btnSolucionesSeccion = By.xpath("//a[text()='SOLUCIONES']");
    By btnEventosSeccion = By.xpath("//a[text()='EVENTOS']");
    public void irHomePage(){
        irUrl("https://www.tsoftglobal.com/");
    }

    public void clickearSeccionADNTsoft(String str)
    {
        clickearSeccion(btnADNTsoftSeccion,str);
    }
    public void clickearSeccionSoluciones(String str)
    {
        clickearSeccion(btnSolucionesSeccion,str);
        clickearSeccion(btnSolucionesSeccion,str);
    }
    public void clickearSeccionEventos(String str)
    {
        clickearSeccion(btnEventosSeccion,str);
    }
}
