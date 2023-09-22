package in.debasish.seleniumNotes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllCheckBoxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");

		driver.findElement(By.xpath("//input[@class='textField'][ @id = 'username']")).sendKeys("Admin");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");

		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

		List<WebElement> allChkBoxes = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(("//td[@class='selection']"))));

		List<WebElement> allChkBoxes1 = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(("//td[@class='selection']"))));
		
		for (WebElement ws : allChkBoxes) {
			try {
			 ws.click();
			 Thread.sleep(2000);
			}
			catch (ElementNotInteractableException e) {
				for(WebElement sd:allChkBoxes1)
				 sd.click();
			}
		}
		
		driver.close();

	}

}
