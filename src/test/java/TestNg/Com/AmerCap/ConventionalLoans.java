package TestNg.Com.AmerCap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConventionalLoans {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilab\\Desktop\\Libraries\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			//driver.get("");
			
			
			driver.navigate().to("");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			String url= driver.getCurrentUrl();
			System.out.println(url);
			
			String title= driver.getTitle();
			System.out.println(title);
			
			
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[2]/div/div[1]/input")).sendKeys("Sheetal");
	// firstName.clear();
	
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[3]/div/div[1]/input")).sendKeys("Jan Qand");
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[4]/div/div[1]/input")).sendKeys("sheetal@gmail.com");
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[5]/div/div[1]/input")).sendKeys("571 3312345");
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[6]/div/select")).isSelected();
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[6]/div/select")).isSelected();
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[7]/div/select")).isSelected();
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[8]/div/select")).isSelected();
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[9]/div/select")).isSelected();
	
	//driver.findElement(By.xpath("//*/div[1]/div/div[2]/div/a")).isEnabled();
	
	Thread.sleep(3000);
	
	WebElement AboutUs = driver.findElement(By.linkText("About Us"));
	
   String Aboutus = AboutUs.getText();
    
	
	System.out.println(Aboutus);
	
	AboutUs.click();
	
	Thread.sleep(3000);
			
	String url1 = driver.getCurrentUrl();
		
	System.out.println(url1);
		
	String title1 = driver.getTitle();
		
	System.out.println(title1);
	
	
		
		
	driver.quit();
			

		}
			

}
