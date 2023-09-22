package in.debasish.alertPopup;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogledropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		
		List<WebElement> options=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d') and @role='presentation']//span"));
		
		Thread.sleep(5000);
		
		System.out.println("size of elements" + options.size());
		
		Thread.sleep(5000);
		
		for(int i=0;i<options.size();i++) {
			
			String text=options.get(i).getText();
			
			if(text.equals("selenium interview questions")) {
				options.get(i).click();
			}
		}
		
		driver.close();

	}

}