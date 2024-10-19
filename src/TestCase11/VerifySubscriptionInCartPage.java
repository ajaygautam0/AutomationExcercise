package TestCase11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySubscriptionInCartPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		 driver.manage().window().maximize();
			        
		  //Lunch Browser
		 driver.get("https://automationexercise.com/");

		 Thread.sleep(1000);
		 //Home Page is visible
		 String homePageTitle = driver.getTitle();
		  if(homePageTitle.equalsIgnoreCase("Automation Exercise")) {
			 System.out.println("***************** Home Page Verified **************");
		  }
		  
		  Thread.sleep(1000);
		  
		  //Click Cart Button
		  driver.findElement(By.xpath("//a[contains(text(), 'Cart')]")).click();

          Thread.sleep(1000);
		  
		  //Scroll down to footer
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  WebElement Subscription = driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div"));
		  js.executeScript("arguments[0].scrollIntoView(true)", Subscription);
		  
		  Thread.sleep(1000);
		  
		  //Verify SUBSCRIPITION
		  String SUBSCRIPITIONTitle = driver.getTitle();
		  if(SUBSCRIPITIONTitle.equalsIgnoreCase("Automation Exercise - Checkout")) {
			 System.out.println("***************** SUBSCRIPITION Verified **************");
		  }
		  
		  Thread.sleep(1000);
		  
		//Enter Email
		  WebElement id = driver.findElement(By.id("susbscribe_email"));
		  id.sendKeys("aj0422@gmail.com");
		  
		  Thread.sleep(1000);
		  driver.findElement(By.id("subscribe")).click();
		  
		  //You have been successfully subscribed! 
		  String YouhavebeensuccessfullysubscribedTitle = driver.getTitle();
		  if(YouhavebeensuccessfullysubscribedTitle.equalsIgnoreCase("Automation Exercise - Checkout")) {
			 System.out.println("***************** You have been successfully subscribed! Verified **************");
		  }
	}

}
