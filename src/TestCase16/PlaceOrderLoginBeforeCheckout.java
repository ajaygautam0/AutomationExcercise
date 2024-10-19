package TestCase16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PlaceOrderLoginBeforeCheckout {

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
			
			//Sign up / Login
			//Login to your account
			
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
			
		String signUpPageTitle = driver.getTitle();
		if(signUpPageTitle.equalsIgnoreCase("Automation Exercise - Signup / Login")) {
				System.out.println("***************** Login to your account is visible **************");
				
		}
		/*
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		
		 // Enter name  and email
		WebElement na = driver.findElement(By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)"));
		na.sendKeys("Ajay Gautam");

		WebElement em = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
		em.sendKeys("ak53@gmail.com");
		        
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
				
		WebElement pas = driver.findElement(By.id("password"));
		pas.sendKeys("Ajay@04912");
				
				
		Select daysDropdown = new Select(driver.findElement(By.id("days")));  
		daysDropdown.selectByVisibleText("17"); 
				
		Select monthsDropdown = new Select(driver.findElement(By.id("months")));  
		monthsDropdown.selectByVisibleText("June"); 
				
		Select yearsDropdown = new Select(driver.findElement(By.id("years"))); 
		yearsDropdown.selectByVisibleText("1999"); 
				
		Thread.sleep(2000);
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
		*/
		 Thread.sleep(1000);
	        // correct email address and password
	    WebElement email = driver.findElement(By.name("email"));
	    email.sendKeys("ak53@gmail.com");
	    
	    Thread.sleep(1000);
	    
	    WebElement pass = driver.findElement(By.name("password"));
	    pass.sendKeys("Ajay@04912");
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		        
	    String LoggedinasusernamePageTitle = driver.getTitle();
	   	if(LoggedinasusernamePageTitle.equalsIgnoreCase("Automation Exercise")) {
	   		System.out.println("***************** Logged in as username Page Verified **************");
	   		}

	    Thread.sleep(1000);	

		// Click Add to Cart
//			  WebElement ho = driver.findElement(By.xpath("//a[contains(text(), 'Add to cart') and @data-product-id='1']"));
		WebElement product1 = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a"));
		product1.click();

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

		// Click to proceed checkout
		driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();

		Thread.sleep(1000);
		// Address Details and Review Your Order
		String deliveryAddress = driver.findElement(By.xpath("//*[@id=\"address_delivery\"]")).getText().substring(22);
		Thread.sleep(1000);
		String billingAddress = driver.findElement(By.xpath("//*[@id=\"address_invoice\"]")).getText().substring(21);
		
		if(deliveryAddress.equalsIgnoreCase(billingAddress)) {
			System.out.println("***************Address Details Verfied******************");
				
		Thread.sleep(1000);
		//Review
		String revieworder = driver.findElement(By.xpath("//*[@id=\"cart_info\"]/table/tbody/tr[2]/td[3]/h4/b")).getText();
		if(revieworder.equalsIgnoreCase("Total Amount")) {
			System.out.println("**************Order Review Successfully******************");
		}
		
		Thread.sleep(1000);
		//Description in comment box 
	    WebElement msg = driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea"));
	    msg.sendKeys("reach on time");
	    
	    Thread.sleep(1000);
	    //Place Order
	    driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a")).click();
	    
	    Thread.sleep(1000);
	    //Name on card
	    WebElement name = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input"));
	    name.sendKeys("Ajay Gautam");
	    
	    Thread.sleep(1000);
	    //Card Number
	    WebElement cardnumber = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input"));
	    cardnumber.sendKeys("124598456523");
	    
	    Thread.sleep(1000);
	    //CVC
	    WebElement cvc = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input"));
	    cvc.sendKeys("412");
	    
	    Thread.sleep(1000);
	    //Expiration
	    WebElement expmonth = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input"));
	    expmonth.sendKeys("06");	
	    
	    Thread.sleep(1000);
	    WebElement expyear = driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input"));
	    expyear.sendKeys("2025");
	    
	    Thread.sleep(1000);
	    
	    //Pay and order
	    driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

	    Thread.sleep(1000);
	    //Your order placed
	    String YourorderhasbeenplacedsuccessfullyTitle = driver.getTitle();
		  if(YourorderhasbeenplacedsuccessfullyTitle.equalsIgnoreCase("Automation Exercise - Payment")) {
			 System.out.println("***************** Your order has been placed successfully! Verified **************");
		  }
		  
		Thread.sleep(1000);
		
		//Click delete account
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
		
		Thread.sleep(1000);
		
		//Verify Account is Delete 
		 String AccountisDeleteTitle = driver.getTitle();
		  if(AccountisDeleteTitle.equalsIgnoreCase("Automation Exercise - Account Created")) {
			 System.out.println("***************** Account is Delete Verified **************");
		  }
		  
		Thread.sleep(1000);
		
		//Click Continue button
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();
		}
	}

}
