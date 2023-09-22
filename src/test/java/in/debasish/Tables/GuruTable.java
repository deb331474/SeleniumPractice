package in.debasish.Tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.time.Duration.*;

public class GuruTable {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	void AccessPage() {

		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}

	@Test
	void paginationNavigation() throws InterruptedException {

		List<WebElement> allData = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr/td"));
		
		for(WebElement ws:allData) {
			System.out.println(ws.getText());
			Thread.sleep(3000);
		}

		int totalRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();

		int totalCols = driver.findElements(By.xpath("//table[@class='dataTable']//tr//td")).size();

		for (int r = 1; r <= totalRows; r++) {
			for (int c = 0; c <= totalCols; c++) {

				String company = driver.findElement(By.xpath("//table[@class='dataTable']//tr[" + r + "]//td"))
						.getText();
				company.trim();
				String currentPrice = driver.findElement(By.xpath("//table[@class='dataTable']//tr[" + r + "]//td[4]"))
						.getText();
				currentPrice.trim();

				Thread.sleep(3000);

				if (company.equals("UCO Bank")) {

					List<WebElement> rowCells = driver
							.findElements(By.xpath("//table[@class='dataTable']//tr[" + r + "]//td"));

					for (WebElement cell : rowCells) {
						System.out.println(cell.getText());
					}
					System.out.println();
					break;
				}

			}

		}
	}

	@AfterTest
	void closeApp() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
