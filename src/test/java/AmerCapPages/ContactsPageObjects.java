package AmerCapPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactsPageObjects {
	
	WebDriver driver;
	
	public ContactsPageObjects(WebDriver x) {
		driver=x;
	}
	
	public WebElement getInfo(){
	WebElement Info = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/h4[6]/a/span"));
	return Info;
	}
	
	
	public WebElement getFirstName(){
		WebElement FirstName = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[1]/div/div[1]/input"));
		return FirstName;
		}
	
	public WebElement getLastName(){
		WebElement LastName = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[2]/div/div[1]/input"));
		return LastName;
		}
	
	public WebElement getEmail(){
		WebElement Email = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[3]/div/div[1]/input"));
		return Email;
		}
	
	public WebElement getAddress(){
		WebElement Address = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[4]/div/div/input"));
		return Address;
		}
	
	public WebElement getCity(){
		WebElement City = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[5]/div/div/input"));
		return City;
		}
	
	public WebElement getState() {
	
	WebElement State = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[6]/div/div/select"));
		return State; 
	}
	
	public WebElement getPhone(){
		WebElement Phone = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[7]/div/div/input"));
		return Phone;
		}
	
	public WebElement getAlternetPhone(){
		WebElement AlternetPhone = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[8]/div/div/input"));
		return AlternetPhone;
		}
	
	public WebElement getBestTimeConact(){
		WebElement BestTimeConact = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[9]/div/select"));
		return BestTimeConact;
		}
	
	public WebElement getContactMeBy(){
		WebElement ContactMeBy = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[10]/div/select"));
		return ContactMeBy;
		}
	
	public WebElement getComments(){
		WebElement Comments = driver.findElement(By.xpath("//*/div[1]/div/div[1]/div[11]/div/div/textarea"));
		return Comments;
		}
	
	public WebElement get(){
		WebElement Name = driver.findElement(By.xpath(""));
		return Name;
		}
	

}
