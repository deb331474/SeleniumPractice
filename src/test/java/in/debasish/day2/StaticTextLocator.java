package in.debasish.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		WebElement userName=driver.findElement(By.xpath("//input[@name='username']"));
		
		userName.sendKeys("Admin");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
		
		passWord.sendKeys("admin123");
		

		Thread.sleep(4000);
		
		WebElement clickLogin = driver.findElement(By.xpath("//button[@class='orangehrm-login-button' or @type='submit']"));
		
		clickLogin.click();
		
		
		Thread.sleep(4000);
		
		String act_label = "";
		try {
		
		act_label = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		}
		
		catch (NoSuchElementException e) {
			
		}
		
		String expected_label = "Dashboard";
		
		Thread.sleep(4000);
		
		if(expected_label.equals(act_label)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		
		driver.close();

	}

}
