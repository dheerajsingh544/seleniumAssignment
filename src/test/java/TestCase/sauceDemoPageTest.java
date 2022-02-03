package TestCase;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import PageFunctions.homePageFunction;
import PageFunctions.sauceDemoPageFunction;
import Utils.readUserData;
import core.CoreTestIntegration;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class sauceDemoPageTest extends CoreTestIntegration{
	 sauceDemoPageFunction home;
	 
	 //Properties Udata= readUserData.readData();
	
	 @Test
	    @Description("creating impl objects before class")
	    public void initImpl() {
	        home  = new sauceDemoPageFunction(driver);   
	 }
	 
	 	@Test(dependsOnMethods="initImpl")
	    @Description("test the https://www.saucedemo.com/ website")
	    @Severity(SeverityLevel.CRITICAL)
	    @Story("STORY 2")
	    @Feature("FEATURE 1")
	    @Owner("Dheeraj Singh")
	    public void testcase4() throws IOException {
	    	
	    	logStep("Write the message");
		   home.UserName(readUserData.readData().getProperty("userName"));
		 //  home.UserName(userData.userName);
		    
		    logStep("Write the message");
		    home.password(readUserData.readData().getProperty("passWord"));
		    logStep("login");
		    home.LoginPunch();
		    
		    logStep("Add the item to cart");
		    home.Add_To_Cart();
		    logStep("click on cart");
		    home.Cart();
		    logStep("click on checkout");
		    home.CheckOut();
		    
		    logStep("Write the first name");
		    home.FirstName(readUserData.readData().getProperty("name"));
		    logStep("Write the lastname");
		    home.LastName(readUserData.readData().getProperty("lastName"));
		    logStep("Write the postal code");
		    home.PostalCode(readUserData.readData().getProperty("postalCode"));	    
	    }

}
