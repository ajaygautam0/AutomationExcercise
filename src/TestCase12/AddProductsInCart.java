package TestCase12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 */
/**
 * 
 */
public class AddProductsInCart {

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
			 
          //Hover over First Product
			Thread.sleep(1000);	  
//		  WebElement ho = driver.findElement(By.xpath("//a[contains(text(), 'Add to cart') and @data-product-id='1']"));
		  WebElement product1 = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a"));
		  product1.click();
		  
		  Thread.sleep(1000);
		 
          driver.switchTo().activeElement();
		  
    
		  driver.findElement(By.xpath("//button[.='Continue Shopping']")).click();

		  //Hover over Second Product
			Thread.sleep(1000);
			  
			WebElement product2 = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[1]/a"));
			product2.click();

			Thread.sleep(1000);

			driver.switchTo().activeElement();

//			  driver.findElement(By.xpath("//button[.='View Cart']")).click();
			driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")).click();

			// Verify both products are added to Cart
//			
		List<WebElement> bothProductsAddedInCart	= driver.findElements(By.xpath("//*[@id=\"cart_info_table\"]/tbody"));
		System.out.println("Total bothProductsAddedInCart are : " +bothProductsAddedInCart.size());
		if(bothProductsAddedInCart.size() > 0)  {
				System.out.println("***************** Both Products Added In Cart is Verified **************");
		}

	}

}
