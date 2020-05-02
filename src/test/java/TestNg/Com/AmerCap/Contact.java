package TestNg.Com.AmerCap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
    

import AmerCapPages.ContactsPageObjects;

public class Contact {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilab\\Desktop\\Libraries\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			
			driver.navigate().to("");
			driver.manage().window().maximize();
			
			ContactsPageObjects CPO = new ContactsPageObjects (driver);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			WebElement ContactUs = driver.findElement(By.linkText("Contact"));
			
			   String Contactus = ContactUs.getText();
			    
				
				System.out.println(Contactus);
				
				ContactUs.click();
				
				Thread.sleep(3000);
						
				String url = driver.getCurrentUrl();
					
				System.out.println(url);
					
				String title = driver.getTitle();
					
				System.out.println(title);
				
			Thread.sleep(3000);
			
			CPO.getFirstName().sendKeys("Sabrina");
			CPO.getLastName().sendKeys("Ahmad");
			CPO.getEmail().sendKeys("Sabrina@gmail.com");
			CPO.getAddress().sendKeys("15288 Grist Mill");
			CPO.getCity().sendKeys("Woodbridge");
			
			//Select state = new Select (CPO.getState));
			
			
			//state.selectByIndex(0);
			//Thread.sleep(2000);
			//state.selectByIndex(1);
			//Thread.sleep(2000);
			//state.selectByIndex(2);
			//Thread.sleep(2000);
			//state.selectByIndex(5);
			//Thread.sleep(2000);
			//state.selectByIndex(7);
			//Thread.sleep(2000);
			//state.selectByIndex(10);
			//Thread.sleep(2000);
			//state.selectByIndex(15);
			//Thread.sleep(2000);
			//state.selectByIndex(25);
			CPO.getPhone().sendKeys("571 223 4455");
			CPO.getAlternetPhone().sendKeys("703 443 6745");
			
			
		
			//ContactTime.selectByVisibleText("Morning");
			//Thread.sleep(1000);
			//ContactTime.selectByVisibleText("Afternoon");
			//Thread.sleep(1000);
			//ContactTime.selectByVisibleText("Evening");
			//Thread.sleep(1000);
			
		
			//Select ContactBy = new Select(CPO.getContactMeBy());
			//ContactBy.selectByVisibleText("Email");
		   // Thread.sleep(1000);
			//ContactBy.selectByVisibleText("Phone");
			
			CPO.getContactMeBy().isSelected();
			
		    CPO.getComments().sendKeys("You have great services");
			
			driver.quit();
		
		
		
		
		
		
		

	}

}
