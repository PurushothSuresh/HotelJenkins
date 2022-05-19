package Mindtree.Hotel;

//import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindHotel {
	@Test
	public static void Test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.marriott.com/default.mi");
	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		// Click on Find Hotels
		
		driver.findElement(By.xpath("//span[@class='StyledFindBtn-sc-o33zur emEtoe'] //button[@type='submit']")).click();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// Selecting Banglore Location
		
		driver.findElement(By.xpath("//div[@class='search-field-box'] //input[@placeholder='Where do you want to go?']")).sendKeys("banglore");
		driver.findElement(By.xpath("//a[@data-primary-description='Bangalore']")).click();
		
		
		// Check_in Date
		
//		driver.findElement(By.xpath("//div[@data-takeover-label='Dates'] //input[@placeholder='Check-in']")).click();
//		List<WebElement> dat = driver.findElements(By.xpath("//div[@class='td-elem']"));
//		for(WebElement gt : dat )
//		{
//		if(gt.findElement(By.xpath("//span[@class='t-date-value']")).getText().equals("23"));
//		{
//		gt.click();
//		break;
//		}
//		}
		
/////        Check Out
		
//		driver.findElement(By.xpath("//input[@placeholder='Check-out']")).click();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@placeholder='Check-out']")).click();
		
		
		
		// for selecting room and head count
		
		driver.findElement(By.xpath("//div[@class='l-display-flex'] //a[@aria-label='Rooms & Guests'] //p[@class='l-display-text']")).click();
	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//      Adding rooms	
//		driver.findElement(By.xpath("//div[@class='clearfix l-s2-stepper'] //a[@aria-label='Add Rooms']")).click();

		driver.findElement(By.xpath("//div[@class='clearfix l-s2-stepper'] //a[@aria-label='Add Adults Per Room']")).click();
		driver.findElement(By.xpath("//div[@class='clearfix l-s2-stepper'] //a[@aria-label='Add Children Per Room']")).click();
	
		//set child age to 4
		for(int i=0;i<5;i++) {
			driver.findElement(By.xpath("//div[@class='clearfix l-s2-stepper'] //a[@aria-label='Up Age']")).click();
		}
		
		
		driver.findElement(By.xpath("//div[@class='l-display-flex'] //a[@aria-label='Rooms & Guests'] //p[@class='l-display-text']")).click();
		
		
////////   Bottom Row		
		
		// Selecting Special Rates
		
		driver.findElement(By.xpath("//div[@class='m-field-control l-special-rates l-em-reset l-s-col-4 l-xl-col-4 js-hform-fields l-margin-bottom-three-quarters'] //a[@aria-label='Special Rates']")).click();
		driver.findElement(By.xpath("//*[@id='advanced-search-form']/div/div[6]/div/div/ul/li[2]/a/fieldset/legend/label")).click();
		
		
//		//Selecting the branding
		
		driver.findElement(By.xpath("//a[@class='js-toggle js-brands-header t-blk l-h-toggle l-h-field analytics-click'] //span[@class='l-h-toggle-brand-text']")).click();
		driver.findElement(By.xpath("//*[@id='advanced-search-form']/div/div[7]/div/fieldset/div[2]/ul/li[1]/label/input")).click();
		Thread.sleep(2000);
		
//		//user points
		driver.findElement(By.xpath("//div[@id='rewards-use-search']")).click();
		
		//Find Button
		
//		driver.findElement(By.xpath("//div[@class='l-s-col-4 l-xl-col-2 l-xl-last-col l-hsearch-find'] //button[@type='submit']")).click();
		

	}	

}


