package in.debasish.datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerV2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@class='orangehrm-login-button' or @type='submit']")).click();

		driver.findElement(By.xpath("//span[normalize-space()='Performance']")).click();

		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder='yyyy-mm-dd']"))
				.click();

		String year = "2028";
		String month = "May";
		String date = "15";

		while (true) {
			String mon = driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-month-selected']")).getText();
			String yr = driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-year-selected']")).getText();

			if (mon.equals(month) && yr.equals(year)) {
				break;
			} else {
				driver.findElement(By.xpath("(//i[@class='oxd-icon bi-chevron-right']")).click();

			}
		}
		List<WebElement> allDates = driver
				.findElements(By.xpath("//div[contains(@class,'oxd-calendar-date')]//div//div"));
		
		
		for(WebElement sd: allDates) {
			if(sd.getText().equals(date)) {
				sd.click();
				System.out.println(sd);
				break;
			}
			
		}

		Thread.sleep(4000);
		driver.close();
	}

}
