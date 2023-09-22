package in.debasish.seleniumNotes;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActiTime1 {
	
	WebDriver driver=new ChromeDriver();
	
	@Test(priority = 1)
	void launcAndLogin() throws InterruptedException {
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("//input[@class='textField'][ @id = 'username']")).sendKeys("Admin");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		Thread.sleep(5000);

	}
	
	@Test(priority = 2)
	void clickOnSetting() throws InterruptedException {
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement setting=driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]"));
		Thread.sleep(5000);
		
		setting.click();
		Thread.sleep(5000);
		setting.findElement(By.xpath("//a[.='Types of Work']")).click();
		
		
	}
	
	@Test(priority = 3)
	void logOut() throws InterruptedException {
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
