package in.debasish.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class secondTest {

	WebDriver driver;
	
	
	@Test(priority=10)
	void openApp(){
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	}
	
	@Test(priority=40)
	public void logIn() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	@Test(priority=90)
	public void closeApp() {
		
		driver.quit();
	}
	
}
