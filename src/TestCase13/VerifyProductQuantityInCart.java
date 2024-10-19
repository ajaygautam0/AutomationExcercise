package TestCase13;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyProductQuantityInCart {

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
		  
		  //View Product
		  driver.findElement(By.xpath("//a[contains(text(), 'View Product')]")).click();
		  
		  //Verify user is navigated to ALL PRODUCTS page successfully
		  String VerifyProductPageTitle = driver.getTitle();
		  if(VerifyProductPageTitle.equalsIgnoreCase("Automation Exercise - Product Details")) {
			 System.out.println("***************** Verify user is navigated to ALL PRODUCTS page successfully **************");
		  }
		  
		  Thread.sleep(1000);
		  
		  //Increase Quantity
		  WebElement quant = driver.findElement(By.id("quantity"));
		  quant.clear();
		  quant.sendKeys("5");
		  
		  Thread.sleep(1000);
		  
		  //Add to cart
		  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
		  
		  //View Cart
		  Thread.sleep(1000);
		  
		  // ** EXPLICIT WAIT ** 
//		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		  WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-body")));
		  
		  
		// Switch to modal dialog
		driver.switchTo().activeElement();
		  
		  driver.findElement(By.xpath("//u[contains(text(), 'View Cart')]")).click();
	
		  //Product is displayed in cart page
		  String ProductisdisplayedincartPageTitle = driver.getTitle();
		  if(ProductisdisplayedincartPageTitle.equalsIgnoreCase("Automation Exercise - Checkout")) {
			 System.out.println("***************** Product is displayed in cart Page Verified **************");
		  }    	
	}

}
