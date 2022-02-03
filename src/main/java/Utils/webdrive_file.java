package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrive_file {
	private final WebDriver driver;
	public webdrive_file() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\3pg.itgroup\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}
	public WebDriver getDriver() {
		
		return driver;
	}

}
