package TestCase6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUsForm {

  public static void main(String[] args) throws InterruptedException, AWTException {
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
		
	//Click On 'Contact Us' Button
	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")).click();

	String GetinTouchPageTitle = driver.getTitle();
	 if(GetinTouchPageTitle.equalsIgnoreCase("Automation Exercise - Contact Us")) {
		   System.out.println("***************** GET IN TOUCH Page Verified **************");
	  }
	Thread.sleep(1000);
		
	//Enter name,email,subject and message
		
	//Name
	WebElement name	= driver.findElement(By.name("name"));
	name.sendKeys("Ajay Gautam");
		
	//Email
	WebElement email = driver.findElement(By.name("email"));
	email.sendKeys("aj05@gmail.com");
		
	//Subject
	WebElement subject	= driver.findElement(By.name("subject"));
	subject.sendKeys("Pent,T-shirt");
		
	//Message
	WebElement msg = driver.findElement(By.id("message"));
	msg.sendKeys("This is the demo website - Automation Exercise");
		
	Thread.sleep(1000);
		
	//Upload File
	//driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[5]/input")).click();
	Robot robo = new Robot();
	robo.keyPress(KeyEvent.VK_TAB);
	robo.keyPress(KeyEvent.VK_ENTER);
	File f = new File("./autoit/Collections in Java2.docx");
	 WebElement file = driver.findElement(By.cssSelector("input[type='file']"));
	    
     file.sendKeys(f.getAbsolutePath());
	//Submit
    driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input")).click();
	
	//OK button
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	//Success! Your details have been submitted successfully.' is visible
	String SubmittedSuccessfulluPageTitle = driver.getTitle();
	 if(SubmittedSuccessfulluPageTitle.equalsIgnoreCase("Automation Exercise - Contact Us")) {
		   System.out.println("***************** Success! Your details have been submitted successfully. is visible **************");
	  }
	 Thread.sleep(1000);
	 
	 //Home
	 driver.findElement(By.cssSelector("#form-section > a > span")).click();
	}

}
