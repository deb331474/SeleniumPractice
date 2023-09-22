package in.debasish.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
	 
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		WebElement dropdwn=driver.findElement(By.xpath("//select[@class='custom-select']"));
		
		Select drodownele= new Select(dropdwn);
		
		//drodownele.selectByIndex(3);
		//drodownele.selectByVisibleText("Greece");
	    //drodownele.selectByValue("5");
		
	   List<WebElement> allOptions=(drodownele.getOptions());
	   
	   for(WebElement options:allOptions) {
		   
		   System.out.println(options.getText());
	   }

	}

}
