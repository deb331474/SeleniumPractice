package in.debasish.datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusDatepicker {
	
WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-popup-blocking");
		opt.addArguments("user-data-dir=C:\\Users\\Debasish\\OneDrive\\Desktop\\Debasish-Chrome.exe");
		
		
		driver=new ChromeDriver(opt);
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	}
	
	@Test
	void datePicker() throws InterruptedException {
		
		String year="2028";
		String month="Oct";
		String date="25";
		
		driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).click();
		
		Thread.sleep(5000);
		while(true){
			
			String monthYear=driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD']/following-sibling::div")).getText();
			String[] lines=monthYear.split("\n");
			String[] parts=lines[0].split(" ");
			String mon=parts[0];
			System.out.println(mon);
			String yr=parts[1];
			System.out.println(yr);
			
			
		if(month.equals(mon) && year.equals(yr)) {
			break;
		}
		else
			driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/child::div[3]")).click();		
		}
		
		List<WebElement> alldates=driver.findElements(By.xpath("//span[contains(@class, 'DayTiles')]/div"));
		
		for(WebElement ws:alldates) {
			String dt=ws.getText();
			
			if(dt.equals(date)) {
				ws.click();
				System.out.println(dt);
				break;
			}
		}

}
	
	@AfterClass
	void logOut() {
	driver.close();
	}

}
