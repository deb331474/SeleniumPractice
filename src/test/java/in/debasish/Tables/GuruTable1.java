package in.debasish.Tables;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GuruTable1 {
	
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	void AccessPage() {

		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	}
		
	
	@Test
	void tableNavigation() throws InterruptedException, ParseException {

		String max;
		double m=0,r=0;
		
		int totalRows = driver.findElements(By.xpath("//table[@class='dataTable']//tr")).size();
		
		for(int i=1;i<=totalRows;i++) {

			Thread.sleep(5000);

			max=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td[4]")).getText();


			try {
				m = Double.parseDouble(max);
			} catch (NumberFormatException e) {
				// Skip non-numeric cells
				continue;
			}
            

            
            if(m>r) {
            	r=m;
            }
		}
		
		System.out.println("Maximum Current Price is: "+r);
	}

	@AfterTest
	void closeApp() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
