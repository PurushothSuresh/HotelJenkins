package Mindtree.Hotel;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TripMariot {
	@Test
	public static void Test3() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.marriott.com/default.mi");
		 //Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("My Trips")).click();

		 //  Filling the MyTrip Form		
		Thread.sleep(2000);
		driver.findElement(By.id("confirmationNumber")).sendKeys("123456");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement cin2 = driver.findElement(By.xpath("//input[@id='cInDate']"));
		cin2.click();
		List<WebElement> cinDates2= cin2.findElements(By.xpath("//div[@role='gridcell']"));
		for(WebElement d : cinDates2)
		{
			if(d.getText().equals("23")) {
				d.click();
				break;
			}
		}
		driver.findElement(By.id("firstName")).sendKeys("sam"); 
		driver.findElement(By.id("lastName")).sendKeys("smith");
	// Find reservation button	
  	    driver.findElement(By.id("find-reservaton")).click();

		
//		//  Sign in to your account ---
		
//		driver.findElement(By.id("user-id")).sendKeys("samSmith@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("SamSmith123#");
//		driver.findElement(By.xpath("//button[@name='submitButton']")).click();

		
		
//       Forget Password  -------------------- 
		
//		driver.findElement(By.xpath("//div[@class='js-forgot-password l-margin-bottom-five-quarters'] //a[@class='t-extend-link analytics-click t-line-height-m t-font-s']")).click();
//		
//		driver.findElement(By.id("accountIdOrEmailAddress")).sendKeys("Samsmith@gmail.com");
//		// id="accountIdOrEmailAddress"
//		driver.findElement(By.id("field-first-name")).sendKeys("Sam");
//		// id="field-first-name"
//		driver.findElement(By.id("field-last-name")).sendKeys("Smith");
//		// id="field-last-name"
//		driver.findElement(By.className("selectric")).click();
//		//class="selectric"
//		driver.findElement(By.id("selectric-opt0100")).click();
//		//id="selectric-opt0100"
		
//		// only for usa zip avail
////		driver.findElement(By.id("field-postal")).sendKeys("600001");
////  submit button		
//		driver.findElement(By.xpath("//button[@class='m-button m-button-primary l-s-col-4 l-m-col-8 l-l-col-6 submit-button js-btn-submit']")).click();
//		
		
	}

}

