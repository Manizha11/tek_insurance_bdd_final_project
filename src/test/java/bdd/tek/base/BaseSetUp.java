package bdd.tek.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
//Method for the setup browser
public abstract class BaseSetUp {
    private static WebDriver driver;

    public void openBrowser(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

    }
    // Method to close the browser
    public void quitBrowser(){
        if (driver!=null) driver.quit();

    }
    //Method to read the driver variable

    public static WebDriver getDriver() {
        return driver;
    }
}
