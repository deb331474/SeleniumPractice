package in.debasish.MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidingElements {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		//min slider
		WebElement minSlider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Current Location of Min_Slider after moving:"+minSlider.getLocation());
		act.dragAndDropBy(minSlider, 150, 400).perform();
		
		
		
		WebElement maxSlider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Current Location of Min_Slider after moving:"+maxSlider.getLocation());
		act.dragAndDropBy(maxSlider, -90, 400).perform();

	}

}
