package TestCase25;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyScrollUpUsingArrowButtonAndScrollDownFunctionality {

	public static void main(String[] args) throws InterruptedException {
		// Launch Browser
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://automationexercise.com/");

		// Navigate URL
		// Home Page Visible

		String homePageTitle = driver.getTitle();
		if (homePageTitle.equalsIgnoreCase("Automation Exercise")) {
			System.out.println("***************** Home Page Verified **************");
		}
		
          Thread.sleep(1000);
		  
		  //Scroll down to footer
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  WebElement Subscription = driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div"));
		  js.executeScript("arguments[0].scrollIntoView(true)", Subscription);
		  
		  Thread.sleep(1000);
		  
		  //Verify SUBSCRIPITION
		  String subText = driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2")).getText();
		  if(subText.equalsIgnoreCase("Subscription")) {
			 System.out.println("***************** SUBSCRIPITION Verified **************");
		  }
		  
		  driver.findElement(By.xpath("//*[@id=\"scrollUp\"]")).click();
		  
		//Verify Upper text
		  String upText = driver.findElement(By.xpath("//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/h2")).getText();
		  if(upText.equalsIgnoreCase("Full-Fledged practice website for Automation Engineers")) {
			 System.out.println("***************** 'Full-Fledged practice website for Automation Engineers' text is visible **************");
		  }
	}

}
