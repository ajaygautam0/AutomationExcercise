package TestCase5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUserWithExitingEmail {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
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
				
		}
		 Thread.sleep(1000);
		 
		   // Enter name  and email
		 
			WebElement na = driver.findElement(By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)"));
		    na.sendKeys("Ajay Gautam");

			WebElement em = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
		    em.sendKeys("aj05@gmail.com");
	    
	    Thread.sleep(1000);
	     
	    //Sign Up
	    
	    driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
	    
        String errorMessage = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/p")).getText();
	    
	    if(errorMessage.equalsIgnoreCase("Email Address already exist!")) {
	    	System.err.println(errorMessage);
       }
	}

}
