package TestCase9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProduct {

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
		 
	  //Click on Product button
	 driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a")).click();
		 
	 //Navigated to ALL PRODUCTS
	 String  ALLPRODUCTSPageTitle = driver.getTitle();
	  if( ALLPRODUCTSPageTitle.equalsIgnoreCase("Automation Exercise - All Products")) {
		  System.out.println("*****************  ALL PRODUCTS Page Successfully **************");
	  }	
	  Thread.sleep(1000);
	  
	  //Enter product name in search input and click button
	  driver.findElement(By.id("search_product")).sendKeys("T-shirt");
	  
	  driver.findElement(By.id("submit_search"));
	}

}
