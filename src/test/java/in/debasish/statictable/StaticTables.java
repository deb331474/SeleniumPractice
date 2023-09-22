package in.debasish.statictable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTables {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demo.opencart.com/admin/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		if (driver.findElement(By.xpath("//div[@class='modal-content']")).isDisplayed()) {

			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}

		int totalRows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();

		System.out.println("Total number of rows->>> " + totalRows);

		int totalCols = driver.findElements(By.xpath("//table[@class='table']//td")).size();

		System.out.println("Total number of columns->>> " + totalCols);
		
		//Reading specific data from specific row and column
		
		String colValue=driver.findElement(By.xpath("//table[@class='table']//tr[4]//td[3]")).getText();
		
		System.out.println("The value of particular row and column is "+colValue);
		
		//Reading data from all rows and columns
		
		for(int r=2;r<=totalRows;r++) {
			
			for(int c=1;c<=totalCols;c++) {
				
				String allData=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td["+c+"]")).getText();
				
				System.out.print(allData+ "\t");
				
			}
			System.out.println();
		}
	}

}
