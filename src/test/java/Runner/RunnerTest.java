package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features", tags="@login",glue = {"StepDefinition"},
plugin = {"pretty", "html:target/HTML-reports/test.html"})


public class RunnerTest {

}
