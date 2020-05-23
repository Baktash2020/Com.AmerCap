package TestNg.Com.AmerCap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoanProgramsDropDowns {

	public static void main(String[] args) throws InterruptedException {


       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\GoogleChrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amcfg.com/loan-programs/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement LoanAmount = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[6]/div/select"));
		
		Select Month = new Select(LoanAmount);
		
		Month.selectByVisibleText("Less than $70,000");
		Thread.sleep(3000);
		
		Month.selectByVisibleText("$70,001 - $80,000");
		
		WebElement PropertyValue = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[7]/div/select"));
		
		Select Property = new Select(PropertyValue);
		
		Property.selectByIndex(3);
		Thread.sleep(3000);
		Property.selectByIndex(5);
		Thread.sleep(3000);
		Property.selectByIndex(10);
		Thread.sleep(3000);
		Property.selectByIndex(15);
		
		
		Thread.sleep(3000);
		
		driver.quit(); 
		
		
	}
	
	 

}
