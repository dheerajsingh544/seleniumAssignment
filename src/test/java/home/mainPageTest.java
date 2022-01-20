package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import autmationpractive.actions.HomePageImpl;
import core.CoreTestIntegration;
import core.Listener;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Test
@Epic("EPIC 1")
@Listeners(Listener.class)
public class mainPageTest extends CoreTestIntegration {
	HomePageImpl home;
	    @Test
	    @Description("creating impl objects before class")
	    public void initImpl() {
	        home  = new HomePageImpl(driver);
	        
	        
	    }
	    @Test(dependsOnMethods = "initImpl")
	    
	    @Description("test that the user can launch automation practice website and book the dress")
	    @Severity(SeverityLevel.CRITICAL)
	    @Story("STORY 1")
	    @Feature("FEATURE 1")
	    @Owner("Dheeraj Singh")
	    public void testcase1() {
	    	logStep("open the contact form");
	       home.openContact();
	       logStep("Write the message");
	       home.writeInMessage("hello hi ");

	        logStep("search for dress");
	        home.writeInEmail("dheeraj@gmail.com");
	        
	        home.clickOption(1);
	        
	        logStep("Send the form ");
	        home.send();
	        String expected="Your message has been successfully sent to our team.";
	        
	        WebElement strvalue = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
	        
	        String actual = strvalue.getText();
	        System.out.println(actual);

	    if(expected.equals(actual)){
	        System.out.println("Pass");
	    }
	        else {
	            System.out.println("Fail");
	        }
	       
	    }
	    
	    @Test(dependsOnMethods = "initImpl")
	    
	    @Description("test that the user can launch automation practice website and book the dress")
	    @Severity(SeverityLevel.CRITICAL)
	    @Story("STORY 1")
	    @Feature("FEATURE 1")
	    @Owner("Dheeraj Singh")
	    public void testcase2() {
	    	
	    	logStep("open the contact form");
	       home.openContact();
	       logStep("Write the message");
	       home.writeInMessage("hello hi ");

	        logStep("search for dress");
	        home.writeInEmail("dheeraj.com");
	        
	        home.clickOption(1);
	        
	        logStep("Send the form ");
	        home.send();
	        
	        String expected2="Invalid email address.";
	        
	        WebElement strvalue2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li"));
	        
	        String actual2 = strvalue2.getText();
	        System.out.println(actual2);
	        logStep("Validate the message ");
	    if(expected2.equals(actual2)){
	        System.out.println("Pass");
	    }
	        else {
	            System.out.println("Fail");
	        }
	    }
	    @Test(dependsOnMethods = "initImpl")
	    
	    @Description("test that the user can launch automation practice website and book the dress")
	    @Severity(SeverityLevel.CRITICAL)
	    @Story("STORY 1")
	    @Feature("FEATURE 1")
	    @Owner("Dheeraj Singh")
	    public void testcase3() {
	    	
	       logStep("open the contact form");
	       home.Dress();
	       logStep("open the contact form");
	       home.Casuals();
	       WebElement strdressName = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a"));
	       
	       logStep("Casual dress");
	       home.Casual_Dress();
	       
	       logStep("Add to cart ");
	       home.Add_to_Cart();
	       
	       logStep("Proceed to checkout");
	       home.Proceed_To_CheckOut();
	       
	        
	        WebElement strDressValue = driver.findElement(By.xpath("//*[@id=\"product_3_13_0_0\"]/td[2]/p/a"));
	        
	        String DressName1 = strdressName.getText();
	        String DressValue2 = strDressValue.getText();
	        //System.out.println(DressName);

//	    if(DressName1.equals(DressValue2)){
//	    	
//	        System.out.println("Pass :Dress Name");
//	        
//	    }
//	        else {
//	            System.out.println("Fail");
//	        }
//	    
       WebElement strPrice = driver.findElement(By.xpath("//*[@id=\"product_price_3_13_0\"]/span"));
       WebElement strdress = driver.findElement(By.xpath("//*[@id=\"total_product\"]"));
		        
	           	String actual = strPrice.getText();
		        String stringdress = strdress.getText();
		        System.out.println(actual);

		    if(stringdress.equals(actual)){
		        System.out.println("Pass : price is correct");
		        		    }
		        else {
		            System.out.println("Fail");
	        }
    }
		
	  
}
