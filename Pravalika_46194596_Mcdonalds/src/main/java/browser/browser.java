package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {
	public static WebDriver driver;
	//static By pstore=By.xpath("//*[@id=\"headerComp\"]/div/div[2]/div[1]/img[2]");
	//static By appstore=By.xpath("//*[@id=\"headerComp\"]/div/div[2]/div[1]/img[1]");

	
	public static void setDriver() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void getUrl(String string) throws InterruptedException 
	{
		driver.get(string);
		Thread.sleep(3000);
	}
	
	public static void closeBrowser() {
	try {
		driver.quit();
	}
	catch(Exception e) {
			System.out.println("Browser not closing");
	}
	
}
	
	
}
