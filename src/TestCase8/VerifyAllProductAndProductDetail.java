package TestCase8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAllProductAndProductDetail {

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

	 // products list 
	 String  ProductslistPageTitle = driver.getTitle();
	 if( ProductslistPageTitle.equalsIgnoreCase("Automation Exercise - All Products")) {
		   System.out.println("***************** Products List is visible **************");
	  }
	 
	 Thread.sleep(1000);
	 
	 //Click on View Product 
//	driver.findElement(By.xpath("//a[contains(text(), 'View Product')]")).click();
	driver.findElement(By.cssSelector("body > section:nth-child(3) > div > div > div.col-sm-9.padding-right > div > div:nth-child(3) > div > div.choose > ul > li > a")).click();

	 String  DetailPageTitle = driver.getTitle();
	 if( DetailPageTitle.equalsIgnoreCase("Automation Exercise - Product Details")) {
		   System.out.println("***************** Detail is visible **************");
	  } 
	 
	}

}
