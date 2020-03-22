package runners;

        import cucumber.api.CucumberOptions;

        import cucumber.api.junit.Cucumber;
        import utility.hooks;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"}
        , glue = {"steps", "pageObjects", "pageActions", "helpers", "runners", "utility", "features"}
        , plugin = {"pretty", "html:target/cucumber-reports", "json:target/jsonReports/cucumber.json", "junit:target/cucumber-reports/Cucumber.xml"}
        , monochrome = true
        , tags = {}
)

public class runTest1 extends hooks {


}
