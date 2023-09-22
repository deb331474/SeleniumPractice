package in.debasish.Tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PluralSight {

	WebDriver driver = new ChromeDriver();

	@Test(priority = 1)
	void Login() {

		driver.manage().timeouts().implicitlyWait(Duration.ZERO);

		driver.get("https://www.pluralsight.com/resources/blog");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));

		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	void paginationNavigation() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		WebElement next_button = driver.findElement(
				By.xpath("//div[@class='filter-search-cards-pagination-section']/a[contains(@class,'next')]"));

		String next_buttonClass = driver
				.findElement(
						By.xpath("//div[@class='filter-search-cards-pagination-section']/a[contains(@class,'next')]"))
				.getAttribute("class");
		int allpages = driver.findElements(By.xpath("//div[@class='filter-search-cards-pagination-section']/a/span"))
				.size();
		
		System.out.println(allpages);

		while (true) {
			{
				if(next_buttonClass.contains("disabled")) {
					break;
				}
			
				wait.until(ExpectedConditions.presenceOfElementLocated(
					By.xpath("//div[@class='filter-search-cards-pagination-section']/a[contains(@class,'next')]"))).click();

				WebElement activePage = driver
						.findElement(By.xpath("//a[contains(@class,'current')]//span"));
				System.out.println(activePage.getText());
		        Thread.sleep(6000);
				
			}
		}
	}

	@Test(priority = 3)
	void logOut() {
		driver.close();
	}

}
