package TestNg.Com.AmerCap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCodes {

	public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\GoogleChrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		driver.manage().window().maximize();
		Thread.sleep(30);
		driver.quit();
		

	

	}

}
