package in.debasish.datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
	    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String year="2028";
		String month="November";
		String date="23";
		
		while(true) {
		String mon= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String yr= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(mon.equals(month) && yr.equals(year)) {
			
			break;
		}
		else {
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			//inside the loop at a time 2 same actions cannot be performed
		}
		
		}
		
		List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ab: allDates) {
			
			if(ab.getText().equals(date)) {
				ab.click();
				System.out.println(date);
				break;
			}
		}
		
		Thread.sleep(4000);
		driver.close();
		
		

	}

}
