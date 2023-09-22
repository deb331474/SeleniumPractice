package in.debasish.MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		field1.sendKeys("Debasish Pruseth");
		
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(button).build().perform();
		
		WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
		
		//String copiedText=field2.getAttribute("value");
		
		Thread.sleep(3000);
		
		if(field2.getAttribute("value").equals(field1.getAttribute("value"))){
			
			System.out.println("Validation Passed");
			
		}
		else {
			System.out.println("Validation Failed");
		}
		
		//if getText() is not working then try with getAttribute value if value is defined inside value"" attribute

	}

}
