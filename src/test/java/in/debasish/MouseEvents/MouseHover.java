package in.debasish.MouseEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
	    WebElement Comp=driver.findElement(By.xpath("//a[normalize-space()='Components']"));
	    WebElement moni=driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']"));
	    
	    Actions act= new Actions(driver);
	    act.moveToElement(Comp).moveToElement(moni).click().build().perform();
		

		
	}

}
