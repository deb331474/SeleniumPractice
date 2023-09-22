package in.debasish.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://ui.vision/demo/webtest/frames/");

		driver.manage().window().maximize();
		
		WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frm1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("11111");
		
		driver.switchTo().defaultContent();
		
		WebElement frm2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		
		driver.switchTo().frame(frm2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("2356");
		
		driver.switchTo().parentFrame();
		
		WebElement frm4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		
		driver.switchTo().frame(frm4);
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("55555");
		
		driver.switchTo().parentFrame();
		
        WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frm3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("66666");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("div.AB7Lab")).click();
		
		driver.switchTo().defaultContent();
		
		driver.close();

	}

}
