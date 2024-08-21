package bdd.tek.steps;

import bdd.tek.utility.SeleniumUtility;
import org.junit.After;
import org.junit.Before;

public class Hooks extends SeleniumUtility {

    @Before
    public void beforeEachScenario(){
        openBrowser();
    }

    @After
    public void afterEachScenario(){
        quitBrowser();
    }
}

