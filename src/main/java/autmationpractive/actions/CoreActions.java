package autmationpractive.actions;



import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoreActions {
	 protected WebDriver driver;
	 protected WebDriverWait waiter;

		

		protected CoreActions(WebDriver driver) {
	        this.driver = driver;
	        this.waiter = new WebDriverWait(driver, 10);
	    }

	    protected boolean waitForVisibility(By element) {
	        boolean isVisible = true;
	        try {
	            waiter.until(ExpectedConditions.visibilityOfElementLocated(element));
	        } catch (TimeoutException te) {
	            isVisible = false;
	        }
	        return isVisible;
	    }

	    protected void click(By element) {
	        driver.findElement(element).click();
	    }

	    protected void click(WebElement element) {
	        element.click();
	    }
	    protected void validate (WebElement element) {
	        element.getText();
	    }

	    protected void enterText(By element, String text) {
	        driver.findElement(element).sendKeys(text);
	    }

	    public void sleep(double sec) {
	        try {
	            Thread.sleep((long) (sec * 1000));
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

}
