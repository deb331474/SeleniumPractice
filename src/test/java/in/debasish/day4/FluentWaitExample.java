package in.debasish.day4;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

//For Fluent wait time we have to implement anonymous functions or arrow functions

public class FluentWaitExample {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		
		Function<WebDriver, WebElement> username= new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@placeholder='Username']"));
			}
		};
		
		WebElement useerid = wait.until(username);
		
		useerid.click();
		
		useerid.sendKeys("admin");
		
	}

}
