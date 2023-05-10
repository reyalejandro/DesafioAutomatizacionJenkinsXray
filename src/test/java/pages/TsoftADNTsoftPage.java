package pages;

import baseconfig.SeleniumBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TsoftADNTsoftPage extends SeleniumBase{
    public TsoftADNTsoftPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    By video = By.xpath("//div[@class='elementor-custom-embed-image-overlay']");
    By btnCerrarVideo = By.xpath("//i[@class='eicon-close']");

    public void entrarVideo() {
        clickear(video);
    }
    public void cerrarVideo() {
        clickear(btnCerrarVideo);
    }
}
