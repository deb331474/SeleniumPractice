package in.debasish.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("packageListFrame");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium.grid.distributor']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//li//a[text()='GridModel']")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement iframe1=driver.findElement(By.xpath("//iframe[@name='classFrame']"));
		
		driver.switchTo().frame(iframe1);
		
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Static Methods']")).click();
		
		/*
		 * Thread.sleep(5000);
		 * 
		 * driver.switchTo().frame("classFrame");
		 * 
		 * driver.findElement(By.xpath("//*[normalize-space()='Static Methods']"));
		 * 
		 * //driver.findElement(By.xpath("(//li[@class='navBarCell1Rev'])[1]")).click();
		 * 
		 * driver.close();
		 */
		
		//driver.close();
	}

}
