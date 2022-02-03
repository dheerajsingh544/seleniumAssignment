package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageFunctions.homePageFunction;
import PageFunctions.contactPageFunction;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class contactPageTest {
	contactPageFunction home;
	
	
	@Test
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
        home.send();}
	@Test
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
        
//        String expected2="Invalid email address.";
//        
//        WebElement strvalue2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/ol/li"));
//        
//        String actual2 = strvalue2.getText();
//        System.out.println(actual2);
//        logStep("Validate the message ");
//    if(expected2.equals(actual2)){
//        System.out.println("Pass");
//    }
//        else {
//            System.out.println("Fail");
//        }
    }

	private void logStep(String string) {
		// TODO Auto-generated method stub
		
	}

}
