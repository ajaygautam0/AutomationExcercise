package TestCase19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViewAndCartBrandProducts {

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
		 
		  //Click on Product button
		 driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a")).click();

		//categories are visible on left side bar
		 
		 
			List<WebElement> brands = driver.findElements(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[2]/div/ul/li"));
			System.out.println("Total brands are : " +brands.size());
			if(brands.size() > 2) {
					System.out.println("***************** Brands Verified Successfully **************");
			}
			
		Thread.sleep(1000);

		//Click on any brand name
	   WebElement brandNames = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[2]/div/ul/li[1]/a"));
	   String brandNameText = brandNames.getText();
	  
	   
	   String[] brandNameTextArray = brandNameText.split("\n");
       String brandName = brandNameTextArray[1].trim(); // Trim to remove any leading/trailing whitespace
       brandNames.click();
	   
	   Thread.sleep(1000);
	   
	   // Verify the clicked brand and products..
	   String clickedBrandNameText = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2")).getText();
	   
	   if(clickedBrandNameText.contains(brandName)) {
		   System.out.println("******* User is navigated to brand page and brand products are displayed successfully *******");
	   } else {
		   System.out.println(" Something went wrong !!");
	   }
	   
	   
      Thread.sleep(1000);
      
      // Click an other brand product
       WebElement brandNames2 = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[2]/div/ul/li[2]/a"));
	   String brandNameText2 = brandNames2.getText();
	  
	   
	   String[] brandNameTextArray2 = brandNameText2.split("\n");
      String brandName2 = brandNameTextArray2[1].trim(); // Trim to remove any leading/trailing whitespace
      brandNames.click();
	   
	   Thread.sleep(1000);
	   
	   // Verify the clicked brand and products..
	   String clickedBrandNameText2 = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2")).getText();
	   
	   if(clickedBrandNameText2.contains(brandName2)) {
		   System.out.println("******* User is navigated to that brand page and can see products successfully *******");
	   } else {
		   System.out.println(" Something went wrong !!");
	   }
		
		
	}

}
