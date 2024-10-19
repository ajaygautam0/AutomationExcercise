package TestCase17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveProductsFromCart {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
	    WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://automationexercise.com/");
			
			//Navigate URL
			//Home Page Visible
			
		String homePageTitle = driver.getTitle();
		if(homePageTitle.equalsIgnoreCase("Automation Exercise")) {
				System.out.println("***************** Home Page Verified **************");
		}
		
		Thread.sleep(1000);	

		// Click Add to Cart
//			  WebElement ho = driver.findElement(By.xpath("//a[contains(text(), 'Add to cart') and @data-product-id='1']"));
		driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a")).click();
		
		Thread.sleep(1000);

		driver.switchTo().activeElement();

		driver.findElement(By.xpath("//button[.='Continue Shopping']")).click();
		
		Thread.sleep(1000);
		// Click Cart Button
//			  driver.findElement(By.xpath("//a[contains(text(), 'Cart')]")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();

		Thread.sleep(1000);
		// Verify that cart page is displayed
		String cartdisplayedPageTitle = driver.getTitle();
		if (cartdisplayedPageTitle.equalsIgnoreCase("Automation Exercise - Checkout")) {
			System.out.println("***************** Cart Page is Displayed is Verified **************");
		}
		
		Thread.sleep(1000);
		
		// Click 'X' button corresponding to particular product
		
		driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[6]/a")).click();
		
		Thread.sleep(1000);
		
		//Verify is Product is removed
		String productremoved = driver.findElement(By.xpath("//b[.='Cart is empty!']")).getText();
		if(productremoved.equalsIgnoreCase("Cart is empty!")) {
			System.out.println("**************Product is Removed Successfully******************");
		}

	}

}
