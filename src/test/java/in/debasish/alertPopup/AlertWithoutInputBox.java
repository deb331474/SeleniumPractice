package in.debasish.alertPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWithoutInputBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		
		Thread.sleep(6000);
		
		Alert alertWindow = mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alertWindow.getText());
		
		//alertWindow.accept();
		
		alertWindow.dismiss();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
