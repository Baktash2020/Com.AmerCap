package TestNg.Com.AmerCap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConventionalLoans {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilab\\Desktop\\Libraries\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			//driver.get("https://www.amcfg.com/conventional/");
			
			driver.navigate().to("https://www.amcfg.com/conventional/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			String url= driver.getCurrentUrl();
			System.out.println(url);
			
			String title= driver.getTitle();
			System.out.println(title);
			
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[2]/div/div[1]/input")).sendKeys("Nillab");
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[3]/div/div[1]/input")).sendKeys("Jan Qand");
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[4]/div/div[1]/input")).sendKeys("nilabat@gmail.com");
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[5]/div/div[1]/input")).sendKeys("571 3312345");
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[6]/div/select")).isSelected();
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[6]/div/select")).isSelected();
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[7]/div/select")).isSelected();
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[8]/div/select")).isSelected();
	
	driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[9]/div/select")).isSelected();
	
	driver.findElement(By.xpath("//*/div[1]/div/div[2]/div/a")).isEnabled();
	
	WebElement Contacts = driver.findElement(By.linkText("Contact"));
	
	String Contact = Contacts.getText();
	
	System.out.println(Contact);
	
	

			Thread.sleep(3000);
			
		
			driver.quit();
			

		}
			

}
