package TestCase18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewCategoryProducts {

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
		
		//categories are visible on left side bar
		String categoriesarevisibleonleftsidebar = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div")).getText();
		if(categoriesarevisibleonleftsidebar.equalsIgnoreCase("CATEGORY, BRANDS")) {
				System.out.println("***************** categories are visible on left side bar Verified **************");
		}
		
		Thread.sleep(2000);
		
		//Click on 'Women' category
		driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")).click();
		
		
		Thread.sleep(1000);
		
		//Click on any category link under 'Women' category, for example: Dress
		
		driver.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a")).click();
		
		//Category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
		String womenproductPageTitle = driver.getTitle();
		if(womenproductPageTitle.equalsIgnoreCase("Automation Exercise - Dress Products")) {
				System.out.println("***************** 'WOMEN - TOPS PRODUCTS' Page Verified **************");
		}
		
		Thread.sleep(1000);
		
		//Click on any category link under 'Men' category
		driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[2]/div[1]/h4/a")).click();
		
		Thread.sleep(1000);
		//Click jeans
		driver.findElement(By.xpath("//*[@id=\"Men\"]/div/ul/li[2]/a")).click();
		
		// Verify that user is navigated to that category page
		String menproductPageTitle = driver.getTitle();
		if(menproductPageTitle.equalsIgnoreCase("Automation Exercise - Jeans Products"))
			System.out.println("************Men Product is Verified***************");

	}

}
