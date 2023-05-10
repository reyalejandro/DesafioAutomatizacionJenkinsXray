package steps;

import baseconfig.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    private Scenario scenario;
    private static final String evidence;
    static{
        evidence = System.getProperty("evidence","fullEvidence");
    }
    @Before
    public void setUp(Scenario scenario){
        this.scenario=scenario;
        DriverManager.resolveDriver();
    }
    @After
    public void closeDriver(){
        DriverManager.getDriver().quit();
    }
    @AfterStep
    public void takeScreenshot()
    {
        if(this.scenario.isFailed())
        {
            generateEvidence("[FAIL] Scenario Screenshots");
        } else if(Hooks.evidence.equalsIgnoreCase("fullEvidence"));{
            generateEvidence("[SUCCESS] Step ScreenShot");
        }
    }

    public void generateEvidence(String imgRefName)
    {
        byte[] screenShot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(screenShot,"image/png", imgRefName);
    }
}
