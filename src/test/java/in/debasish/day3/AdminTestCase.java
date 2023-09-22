package in.debasish.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminTestCase {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);

		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));

		userName.sendKeys("Admin");

		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));

		passWord.sendKeys("admin123");

		Thread.sleep(4000);

		WebElement clickLogin = driver
				.findElement(By.xpath("//button[@class='orangehrm-login-button' or @type='submit']"));

		clickLogin.click();

		Thread.sleep(4000);

		String act_label = "";

		try {

			act_label = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		}

		catch (NoSuchElementException e) {

		}

		String expected_label = "Dashboard";

		Thread.sleep(4000);

		if (expected_label.equals(act_label)) {

			System.out.println("Logged In successfully");
		} else {
			System.out.println("Login failed");
		}

		Thread.sleep(4000);

		WebElement adminLink = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span"));

		adminLink.click();

		Thread.sleep(4000);

		WebElement clickOnUsername = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));

		clickOnUsername.sendKeys("admin");
		
		Thread.sleep(4000);

		System.out.println("Admin is not snabled");
		
		WebElement dropdown = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div"));
		
		dropdown.click();
		
		Thread.sleep(3000);
		
		WebElement item1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
		
		item1.click();
		
		System.out.println("Selected item");
		
		Thread.sleep(3000);
		
		WebElement searchButton=driver.findElement(By.xpath("//button[@type='submit']"));
		
		searchButton.click();
		
		Thread.sleep(3000);
		
		WebElement recordsFound=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));
		
		String results = recordsFound.getText();
		
		System.out.println(results);
		
		String targetDate="2023-01-01";
		
		String[] dateParts=targetDate.split("-");
		
		String targetYear=dateParts[0];
		String targetMonth=dateParts[1];
		String targetdate=dateParts[2];
		
		String datepickerLocator=String.format("//td[@data-year='%s' and @data-month='%s']/a[text]()='%s']",targetYear,targetMonth,targetDate);
		
		WebElement datePicker1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", datePicker1);
		
		Thread.sleep(3000);
		
		datePicker1.click();
		
		driver.close();

	}

}
