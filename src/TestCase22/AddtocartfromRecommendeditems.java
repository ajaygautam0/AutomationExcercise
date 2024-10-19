package TestCase22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtocartfromRecommendeditems {

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

		// Scroll down to footer
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement recommended = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)", recommended);

		// Verify 'RECOMMENDED ITEMS' are visible
		String recommendeditemsPageTitle = driver.getTitle();
		if (recommendeditemsPageTitle.equalsIgnoreCase("Automation Exercise")) {
			System.out.println("***************** 'RECOMMENDED ITEMS' are visible **************");
		}

		Thread.sleep(1000);
		// Click on 'Add To Cart' on Recommended product

		driver.findElement(By.xpath("//*[@id=\"recommended-item-carousel\"]/div/div[2]/div[3]/div/div/div/a")).click();

		Thread.sleep(1000);

		driver.switchTo().activeElement();

		driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a")).click();
		
		// Displayed in cart page
		String displayedCartPageTitle = driver.getTitle();
		if (displayedCartPageTitle.equalsIgnoreCase("Automation Exercise - Checkout")) {
			System.out.println("***************** The Product is displayed in cart page is verified **************");
		}

	}

}
