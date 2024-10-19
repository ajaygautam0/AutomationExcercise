package TestCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

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
     //Sign up / login button
	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		
	 //New User Sign up is Visible
	String signUpPageTitle = driver.getTitle();
    if(signUpPageTitle.equalsIgnoreCase("Automation Exercise - Signup / Login")) {
	 System.out.println("***************** New User Signup is visible **************");
  }
      // Enter name  and email
	WebElement na = driver.findElement(By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)"));
    na.sendKeys("Ajay Gautam");

	WebElement em = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
    em.sendKeys("v5555@gmail.com");
        
	   //Sign Up Button
    driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
	    
	  //ENTER ACCOUNT INFORMATION is visible
	String EnterAccountInformationPageTitle = driver.getTitle();
    if(EnterAccountInformationPageTitle.equalsIgnoreCase("Automation Exercise - Signup")) {
	 System.out.println("***************** Enter Account Information is visible **************"); 
  }
		
	Thread.sleep(1000);
	   // Title, Name, Email, Password, DOB
	driver.findElement(By.id("id_gender1")).click();
	
	Thread.sleep(1000);
		
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("Ajay@04912");
		
		
	Select daysDropdown = new Select(driver.findElement(By.id("days")));  
	daysDropdown.selectByVisibleText("17"); 
		
	Select monthsDropdown = new Select(driver.findElement(By.id("months")));  
	monthsDropdown.selectByVisibleText("June"); 
		
	Select yearsDropdown = new Select(driver.findElement(By.id("years"))); 
	yearsDropdown.selectByVisibleText("1999"); 
		
	Thread.sleep(1000);
	  //check box 'Sign up for our newsletter' 
	WebElement id = driver.findElement(By.id("newsletter"));
	id.click();
		
	Thread.sleep(1000);
	  //check box 'Receive special offers from our partners!'
	driver.findElement(By.id("optin")).click();
		
	Thread.sleep(1000);
	  //First Name
    WebElement fn = driver.findElement(By.id("first_name"));
	fn.sendKeys("Ajay");
		
     //Last Name
    WebElement ln = driver.findElement(By.id("last_name"));
    ln.sendKeys("Gautam");
        
    Thread.sleep(1000);
     //Company
    WebElement comp = driver.findElement(By.id("company"));
    comp.sendKeys("BMM Labs");
        
    Thread.sleep(1000);
     //Address
    WebElement add = driver.findElement(By.id("address1"));
    add.sendKeys("Vijay Nagar Ghaziabad");
        
    Thread.sleep(1000);
     //Address2
    WebElement add2 = driver.findElement(By.id("address2"));
    add2.sendKeys("Vijay Nagar Ghaziabad");
        
    Thread.sleep(1000);
    //Country
    Select countryDropdown = new Select(driver.findElement(By.id("country"))); 
	countryDropdown.selectByVisibleText("Canada"); 
		
    Thread.sleep(1000);
    //State
    WebElement state = driver.findElement(By.id("state"));
    state.sendKeys("Uttar Pradesh");
        
    Thread.sleep(1000);
    //City
    WebElement city = driver.findElement(By.id("city"));
    city.sendKeys("Ghaziabad");
        
    Thread.sleep(1000);
    //Zipcode
    WebElement zip = driver.findElement(By.id("zipcode"));
    zip.sendKeys("201009");
        
    Thread.sleep(1000);
    //Mobile Number
    WebElement nu = driver.findElement(By.id("mobile_number"));
    nu.sendKeys("9625135460");
        
    Thread.sleep(1000);
    //Click 'Create Account button'
    driver.findElement(By.xpath("//button[.='Create Account']")).click();
        
    Thread.sleep(1000);
    //Continue button
    driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
		
    Thread.sleep(1000);
    //Logged in as user name
    String LoggedinasusernamePageTitle = driver.getTitle();
	if(LoggedinasusernamePageTitle.equalsIgnoreCase("Automation Exercise")) {
		System.out.println("***************** Logged in as username Page Verified **************");
		}

	//delete account
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
	String  DeleteAccountPageTitle = driver.getTitle();
	if( DeleteAccountPageTitle.equalsIgnoreCase("Automation Exercise - Account Created")) {
		System.out.println("*****************  Delete Account Page Verified **************");
	}
	//Continue button
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
		
 }

}
