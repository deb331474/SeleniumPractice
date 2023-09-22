package in.debasish.automationTests;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HugeDomains {

	WebDriver driver;
	ChromeOptions opt=new ChromeOptions();

	
	
	@BeforeTest
	void AccessPage() {

		opt.addArguments("--disable-notifications");
		//opt.addArguments("​--disable-geolocation​");
		opt.addArguments("--ignore-certificate-errors");
		driver=new ChromeDriver(opt);
		driver.get("https://www.hugedomains.com/domain_profile.cfm?d=examplestore.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='hdv3HeaderSearchTextID']")).sendKeys("smartphone");
		driver.findElement(By.xpath("//button[@id='hdv3HeaderSearchButtonID']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		
	}
	
	@Test(priority = 2)
	void presenceOfPagination() throws InterruptedException {
		
		List <WebElement> pagination=driver.findElements(By.xpath("//div[@class='d-flex search-pagination search-pagination-desctop']"));
		
		Assert.assertNotNull(pagination, "Pagination not found");
		Thread.sleep(5000);
	}
	
	@Test(priority = 3)
	void navigatingPagination() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		String totalPages=driver.findElement(By.xpath("(//div[@class='d-flex jc-between search-pages']//div)[2]")).getText();
		int total_pages=Integer.parseInt(totalPages.substring(totalPages.lastIndexOf("")-1));
		
		WebElement nextButton =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='next-link link blueLink']")));
		
		while(!nextButton.getAttribute("class").contains("next")) {
		
			break;
		}
		for(int i=1;i<=total_pages;i++) {

			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].scrollIntoView();", nextButton);
			nextButton.click();
			WebElement ActivePage=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[normalize-space()='Page "+i+" of "+total_pages+"']")));
			ActivePage.getText();
			System.out.println(ActivePage);
		
			}
		
		}
	
	@AfterTest
	void closeApp() {
		driver.quit();
	}

}
