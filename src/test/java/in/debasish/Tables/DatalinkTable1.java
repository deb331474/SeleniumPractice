package in.debasish.Tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatalinkTable1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ZERO);

		driver.get("https://datatables.net/examples/basic_init/multiple_tables.html");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));

		driver.manage().window().maximize();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='DataTables_Table_1']//tbody/tr"));

		//List<WebElement> allData = driver.findElements(By.xpath("//table[@id='DataTables_Table_1']//tbody//tr//td"));
		/*
		 * for(WebElement sd:allData) {
		 * 
		 * System.out.println(" "+sd.getText()+" "); }
		 */
		WebElement next_button = driver.findElement(By.xpath("//a[@id='DataTables_Table_1_next']"));

		String next_buttonclass = driver.findElement(By.xpath("//a[@id='DataTables_Table_1_next']"))
				.getAttribute("class");

		Thread.sleep(5000);

		
		while (!next_buttonclass.contains("disabled")) {
			
			boolean found = false;
			for (WebElement wb : rows) {

				List<WebElement> cols = wb.findElements(By.xpath(".//td"));

				for (WebElement ws : cols) {

					String name = ws.getText();

					if (name.equals("Suki Burks")) {
						Thread.sleep(5000);
						System.out.println(wb.getText());
						found = true;
						break;
					}
				
				}

			}
			
			next_button.click();
		}
	}
}
