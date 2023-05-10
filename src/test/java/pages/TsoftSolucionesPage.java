package pages;

import baseconfig.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TsoftSolucionesPage extends SeleniumBase{
    public TsoftSolucionesPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    By btnBusiness = By.xpath("(//img[@src='https://www.tsoftglobal.com/wp-content/uploads/elementor/thumbs/icono-bst-p8bk675tgqoo4mhw3gxfonszmbfqhsw5iwby3mimlk.png'])[2]");

    public void clickearBusiness() {
        clickear(btnBusiness);
    }
}
