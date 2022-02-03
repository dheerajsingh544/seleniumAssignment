package ObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class saucedemo_OR {
	
	public static final By userid2= By.xpath("//*[@id=\"login_credentials\"]/text()[2]");
	public static final By userid3= By.xpath("//*[@id=\"login_credentials\"]/text()[3]");
	
	public static final By error= By.xpath("//*[@class=\"error-button\"]");
	
	
	public static final By USERNAME= By.xpath("//*[@id=\"user-name\"]");
	public static final By PASSWORD= By.xpath("//input[@id=\"password\"]");
	public static final By LOGINPUNCH= By.xpath("//input[@id=\"login-button\"]");
	public static final By ADDTOCART= By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]");
	public static final By CART= By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	public static final By CHECKOUT= By.xpath("//button[@id=\"checkout\"]");
	public static final By NAME= By.xpath("//input[@id=\"first-name\"]");
	public static final By LASTNAME= By.xpath("//input[@id=\"last-name\"]");
	public static final By PINCODE= By.xpath("//input[@id=\"postal-code\"]");
	
	
	
	
	
}
//*[@id="login_button_container"]/div/form/div[3]/h3