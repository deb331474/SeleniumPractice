package in.debasish.MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement capital_Stockhalm=driver.findElement(By.xpath("//div[@id='box2']"));
		
		WebElement cntry_Norway = driver.findElement(By.xpath("//div[@id='box101']"));
		
		act.dragAndDrop(capital_Stockhalm, cntry_Norway).perform();

	}

}
