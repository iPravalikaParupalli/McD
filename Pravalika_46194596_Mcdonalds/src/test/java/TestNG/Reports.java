package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Demo.DemoLog;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Reports {
	
	public static WebDriver driver;
	static By clickLog=By.xpath("//*[@id=\"headerComp\"]/div/div[2]/div[2]/div[2]");
	static By log=By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[1]/div/div[2]/div");
	static By mobile=By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[1]/input");
	static By password=By.xpath("//*[@id='password']");
	static By continuepage=By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[4]/div[3]/button");

	
	static By add=By.xpath("//*[@id=\"home-page-wrapper\"]/div[4]/app-menu-popup/div/div/div/div[2]/app-menu-items/div/app-menu-item[4]/div/div[2]/div/app-price-section/div/div/button/span");
	static By addtocart=By.xpath("/html/body/ngb-modal-window/div/div/div[3]/button[2]");
	static By viewcart=By.xpath("//*[@id=\"home-page-wrapper\"]/div[5]/app-cart-card/div/div[2]/button");
	static By cart=By.xpath("//*[@id=\"aahaar-wrapper\"]/app-cart-page/div[1]/div[2]/div[1]/div[1]/div[2]/div");

	static By more=By.xpath("//*[@id=\"aahaar-wrapper\"]/app-cart-page/div[1]/div[2]/div[1]/div[2]/div[6]/span");
	static By promo=By.xpath("//*[@id=\"aahaar-wrapper\"]/app-cart-page/div[1]/div[2]/div[2]/div[3]/div/div/span");
	
	static By apply=By.xpath("//*[@id=\"applyText2013\"]");
	static By okButton=By.xpath("//div[@class='submit']/button");
	static By instructions=By.xpath("//*[@id=\"aahaar-wrapper\"]/app-cart-page/div[1]/div[2]/div[2]/div[4]/div[2]/textarea");
	static By pay=By.xpath("//*[@id=\"aahaar-wrapper\"]/app-cart-page/div[2]/div");
	
	public static ExtentHtmlReporter obj1=new ExtentHtmlReporter("./Reports/extentreport1.html");
	public static ExtentReports obj2=new ExtentReports();
	
	@BeforeClass
	public static void setDriver()
	{
		DemoLog.log(2);
		obj2.attachReporter(obj1);
		ExtentTest obj3=obj2.createTest("Opening the Test");
		obj3.log(Status.INFO,"Opening the browser");
		try
		{
			DemoLog.log(1);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			obj3.log(Status.PASS,"The browser open");
		}
		catch(Exception e)
		{
			DemoLog.log(3);
			System.out.println("Before Report block");
			obj3.log(Status.FAIL,"The browser does not opened");
		}
		obj2.flush();
	}
	@Test
	public static void Mcd()
	{
		DemoLog.log(2);
		obj2.attachReporter(obj1);
		ExtentTest obj4=obj2.createTest("Opening the Application and Adding to cart");
		obj4.log(Status.INFO,"Opening the Mc Delivery site");
		try
		{
			DemoLog.log(1);
		 driver.get("https://www.mcdelivery.co.in/");
		 driver.manage().window().maximize();
		 obj4.log(Status.PASS,"The application opened in the browser");
		 try {
			 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
		 }
		 catch(AssertionError e) {
			 DemoLog.log(4);
		 }
		 ScreenShots.screenShot(1);
		 Thread.sleep(3000);
		 obj4.log(Status.PASS,"The application navigated to the next page");
		 String filepath=System.getProperty("user.dir")+"//ScreenShots//Screenshot1.png";
		 obj4.addScreenCaptureFromPath(filepath);
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("Browser");
			obj4.log(Status.FAIL,"The applcation failed");
		}
		
		try {
			DemoLog.log(1);
			driver.findElement(clickLog).click();
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The login button is clicked");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next page");
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("Login Button");
			obj4.log(Status.FAIL,"The login button not clicked");
		}
		
		try {
			DemoLog.log(1);
			driver.findElement(log).click();
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The login page is clicked");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next step");
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("Login page");
			obj4.log(Status.FAIL,"The login page not clicked");
		}
		
		try {
			DemoLog.log(1);
			driver.findElement(mobile).sendKeys("9346321748");
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The Mobile number entered");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next step");
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("Mobile Number");
			obj4.log(Status.FAIL,"The mobile number is not entered");
		}
		
		try {
			DemoLog.log(1);
			driver.findElement(password).sendKeys("Pravalika@18");
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The password entered");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next step");
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("Password");
			obj4.log(Status.FAIL,"The password is not entered");
		}
		
		try {
			DemoLog.log(1);
			driver.findElement(continuepage).click();
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The continue button is clicked");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next step");
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("Continue page");
			obj4.log(Status.FAIL,"The continue button is not clicked");
		}
		
		try {
			DemoLog.log(1);
			driver.findElement(add).click();
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The add button is clicked");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next step");
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("Add BUtton");
			obj4.log(Status.FAIL,"The add button is not clicked");
		}
		
		try {
			DemoLog.log(1);
			driver.findElement(addtocart).click();
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The add to cart button is clicked");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next step");
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("Add to cart");
			obj4.log(Status.FAIL,"The add to cart button is not clicked");
		}
		
		try {
			DemoLog.log(1);
			driver.findElement(viewcart).click();
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The view cart button is clicked");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next step");
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("View Cart");
			obj4.log(Status.FAIL,"The view cart button is not clicked");
		}
		
		try {
			DemoLog.log(1);
		    System.out.println(driver.findElement(cart).getText());
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The view cart button is clicked");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next step");
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("Cart");
			obj4.log(Status.FAIL,"The view cart button is not clicked");
		}
		
		try {
			DemoLog.log(1);
			driver.findElement(more).click();
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The more recommendations button is clicked");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 ScreenShots.screenShot(2);
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next step");
			 String filepath=System.getProperty("user.dir")+"//ScreenShots//Screenshot2.png";
			 obj4.addScreenCaptureFromPath(filepath);
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("More recommendations");
			obj4.log(Status.FAIL,"The more recommendations button is not clicked");
		}
		
		try {
			DemoLog.log(1);
			driver.findElement(promo).click();
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The promo button is clicked");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 ScreenShots.screenShot(3);
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next step");
			 String filepath=System.getProperty("user.dir")+"//ScreenShots//Screenshot3.png";
			 obj4.addScreenCaptureFromPath(filepath);
			 
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("Promo button");
			obj4.log(Status.FAIL,"The promo button is not clicked");
		}
		
		try {
			DemoLog.log(1);
			driver.findElement(apply).click();
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The apply promo button is clicked");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 ScreenShots.screenShot(4);
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next step");
			 String filepath=System.getProperty("user.dir")+"//ScreenShots//Screenshot4.png";
			 obj4.addScreenCaptureFromPath(filepath);
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("Apply promo");
			obj4.log(Status.FAIL,"The apply promo button is not clicked");
		}
		
		try {
			DemoLog.log(1);
			driver.findElement(okButton).click();
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The ok button is clicked");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next step");
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("Ok Button");
			obj4.log(Status.FAIL,"The ok button is not clicked");
		}
		
		try {
			DemoLog.log(1);
			driver.findElement(instructions).click();
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The instructions is filled");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next step");
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("Instructions");
			obj4.log(Status.FAIL,"The instructions are not filled");
		}
		
		try {
			DemoLog.log(1);
			driver.findElement(pay).click();
	        Thread.sleep(2000);
	        obj4.log(Status.PASS,"The pay button is clicked");
			 try {
				 Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
			 }
			 catch(AssertionError e) {
				 DemoLog.log(4);
			 }
			 Thread.sleep(3000);
			 obj4.log(Status.PASS,"The application navigated to the next step");
		}
		catch(Exception e)
		{
			DemoLog.log(5);
			System.out.println("Pay Button");
			obj4.log(Status.FAIL,"The pay button is not clicked");
		}
		obj2.flush();
	}
		@AfterClass
		public static void closeWindow()
		{
			DemoLog.log(1);
			obj2.attachReporter(obj1);
			ExtentTest obj5=obj2.createTest("Closing the browser");
			obj5.log(Status.INFO,"Closing the Application");
			try
			{
				DemoLog.log(1);
			driver.close();
			obj5.log(Status.PASS,"The application closed");
			}
			catch(Exception e)
			{
				DemoLog.log(3);
				System.out.println("After Reports block");
				obj5.log(Status.FAIL,"The applcation doesn't closed ");
			}
			obj2.flush();
		}
		
		 
	}
	
