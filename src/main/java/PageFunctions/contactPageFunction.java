package PageFunctions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ObjectRepositories.contactPage_OR;
import autmationpractive.actions.CoreActions;
import io.qameta.allure.Step;

public class contactPageFunction extends CoreActions {
	private String searchString;
	protected contactPageFunction(WebDriver driver) {
		super(driver);
		
	}
	@Step("open the contact page")
    public void openContact() {
        
        click(contactPage_OR.CONTACT_US);
        
    }

	@Step("fill the contact form")
    public void writeInMessage(final String searchString) {
        this.searchString = searchString;
        enterText(contactPage_OR.MESSAGE,searchString);
    }

    @Step("fill email")
    public void writeInEmail(final String searchString) {
        this.searchString = searchString;
        enterText(contactPage_OR.EMAIL,searchString);
    }
	
	public void clickOption(int index) {
        sleep(0.50);
        List<WebElement> searchList = driver.findElements(contactPage_OR.SELECTOR_1);
        click(searchList.get(index - 1));
    }
	@Step("Send the form to after sending contact form")
	public void send() {
        
        click(contactPage_OR.SEND);
        
    }

    @Step("check if the user has arrived on the correct search page")
    public boolean hasArrivedOnSearchPage() {
        return driver.getCurrentUrl().contains("searchtext=" + searchString);
    }

}
