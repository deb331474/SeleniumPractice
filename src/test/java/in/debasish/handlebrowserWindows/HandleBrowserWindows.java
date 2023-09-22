package in.debasish.handlebrowserWindows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		// Finding the set of browser windows

		Set<String> windowsId = driver.getWindowHandles();

		/*
		 * List<String> windowsList=new ArrayList<String>(windowsId);
		 * 
		 * String parentWindow=windowsList.get(0); String
		 * childWindow=windowsList.get(1);
		 * 
		 * driver.switchTo().window(childWindow);
		 * 
		 * driver.findElement(By.
		 * xpath("(//button[normalize-space()='Book a Free Demo'])[2]")).click();
		 * 
		 * driver.switchTo().window(parentWindow);
		 * driver.findElement(By.xpath("//input[@placeholder='Username']")).
		 * sendKeys("Kuna Babu");
		 */

		for (String winid : windowsId) {

			String title = driver.switchTo().window(winid).getTitle();

			if (title.equals("OrangeHRM")) {

				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");

			} else if (title
					.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")) {
				driver.findElement(By.xpath("(//button[normalize-space()='Book a Free Demo'])[2]")).click();
			}
		}
		driver.quit();
	}

}
