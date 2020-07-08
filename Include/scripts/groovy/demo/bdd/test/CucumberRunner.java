package demo.bdd.test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Include/features",
		glue = "",
		plugin = {
				"pretty",
				"html:BDDReports/HTML",
				"json:BDDReports/JSON/reports.json"},
		tags = {"@reg and @valid"}
		)
public class CucumberRunner {

}