package automationpractice.pages.home;

import org.openqa.selenium.By;

public class ContactPage {
	public static final By CONTACT_US = By.xpath("//*[@id=\"contact-link\"]/a");
    public static final By EMAIL = By.id("email");
    public static final By MESSAGE= By.id("message");
    public static final By SELECTOR_1= By.xpath("//*[@id=\"id_contact\"]/option[2]");
    public static final By SEND= By.id("submitMessage");
    public static final By VALIDATECORRECT = By.xpath("//*[@id=\"center_column\"]/p");
    

}
