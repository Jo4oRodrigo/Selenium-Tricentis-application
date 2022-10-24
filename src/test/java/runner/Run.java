package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/resources",
		glue = "steps",
		tags = "@formulario",
		dryRun = false,
		plugin = {"pretty","html:target/reporte.html"},
		monochrome = true
		
		)

public class Run {

}