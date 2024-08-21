package bdd.tek.testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

    features = "classpath:features/HomePage.feature",
    glue = "tek.bdd.steps", //Package for all the steps
    dryRun = false,  // if you put , after false and use tag it will run smoke, regression or what ever you put in your feature file
    // set it to true to scan feature for unimplemented steps
    tags= "@Scenario_2",
    // Running multiple tags=> tags= "@Smoke or @Regression"
    plugin = {"html:target/cucumber_report/index.html"}
)
    public class TestRunner {
    }

