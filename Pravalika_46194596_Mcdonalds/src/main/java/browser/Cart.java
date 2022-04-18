package browser;

import org.openqa.selenium.By;

public class Cart extends browser{

	static By add=By.xpath("/html/body/app-root/div/div/app-home-page/div/div[4]/app-menu-popup/div/div/div/div[2]/app-menu-items/div/app-menu-item[4]/div/div[2]/div/app-price-section/div/div/button/span");
	static By addtocart=By.xpath("/html/body/ngb-modal-window/div/div/div[3]/button[2]");
	
	static By viewcart=By.xpath("//*[@id=\"home-page-wrapper\"]/div[5]/app-cart-card/div/div[2]/button");
	//static By cart=By.xpath("//*[@id=\"home-page-wrapper\"]/div[5]/app-cart-card/div/div[2]/button");
	static By more=By.xpath("//div[@class=\"more-rec-link space-left\"]/span");
	static By promo=By.xpath("//div[@class=\"Apply\"]");
	static By applypromo=By.xpath("//*[@id=\"applyText2013\"]");
	static By okButton=By.xpath("//div[@class='submit']/button");
	static By instructions=By.xpath("//*[@id=\"aahaar-wrapper\"]/app-cart-page/div[1]/div[2]/div[2]/div[4]/div[2]/textarea");
	static By pay=By.xpath("//*[@id=\"aahaar-wrapper\"]/app-cart-page/div[2]/div");
	
	public static void addMcd() throws Exception {
		driver.findElement(add).click();
        Thread.sleep(2000);
	}
	public static void addtocartMcd() throws Exception {
		driver.findElement(addtocart).click();
        Thread.sleep(2000);
	}
	public static void viewcartMcd() throws Exception {
		driver.findElement(viewcart).click();
        Thread.sleep(2000);
	}
	public static void cartitemsMcd() throws Exception{
      //System.out.println(driver.findElement(cart).getText());
	}
	public static void moreMcd() throws Exception {
		 driver.findElement(more).click();
	        Thread.sleep(2000);
	}
	public static void promoMcd() throws Exception {
		driver.findElement(promo).click();
        Thread.sleep(2000);
	}
	public static void applypromoMcd() throws Exception {
		driver.findElement(applypromo).click();
        Thread.sleep(2000);
	}
	public static void okButtonMcd() throws Exception {
		driver.findElement(okButton).click();
        Thread.sleep(2000);
	}
	public static void instructionsMcd() throws Exception {
		driver.findElement(instructions).sendKeys("Provide extra chili flakes sachets");
        Thread.sleep(2000);
	}
	public static void payMcd() throws Exception {
        driver.findElement(pay).click();
	}
}
