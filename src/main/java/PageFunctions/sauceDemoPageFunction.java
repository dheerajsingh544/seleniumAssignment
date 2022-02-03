package PageFunctions;

import org.openqa.selenium.WebDriver;

import ObjectRepositories.homePage_OR;
import ObjectRepositories.saucedemo_OR;
import io.qameta.allure.Step;
import autmationpractive.actions.CoreActions;

public class sauceDemoPageFunction extends CoreActions {
	private String searchString;
	
	 public sauceDemoPageFunction(WebDriver driver) {
		super(driver);
		
	}
	 @Step("fill the user Name")
	    public void UserName(final String searchString) {
	        
	    	enterText(saucedemo_OR.USERNAME,searchString);
	        
	        }
	 
	@Step("fill the password")
	    public void password(final String searchString) {
	        
	    	enterText(saucedemo_OR.PASSWORD,searchString);
	        
	}
	    @Step("login punch btn")
	    public void LoginPunch() {
	    	click(saucedemo_OR.LOGINPUNCH);
	    }
	    @Step("Add to cart ")
	    public void Add_To_Cart() {
	    	
	        waitForVisibility(saucedemo_OR.ADDTOCART);
	        click(saucedemo_OR.ADDTOCART);
	        
	    }
	    @Step("Goto cart ")
	    public void Cart() {
	        click(saucedemo_OR.CART);
	        
	    }
	    
	    @Step("checkout punch btn")
	    public void CheckOut() {
	    	click(saucedemo_OR.CHECKOUT);
	    }
	    @Step("fill the First name")
	    public void FirstName(final String searchString) {
	        
	    	enterText(saucedemo_OR.NAME,searchString);
	        
	        }
	    @Step("fill the last name")
	    public void LastName(final String searchString) {
	        
	    	enterText(saucedemo_OR.LASTNAME,searchString);
	        
	        }
	    @Step("fill the postal code")
	    public void PostalCode(final String searchString) {
	        
	    	enterText(saucedemo_OR.PINCODE,searchString);
	        
	        }
	    
	    
	    public void Proceed_To_CheckOut() {
	    	
	    waitForVisibility(homePage_OR.PROCEED_TO_CHECKOUT_BLOCK);
	    click(homePage_OR.PROCEED_TO_CHECKOUT);
	    
	}

}
