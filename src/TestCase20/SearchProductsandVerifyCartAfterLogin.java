package TestCase20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProductsandVerifyCartAfterLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Lunch Browser
		driver.get("https://automationexercise.com/");

		Thread.sleep(1000);
		// Home Page is visible
		String homePageTitle = driver.getTitle();
		if (homePageTitle.equalsIgnoreCase("Automation Exercise")) {
			System.out.println("***************** Home Page Verified **************");
		}

		Thread.sleep(1000);

		// Click on Product button
		driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a"))
				.click();

		// Verify Product detail is opened
		String VerifyProductdetailisopenedPageTitle = driver.getTitle();
		if (VerifyProductdetailisopenedPageTitle.equalsIgnoreCase("Automation Exercise - All Products")) {
			System.out.println("***************** Product Details is opened Page Verified **************");
		}

		Thread.sleep(1000);

		// Enter product name in search input and click search button
		driver.findElement(By.id("search_product")).sendKeys("jeans");

		Thread.sleep(1000);
		driver.findElement(By.id("submit_search")).click();

		// Verify 'SEARCHED PRODUCTS' is visible
		String searchedproductsPageTitle = driver.getTitle();
		if (searchedproductsPageTitle.equalsIgnoreCase("Automation Exercise - All Products")) {
			System.out.println("***************** Verify 'SEARCHED PRODUCTS' is visible **************");
		}

		// Verify all the products related to search are visible

		String allproductsPageTitle = driver.getTitle();
		if (allproductsPageTitle.equalsIgnoreCase("Automation Exercise - All Products")) {
			System.out.println("***************** All the products related to search are visible **************");
		}

		// Add those products to cart

		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a")).click();

		Thread.sleep(1000);
		// Switch to modal dialog
		driver.switchTo().activeElement();

		driver.findElement(By.xpath("//button[.= 'Continue Shopping']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]/a")).click();

		Thread.sleep(1000);
		// Switch to modal dialog
		driver.switchTo().activeElement();

		driver.findElement(By.xpath("//button[.= 'Continue Shopping']")).click();

		Thread.sleep(1000);
		// Click Cart Button
       //driver.findElement(By.xpath("//a[contains(text(), 'Cart')]")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();

		// Verify that products are visible in cart

		String cartproductsPageTitle = driver.getTitle();
		if (cartproductsPageTitle.equalsIgnoreCase("Automation Exercise - Checkout")) {
			System.out.println("***************** All the products are visible in cart **************");
		}

		Thread.sleep(1000);
		// Sign up/login button
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();

		Thread.sleep(1000);
		// correct email address and password
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("vj5@gmail.com");

		Thread.sleep(1000);

		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("Ajay@04912");
		
		Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
	    
	    Thread.sleep(1000);
		//Again, Click Cart Button
        //driver.findElement(By.xpath("//a[contains(text(), 'Cart')]")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
		
		// Verify that those products are visible in cart after login as well
		String thoseproductPageTitle = driver.getTitle();
		if (thoseproductPageTitle.equalsIgnoreCase("Automation Exercise - Checkout")) {
			System.out.println("***************** Those Products are visible in cart after login as well Verified **************");
		}

	}

}
