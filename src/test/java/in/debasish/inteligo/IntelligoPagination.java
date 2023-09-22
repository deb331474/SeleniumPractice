package in.debasish.inteligo;

import static java.time.Duration.ofSeconds;

import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IntelligoPagination {
	
	WebDriver driver;

	@BeforeClass
	void setUp() {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(ofSeconds(20));

		driver.get("https://intelligo-stg.heartblr.org/catalog?page=1");

		driver.manage().timeouts().pageLoadTimeout(ofSeconds(20));

		driver.manage().window().maximize();

	}
	
	@Test
	void paginationNavigation() throws InterruptedException,SocketException {
		
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	WebElement nextButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-label='Next']/span")));
	String nextButton_class=nextButton.getAttribute("class");
	System.out.println(nextButton_class);
	
	while(true) {
		if(nextButton_class.contains("page-item disabled")) {
			break;
		}
		else 
		{
			try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", nextButton);
		js.executeScript("arguments[0].click();", nextButton);
	}
			catch (StaleElementReferenceException e) {
				WebElement nextButton1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-label='Next']/span")));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", nextButton1);
				js.executeScript("arguments[0].click();", nextButton1);
				Thread.sleep(10000);
			}
			catch (NoSuchElementException e) {
				
				WebElement nextButton1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-label='Next']/span")));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", nextButton1);
				js.executeScript("arguments[0].click();", nextButton1);
				Thread.sleep(10000);
			}
	}
	}
	
	}
	@AfterClass
	void tearDown() {
		driver.close();
	}


}
