package bdd.tek.pages;

import org.openqa.selenium.By;

public class HomePageObject {
    public static final By LOGIN_BUTTON = By.linkText("Login");
    public static final By TEK_INSURANCE_UI_TEXT = By.xpath("//h2[normalize-space()='TEK Insurance App']");
    public static final By CREATE_PRIMARY_ACCOUNT_BUTTON = By.linkText("Create Primary Account");
    public static final By COLOR_MODE_BUTTON = By.xpath("//button[@aria-label='color-mode']//*[name()='svg']");

}
