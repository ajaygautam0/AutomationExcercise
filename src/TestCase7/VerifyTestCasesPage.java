package TestCase7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTestCasesPage {

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
		
		//click Test Cases
		driver.findElement(By.xpath("//*[@id=\"slider-carousel\"]/div/div[1]/div[1]/a[1]/button")).click();

		//
		String navigatedtotestcasesPageTitle = driver.getTitle();
		if(navigatedtotestcasesPageTitle.equalsIgnoreCase("Automation Practice Website for UI Testing - Test Cases")) {
		   System.out.println("***************** Navigated to test cases page Successfully **************");
	  }
	}

}
