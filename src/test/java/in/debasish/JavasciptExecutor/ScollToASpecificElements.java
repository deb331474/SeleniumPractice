package in.debasish.JavasciptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScollToASpecificElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.selenium.dev/downloads/");

		org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
		
		WebElement appliTools=driver.findElement(By.xpath("//img[@alt='Applitools']"));
		
		int x=appliTools.getLocation().getX();
		int y=appliTools.getLocation().getY();
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		Thread.sleep(3000);
		
		
		

	}

}
