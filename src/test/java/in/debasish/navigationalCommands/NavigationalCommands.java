package in.debasish.navigationalCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//selecting specific checkboxes
		
		/*WebElement chkbox=driver.findElement(By.xpath("//input[@id='tuesday']"));
	    chkbox.click();*/
		
		
		

	}

}
