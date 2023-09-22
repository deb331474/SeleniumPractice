package in.debasish.captureScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShots {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File trg=new File("C:\\Users\\Debasish\\eclipse-workspace\\SeleniumTesting\\Screenshots\\fullpage.png");
		
		FileUtils.copyFile(src, trg);
		
		//capturing screenshots from specific area of the web pages=========
		
		WebElement macbook=driver.findElement(By.xpath("//img[@alt='Picture of Apple MacBook Pro 13-inch']"));
		
		src=macbook.getScreenshotAs(OutputType.FILE);
		
		File trg1=new File("C:\\Users\\Debasish\\eclipse-workspace\\SeleniumTesting\\Screenshots\\macbook.png");
		
		FileUtils.copyFile(src, trg1);
		driver.quit();

	}

}
