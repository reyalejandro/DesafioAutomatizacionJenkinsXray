package pages;

import baseconfig.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TsoftHomePage extends SeleniumBase{

    public TsoftHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);}

    By btnADNTsoftSeccion = By.xpath("//a[contains(text(),'ADN TSOFT')]");
    By btnSolucionesSeccion = By.xpath("//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-4549']");
    By btnSolucionesBusinessSeccion = By.xpath("//a[text()='BUSINESS SYSTEM TEAMS']");
    By btnEventosSeccion = By.xpath("//a[text()='EVENTOS']");
    public void irHomePage(){
        irUrl("https://www.tsoftglobal.com/");
    }

    public void clickearSeccionADNTsoft(String str)
    {
        clickearSeccion(btnADNTsoftSeccion,str);
    }

    public void hovearSeccionSolucionesApartadoBusiness(String str)
    {
        hoverElement(btnSolucionesSeccion,str,btnSolucionesBusinessSeccion);
    }
    public void clickearSeccionSolucionesApartadoBusiness(String str)
    {
        clickearSeccion(btnSolucionesBusinessSeccion,str);
    }
    public void clickearSeccionEventos(String str)
    {
        clickearSeccion(btnEventosSeccion,str);
    }
}
