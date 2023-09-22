package in.debasish.Tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WayToAoutomation {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	void AccessPage() {
		
		driver.get("https://www.way2automation.com/angularjs-protractor/webtables/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	}
	//script for adding users
	
	@Test
	void paginationNavigation() throws InterruptedException {
		
		String nextButtonclass=driver.findElement(By.xpath("//a[normalize-space()='>']")).getAttribute("class");
		System.out.println(nextButtonclass);
		WebElement nextButton=driver.findElement(By.xpath("//a[normalize-space()='>']"));
		
		while(!nextButtonclass.contains("disabled")) {
			
			List<WebElement> allItesms=driver.findElements(By.xpath("//table[@class='smart-table table table-striped']/tbody/tr/td"));
			
			for(WebElement wb:allItesms) {
				System.out.println(wb.getText());
			}
			nextButton.click();
			Thread.sleep(5000);
			break;
		}
		
		
	}
	
	@AfterTest
	void closeApp() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
