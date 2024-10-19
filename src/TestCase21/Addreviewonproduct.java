package TestCase21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addreviewonproduct {

	public static void main(String[] args) throws InterruptedException {
		// Launch Browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://automationexercise.com/");

		// Navigate url
		// Home Page Visible

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
			System.out.println("***************** ALL PRODUCTS page successfully **************");
		}

		Thread.sleep(1000);

		// View Product
		driver.findElement(By.xpath("//a[contains(text(), 'View Product')]")).click();

		// Verify 'Write Your Review' is visible
		String reviewPageTitle = driver.getTitle();
		if (reviewPageTitle.equalsIgnoreCase("Automation Exercise - Product Details")) {
			System.out.println("*****************'Write Your Review' is visible **************");
		}

		Thread.sleep(1000);

		// Enter name, email and review
		driver.findElement(By.id("name")).sendKeys("Ajay Gautam");

		Thread.sleep(1000);

		driver.findElement(By.id("email")).sendKeys("vj05@gmail.com");

		Thread.sleep(1000);

		driver.findElement(By.id("review")).sendKeys("My review is this product is very cheap.");

		Thread.sleep(1000);

		// Click submit button
		driver.findElement(By.id("button-review")).click();

		Thread.sleep(1000);

		// Verify success message
		String successmessagePageTitle = driver.getTitle();
		if (successmessagePageTitle.equalsIgnoreCase("Automation Exercise - Product Details")) {
			System.out.println("***************** 'Thank you for your review' is visible **************");
		}
	}

}
