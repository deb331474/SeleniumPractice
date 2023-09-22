package in.debasish.statictable;

import java.io.File;
import java.net.SocketException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTable {

	public static void main(String[] args) throws InterruptedException, SocketException {

		WebDriver driver = new ChromeDriver();
		//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		if (driver.findElement(By.xpath("//div[@class='modal-content']")).isDisplayed()) {

			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}

		driver.findElement(By.xpath("(//li[@id='menu-customer']//a[normalize-space()='Customers'])[1]")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();

		Thread.sleep(3000);

		String text = driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();

		System.out.println(text);

		int totalPages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));

		System.out.println(totalPages);

		for (int p = 1; p <= 6; p++) {

			if (totalPages > 1) {

				WebElement active_Page =driver.findElement(By.xpath("//ul[@class='pagination']//li//*[normalize-space()="+p+"]"));
				System.out.println(" Active Page : " + active_Page.getText());
				JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
				jsExecutor.executeScript("arguments[0].scrollIntoView();", active_Page);
				//active_Page.click();
				Thread.sleep(5000);
			}

			int noOfrows = driver
					.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			int noOfColumns = driver
					.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//td")).size();
			System.out.println(" Total No Of Rows in active Page : " + noOfrows);
			System.out.println(" Total No Of Coulmns in active Page : " + noOfColumns);

			for (int r = 1; r <= noOfrows; r++) {

				
				 for (int c = 2; c < noOfColumns; c++) {
				  
				  String eMail = driver.findElement(By.xpath(
				  "//table[@class='table table-bordered table-hover']//tbody//tr[\"+r+\"]//td[3]"
				  )) .getText();
	
				String customerName = driver
						.findElement(By.xpath(
								"//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]"))
						.getText();
				String customerEmail = driver
						.findElement(By.xpath(
								"//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]"))
						.getText();
				String status = driver
						.findElement(By.xpath(
								"//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]"))
						.getText();
				String customerGroup = driver
						.findElement(By.xpath(
								"//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]"))
						.getText();

				System.out.println(customerName + " " + customerEmail + " " + status + "  " + customerGroup);
				 }
		}

		driver.close();
		}
	}
}
