package bdd.tek.testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

    features = "classpath:features",
    glue = "bdd.tek.steps", //Package for all the steps
    dryRun = false,  // if you put , after false and use tag it will run smoke, regression or what ever you put in your feature file
    // set it to true to scan feature for unimplemented steps
    tags= "@Smoke",
    // Running multiple tags=> tags= "@Smoke or @Regression"
        monochrome = true,
    snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"html:target/cucumber_report/index.html"}
)
    public class TestRunner {
    }

