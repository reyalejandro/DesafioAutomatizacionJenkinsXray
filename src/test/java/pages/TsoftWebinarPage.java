package pages;

import baseconfig.SeleniumBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TsoftWebinarPage extends SeleniumBase {
    public TsoftWebinarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);}
    By btnTsoftInspiracion = By.xpath("//span[text()='Volver a Tsoft Inspiración']");


    public void clickVolverTsoftInspiracion(String str)
    {
        esperaExplicitaElementoClickeable(btnTsoftInspiracion,3);
        clickearSeccion(btnTsoftInspiracion,str);
    }
}
