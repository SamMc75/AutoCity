
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import cucumber.api.testng.TestNGCucumberRunner;

import java.util.List;


@RunWith(Cucumber.class)
//@CucumberOptions(tags = {"@1"},format = {"pretty", "json:target/cucumber.json","html:target/cucumber.html"}, features = {"src/main/java/com/features/"})
@CucumberOptions(
        features = {"src/test/resources/features"},
        tags = {"@1"},
        glue = {"steps"},
        format = {
                "pretty",
                "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumber-pretty",
                "rerun:target/cucumber-reports/rerun.txt"})

public class CityTest {


}
