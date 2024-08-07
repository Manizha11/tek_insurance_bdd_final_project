package bdd.tek.utility;

import bdd.tek.base.BaseSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtility extends BaseSetUp {
    //method to get Web diver wait(applying explicit wait)
    private WebDriverWait getWait(){
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));

    }
    //method to return WebElement and wait for visibility of it
    private WebElement waitForVisibility(By locator){
       return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator);

    }
    //Method to click on element
    public void clickOnElement(By locator){
    getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();

    }
    // Method to send text to an element
    public void sendTextToElement(By locator,String value){
        waitForVisibility(locator).sendKeys(value);
    }
    //Method to get text from an element
    public String getElementText(By locator){
        return waitForVisibility(locator).getText();

    }
    // Method if element is enabled
    public boolean isElementEnabled(By locator){
        return waitForVisibility(locator).isEnabled();
    }
    // Method to check if element is displayed
    public boolean isElementDisplayed(By locator){
        return waitForVisibility(locator).isDisplayed();
    }
    //Method to take screenshot
    public byte[] takeScreenshot(){
        TakesScreenshot screenshot = (TakesScreenshot) getDriver();
        return screenshot.getScreenshotAs(OutputType.BYTES);

    }
}
