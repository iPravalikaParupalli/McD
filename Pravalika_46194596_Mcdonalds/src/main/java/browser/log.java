package browser;

import org.openqa.selenium.By;

public class log extends browser{
	static By log=By.xpath("//*[@id=\"headerComp\"]/div/div[2]/div[2]/div[2]");
	static By logpwd=By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[1]/div/div[2]/div");
	static By mobile=By.xpath("//input[@class=\"form-login-control input-border ng-untouched ng-pristine ng-invalid\"]");
	static By password=By.xpath("//*[@id='password']");
	static By continuepage=By.xpath("//div[@class=\"loginBtnDiv\"]/button");



	public static void Log() throws Exception 
	{
	driver.findElement(log).click();
	Thread.sleep(2000);
	}
	public static void userlogin()throws Exception 
	{
	driver.findElement(logpwd).click();
	Thread.sleep(2000);
	}
	public static void mobilenumber() throws Exception 
	{
	driver.findElement(mobile).sendKeys("9346321748");
	Thread.sleep(2000);
	}
	public static void password() throws Exception {
	driver.findElement(password).sendKeys("Pravalika@18");
	Thread.sleep(2000);
	}
	public static void clickcontinue() throws Exception {
	driver.findElement(continuepage).click();
	Thread.sleep(2000);
	}
}
