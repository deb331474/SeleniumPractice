package in.debasish.MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		WebElement button= driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		act.contextClick(button).build().perform();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
		driver.switchTo().alert().accept();
		
		
	}

}
