package in.debasish.keyboardEvents;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import in.debasish.JavasciptExecutor.JavascriptExecutor;

public class WindowHandles2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

        driver.get("https://demo.actitime.com/login.do");
        
        String parentwindowHandle = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//input[@class='textField'][ @id = 'username']")).sendKeys("Admin");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(5000);
		
		Set<String> allwhs=driver.getWindowHandles();
		
		for(String wh:allwhs) {
			driver.switchTo().window(wh);
		}
		
		String childTitle=driver.getTitle();
		System.out.println("Title of child tab is: "+childTitle);
		
		driver.close();
		driver.switchTo().window(parentwindowHandle);
		
        driver.findElement(By.xpath("//div[.='Login ']")).click();
		
        driver.close();

	}

}
