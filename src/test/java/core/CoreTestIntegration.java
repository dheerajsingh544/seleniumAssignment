package core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utils.webdrive_file;

public class CoreTestIntegration {
	 	    //static final String URL = "http://automationpractice.com";
	 	static final String URL="https://www.saucedemo.com/";
	 	public static WebDriver driver=null;

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
