package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import steps.Hooks;


@RunWith(Cucumber.class)
@CucumberOptions(glue = "steps",
        plugin={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtenerCucumberAdapter:"
        ,"json:results/cucumber.json"
        ,"junit:results/cucumber.xml"},
        features = "src/test/resources/features")
public class BaseRunner extends Hooks {

}

