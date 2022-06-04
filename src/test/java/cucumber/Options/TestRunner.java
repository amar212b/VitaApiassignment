package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)


@CucumberOptions(features="src/test/java/features",glue = "stepDefinations",monochrome=true,dryRun = false,
plugin = {"pretty","html:target/cucumber.html",
		"json:target/cucumber.json",
		"rerun:target/failed_scenarios.txt"},publish = true)

public class TestRunner {

}
