package Mindtree.Hotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JoinMarriot {
	@Test
		public static void Test2() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.marriott.com/default.mi");
				// Thread.sleep(2000);
				 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				 driver.findElement(By.linkText("Sign In or Join")).click();
				 driver.findElement(By.linkText("Join")).click();  
			//	 Thread.sleep(2000);
				 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				 driver.findElement(By.id("field-first-name")).sendKeys("Sam");
				 // field-first-name
				 driver.findElement(By.id("field-last-name")).sendKeys("Smith");
				 // id="field-last-name"
				 driver.findElement(By.className("selectric")).click();
				 //selectric
				 driver.findElement(By.id("selectric-opt099")).click();
				 // selectric-opt099
				 driver.findElement(By.id("field-email")).sendKeys("sam.smith@gmail.com");
				 // id="field-email"
				 driver.findElement(By.id("field-password")).sendKeys("SamSmith123");
				 // id="field-password"
				 driver.findElement(By.id("field-password-confirmation")).sendKeys("SamSmith123");
				 // id="field-password-confirmation"
				 driver.findElement(By.id("enroll-join")).click();
				 // id="enroll-join"
		}
}
