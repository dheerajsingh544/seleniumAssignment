package core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import automationpractice_Dheeraj.webdrive_file;

public class CoreTestIntegration {
	 protected WebDriver driver;
	    static final String URL = "http://automationpractice.com";

	    @BeforeClass
	    public void openBrowser() {
	        driver = new webdrive_file().getDriver();
	        driver.get(URL);
	    }

	    protected static void logStep(String step) {
	        Logger.step(step);
	    }

	    @AfterClass
	    public void close() {
	        driver.quit();
	    }

}
