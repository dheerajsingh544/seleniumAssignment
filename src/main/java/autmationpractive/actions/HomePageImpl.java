package autmationpractive.actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import automationpractice.pages.home.ContactPage;
import automationpractice.pages.home.HomePage;

import io.qameta.allure.Step;


public class HomePageImpl extends CoreActions{
	private String searchString;

	
    public HomePageImpl(WebDriver driver) {
    	super(driver);
    	}


    @Step("open the contact page")
    public void openContact() {
        
        click(ContactPage.CONTACT_US);
        
    }

    @Step("fill the contact form")
    public void writeInMessage(final String searchString) {
        this.searchString = searchString;
        enterText(ContactPage.MESSAGE,searchString);
    }

    @Step("fill email")
    public void writeInEmail(final String searchString) {
        this.searchString = searchString;
        enterText(ContactPage.EMAIL,searchString);
    }
	
	public void clickOption(int index) {
        sleep(0.50);
        List<WebElement> searchList = driver.findElements(ContactPage.SELECTOR_1);
        click(searchList.get(index - 1));
    }
	@Step("Send the form to after sending contact form")
	public void send() {
        
        click(ContactPage.SEND);
        
    }

    @Step("check if the user has arrived on the correct search page")
    public boolean hasArrivedOnSearchPage() {
        return driver.getCurrentUrl().contains("searchtext=" + searchString);
    }
    
    @Step("Send the form to after sending contact form")
	public void Dress() {
        
        click(HomePage.DRESS);
        
    }
    @Step("Send the form to after sending contact form")
	public void Casuals() {
        
        click(HomePage.CASUALS);
        
    }
    public void Casual_Dress() {
        
        click(HomePage.CASUALS_DRESS);
        
    }
    public void Add_to_Cart() {
    
    click(HomePage.ADD_TO_CART);
    
}
    public void Proceed_To_CheckOut() {
    	
    waitForVisibility(HomePage.PROCEED_TO_CHECKOUT_BLOCK);
    click(HomePage.PROCEED_TO_CHECKOUT);
    
}
   

}
