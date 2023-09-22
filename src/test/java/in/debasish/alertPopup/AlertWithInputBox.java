package in.debasish.alertPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.time.Duration.*;

public class AlertWithInputBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(50));

		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert alertWindow = mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alertWindow.getText());
		
		alertWindow.sendKeys("Debasish Kumar Pruseth");
		
		Thread.sleep(5000);
		
		alertWindow.accept();
		
		//doing validation on the given input inside the dialog
		
		String exp_name="You entered: Debasish Kumar Pruseth";
		
		String act_name= driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		if(act_name.equals(exp_name)) {
			System.out.println("Test case passed by the dkp");
		}
		else
		{
			System.out.println("Test case failed by the dkp");
		}
		
		driver.close();
		
	}

}
