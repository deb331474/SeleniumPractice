package in.debasish.seleniumNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActiTime_Tooltip {

	WebDriver driver = new ChromeDriver();

	@Test(priority = 1)
	void launcAndLogin() throws InterruptedException {

		driver.get("https://demo.actitime.com/login.do");
	}
	
	@Test(priority = 2)
	void TooltipAccess() throws InterruptedException {
		
		Thread.sleep(5000);
		//WebElement checkbox=driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		
		//String tooltip_Text=checkbox.getAttribute("title");
		
		WebElement keeplogme=driver.findElement(By.id("keepLoggedInCheckBoxContainer"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(keeplogme).build().perform();
		
		WebElement toolText=driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
		
		
		
		String toolText1=toolText.getText();
		
		
		System.out.println(toolText1);
		
	}
	
	@Test(priority = 3)
	void closeApp() {
		driver.close();
	}
}
