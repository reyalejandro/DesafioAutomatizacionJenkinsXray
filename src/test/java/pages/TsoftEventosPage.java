package pages;

import baseconfig.SeleniumBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class TsoftEventosPage extends SeleniumBase {
    public TsoftEventosPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);}
    By sectionBibliotecaWebinar = By.xpath("//h2[text()='BIBLIOTECA DE']");
    By btnWebinarDevops = By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/section[11]/div/div/div[2]/div/div/div[4]/div/div/a");


    public void clickearWebinarDevops (String apartado)
    {
        esperaExplicitaPrescenciaElemento(sectionBibliotecaWebinar,3);
        Assert.assertTrue(obtenerTexto(sectionBibliotecaWebinar).contains(apartado));
        clickear(btnWebinarDevops);
    }

}
