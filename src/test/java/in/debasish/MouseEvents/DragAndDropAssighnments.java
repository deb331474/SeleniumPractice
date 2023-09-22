package in.debasish.MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAssighnments {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement five1=driver.findElement(By.xpath("(//li[@class='block13 ui-draggable']//a)[1]"));
		WebElement five2=driver.findElement(By.xpath("(//li[@class='block13 ui-draggable']//a)[2]"));
		WebElement amount1=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement amount2=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

		Thread.sleep(3000);
		if(five1.getText().equals("5000")) {
			act.dragAndDrop(five1, amount1).perform();
			act.dragAndDrop(five1, amount2).perform();
		}
		
		
	}

}
