package pages;

import baseconfig.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TsoftSolucionesBusinessPage extends SeleniumBase {

    public TsoftSolucionesBusinessPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);}

    By infoDevelopmentAssessment = By.xpath("//a[text()='Development Assessment']");
    public void clickearDevelopmentAssessment(String str)
    {
        esperaExplicitaElementoClickeable(infoDevelopmentAssessment,3);
        clickearSeccion(infoDevelopmentAssessment,str);
    }
}
