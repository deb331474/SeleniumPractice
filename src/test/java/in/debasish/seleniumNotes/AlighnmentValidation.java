package in.debasish.seleniumNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlighnmentValidation {
	

	WebDriver driver=new ChromeDriver();
	
	@Test
	void launcAndLogin() throws InterruptedException {
		
		driver.get("https://demo.actitime.com/login.do");
		
	   WebElement username=driver.findElement(By.xpath("//input[@class='textField'][ @id = 'username']"));
		
		int usn_x=username.getLocation().getX();
		int width=username.getSize().getWidth();
		int height=username.getSize().getHeight();
				

		WebElement password= driver.findElement(By.xpath("//input[@name='pwd']"));
		
		int us_x=password.getLocation().getX();
		int with=password.getSize().getWidth();
		int heght=password.getSize().getHeight();
		
		if(usn_x==us_x && width==with && height==heght) {
			System.out.println("Username and password text box are aligned");
		} else {
		System.out.println("Username and password text box are NOT aligned");
		}

		
		Thread.sleep(5000);
	}
	

}