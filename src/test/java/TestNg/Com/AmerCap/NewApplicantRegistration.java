package TestNg.Com.AmerCap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewApplicantRegistration {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\Chromed\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.navigate().to("");
		driver.manage().window().maximize();
		
		WebElement ApplyOnline = driver.findElement(By.linkText("Apply Online"));
		
		   String Applyonline = ApplyOnline.getText();
		    
			
			System.out.println(Applyonline);
			
			ApplyOnline.click();
			
			Thread.sleep(3000);
					
			String url = driver.getCurrentUrl();
				
			System.out.println(url);
				
			String title = driver.getTitle();
				
			System.out.println(title);
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		//driver.navigate().to("https://secure-apps.smartapp1003.com/201132/?loanofficerid=0");
		
		WebElement GetStartedNow = driver.findElement(By.linkText("Get Started Now!"));
		
		   String getstartednow = GetStartedNow.getText();
		    
			
			System.out.println(getstartednow);
			
			//GetStartedNow.click();
			
			driver.navigate().forward();
			
			Thread.sleep(3000);
					
			String url1 = driver.getCurrentUrl();
				
			System.out.println(url1);
				
			String title1 = driver.getTitle();
				
			System.out.println(title1);
		
		Thread.sleep(3000);
		
		
		
		
		
		driver.quit();
		
		

	}

}
