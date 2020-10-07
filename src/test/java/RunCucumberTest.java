import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(tags = "@atm",
            plugin = {"pretty", "html:target/cucumber-reports"})
    public class RunCucumberTest{

}
