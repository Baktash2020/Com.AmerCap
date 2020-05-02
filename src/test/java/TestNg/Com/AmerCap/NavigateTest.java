package TestNg.Com.AmerCap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {

	public static void main(String[] args) throws InterruptedException {

   System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilab\\Desktop\\Libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.navigate().to("");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ApplyOnline = driver.findElement(By.linkText("Apply Online"));
		
		String LinkText = ApplyOnline.getText();
		System.out.println(LinkText);
		
		ApplyOnline.click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		driver.close();

	}

}
