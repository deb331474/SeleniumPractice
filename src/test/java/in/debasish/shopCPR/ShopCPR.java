package in.debasish.shopCPR;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.*;
import java.util.List;

import static java.time.Duration.ofSeconds;

public class ShopCPR {

	WebDriver driver;

	@BeforeClass
	void setUp() {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(ofSeconds(20));

		driver.get("https://intelligo-stg.heartblr.org/catalog?page=1");

		driver.manage().timeouts().pageLoadTimeout(ofSeconds(20));

		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	void getTotalPages() throws InterruptedException {

		WebElement totalResultsElement = driver.findElement(By.xpath("(//p[@role='alert'])[1]"));

		String totalResultsText = totalResultsElement.getText();

		// Extract the numeric part from the text (e.g., "Showing Results 1-10 of 268"
		// => 268)
		int totalResults = Integer.parseInt(totalResultsText.split("of")[1].trim());

		WebElement paginationDropdown = driver.findElement(By.xpath("(//div[@class='control ']/select)[1]"));

		WebElement itemsPerPageDropdown = driver.findElement(By.xpath("(//div[@class='control ']/select)[1]/option"));
		int itemsPerPage = Integer.parseInt(itemsPerPageDropdown.getAttribute("value"));
		int total_pages = (int) Math.ceil((double) totalResults / itemsPerPage);

		System.out.println(total_pages);

		for (int i = 1; i <= total_pages; i++) {

			WebElement CurrentPage = driver.findElement(By.xpath("(//li[contains(@class,'current')])[1]"));
			System.out.println(CurrentPage.getText());
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement clickable = wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("(//li[contains(@class,'page-item')]/a/span[text()='" + (i + 1) + "'])[1]")));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", clickable);
			Thread.sleep(5000);
			
			List<WebElement> contents=driver.findElements(By.xpath("//div[@data-container='product-list']"));
			
			for(WebElement ws:contents) {
				System.out.println(ws.getText());
			}

		}

	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}

}
