package automationpractice.pages.home;

import org.openqa.selenium.By;

public class HomePage {
	
	
    public static final By DRESS= By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
    public static final By CASUALS= By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[1]/a");
    public static final By CASUALS_DRESS= By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");
    public static final By ADD_TO_CART= By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    public static final By PROCEED_TO_CHECKOUT_BLOCK= By.xpath("//*[@id=\"layer_cart\"]");
    public static final By PROCEED_TO_CHECKOUT= By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");

}
