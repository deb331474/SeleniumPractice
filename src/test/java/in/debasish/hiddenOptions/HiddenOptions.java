package in.debasish.hiddenOptions;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenOptions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@class='orangehrm-login-button' or @type='submit']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		driver.findElement(By.xpath("(//div[@class='oxd-select-text--after']//i)[1]")).click();
		
		List<WebElement> allDropdownEle = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		Thread.sleep(3000);
		
		for(WebElement wb:allDropdownEle) {
			if(wb.getText().equals("Freelance")) {
				
				wb.click();
				break;
			}
			
		}
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
