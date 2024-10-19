package TestCase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailandPasswordIncorrect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://automationexercise.com/");
			
			//Navigate url
			//Home Page Visible
			
		String homePageTitle = driver.getTitle();
		if(homePageTitle.equalsIgnoreCase("Automation Exercise")) {
				System.out.println("***************** Home Page Verified **************");
		}
			
			//Sign up / Login
			//Login to your account
			
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
			
		String signUpPageTitle = driver.getTitle();
		if(signUpPageTitle.equalsIgnoreCase("Automation Exercise - Signup / Login")) {
				System.out.println("***************** Login to your account is visible **************");
		
		Thread.sleep(1000);
			        // Incorrect email address and password
	    WebElement email = driver.findElement(By.name("email"));
	    email.sendKeys("mj53@gmail.com");
			    
	    Thread.sleep(1000);
			    
	    WebElement pass = driver.findElement(By.name("password"));
	    pass.sendKeys("Ajay@04912");
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
	    
	    String errorMessage = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p")).getText();
	    
	    if(errorMessage.equalsIgnoreCase("Your email or password is incorrect!")) {
	    	System.err.println(errorMessage);
	    }
		
		}
	}	
		
}
