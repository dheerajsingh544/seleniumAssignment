package PageFunctions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ObjectRepositories.contactPage_OR;
import ObjectRepositories.homePage_OR;
import ObjectRepositories.saucedemo_OR;

import autmationpractive.actions.CoreActions;
import io.qameta.allure.Step;


public class homePageFunction extends CoreActions{
	private String searchString;

	
    public homePageFunction(WebDriver driver) {
    	super(driver);
    	}


    

    
    
    @Step("Send the form to after sending contact form")
	public void Dress() {
        
        click(homePage_OR.DRESS);
        
    }
    @Step("Send the form to after sending contact form")
	public void Casuals() {
        
        click(homePage_OR.CASUALS);
        
    }
    public void Casual_Dress() {
        
        click(homePage_OR.CASUALS_DRESS);
        
    }
    public void Add_to_Cart_Automation() {
    
    click(homePage_OR.ADD_TO_CART);
    
    }
    ////*********************************TestCase3[saucedemo]******************************************////
   
    

}
