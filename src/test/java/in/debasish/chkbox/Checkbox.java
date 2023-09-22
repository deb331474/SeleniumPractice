package in.debasish.chkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		// selecting specific checkboxes

		/*WebElement chkbox = driver.findElement(By.xpath("//input[@id='tuesday']"));
		chkbox.click();*/
		
		//selecting multiple checkboxes
		
		List<WebElement> allCheckboxes=driver.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"));
		System.out.println(allCheckboxes.size());
		
		/*
		 * for(int i=0;i<allCheckboxes.size();i++) {
		 * 
		 * if(i<5 && i>0)
		 * 
		 * allCheckboxes.get(i).click(); }
		 */
       
		for(WebElement chkbc:allCheckboxes) {
			
			chkbc.click();
		}
		
		Thread.sleep(5000);
		driver.close();
	}

}
