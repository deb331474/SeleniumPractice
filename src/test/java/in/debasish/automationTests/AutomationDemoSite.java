package in.debasish.automationTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemoSite {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Debasish");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Pruseth");

		Thread.sleep(5000);

		driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-untouched.ng-valid[rows='3']"))
				.sendKeys("ABSBHJHHJK");

		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("Pruseth@gmail.com");

		Actions actions = new Actions(driver);

		actions.moveToElement(email).perform();

		WebElement tooltipdiv = driver
				.findElement(By.xpath("//following-sibling::div[contains(@class, 'tooltptext')]"));

		String tooltip = tooltipdiv.getText();
		System.out.println(tooltip);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("99358741269");

		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();

		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();

		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();

		Thread.sleep(5000);

		WebElement multidropdown=driver.findElement(By.xpath("//div[@id='msdd']"));
		
		WebElement option1 = driver.findElement(By.xpath("//a[normalize-space()='Arabic']"));
		Thread.sleep(5000);
		WebElement option2 = driver.findElement(By.xpath("//a[normalize-space()='Latvian']"));
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", option1);
		
		JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", option2);

		WebElement dropdownSkill = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		jsExecutor.executeScript("arguments[0].click();", dropdownSkill);

		Select drp = new Select(dropdownSkill);
		
		drp.selectByValue("Adobe Photoshop");
		
		driver.close();

	}

}
