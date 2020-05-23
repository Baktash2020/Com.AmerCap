package TestNg.Com.AmerCap;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUp {
	
	
	
	@BeforeTest
	public void setupTest() throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\GoogleChrome\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			//driver.get("");
			
			
			driver.navigate().to(" https://www.amcfg.com/conventional/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			String url= driver.getCurrentUrl();
			System.out.println(url);
			
			String title= driver.getTitle();
			System.out.println(title);
		
	}
	
	@Test
	
	public void ValidatTitle() {
		
		
		
		
	}
	
	@org.testng.annotations.AfterTest
	
	public void AfterTest() {
	
		
	}

}
