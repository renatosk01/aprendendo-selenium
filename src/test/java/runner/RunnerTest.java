package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
        glue = "stepsDefinitions",
        tags = "@google",
        plugin = {"pretty", "html:evidencias/cucumber-report.html"})
public class RunnerTest {
}
