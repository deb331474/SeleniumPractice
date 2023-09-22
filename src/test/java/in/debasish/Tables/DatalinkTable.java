package in.debasish.Tables;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatalinkTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ZERO);

		driver.get("https://datatables.net/examples/basic_init/multiple_tables.html");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));

		driver.manage().window().maximize();

		// printing only the table headers

		List<WebElement> table_headers = driver.findElements(By.xpath("//table[@id='DataTables_Table_1']/thead/tr/th"));
		for (WebElement wb : table_headers) {
			System.out.print(" " + wb.getText() + " ");
		}

		// printing the no of rows and columns

		int total_rows = driver.findElements(By.xpath("//table[@id='DataTables_Table_1']//tbody/tr")).size();
		int total_column = driver.findElements(By.xpath("//table[@id='DataTables_Table_1']//tbody/tr//td")).size();

		System.out.println(total_rows);
		System.out.println(total_column);

		// navigating through the pagination

		// approach one

		List<WebElement> pagination_section = driver.findElements(By.id("DataTables_Table_1_paginate"));

		WebElement next_button = driver.findElement(By.xpath("//a[@id='DataTables_Table_1_next']"));

		String next_buttonclass = driver.findElement(By.xpath("//a[@id='DataTables_Table_1_next']"))
				.getAttribute("class");

		while (!next_buttonclass.contains("disabled")) {
			System.out.println("===========");

			List<WebElement> names_all = driver
					.findElements(By.xpath("//table[@id='DataTables_Table_1']//tbody//tr//td[1]"));

			Thread.sleep(5000);

			List<WebElement> allData = driver
					.findElements(By.xpath("//table[@id='DataTables_Table_1']//tbody//tr//td"));

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

			List<WebElement> total_Rows = wait.until(ExpectedConditions
					.visibilityOfAllElementsLocatedBy((By.xpath("//table[@id='DataTables_Table_1']//tbody//tr"))));

			for (WebElement wt : total_Rows) {
				List<WebElement> cells = wt.findElements(By.xpath("//table[@id='DataTables_Table_1']//tbody//tr//td"));
				StringBuilder rowDetails = new StringBuilder();
				for (WebElement cell : cells) {

					rowDetails.append(cell.getText()).append(" | ");
					 if (rowDetails.toString().contains("Jena Gaines")) {
					        System.out.print("---------------- Row Details ------------------------");
					        System.out.println(rowDetails.toString());
					        break;
					    }
				}
				next_button.click();
			}
		}

		driver.quit();

	}

}
