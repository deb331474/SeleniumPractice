package in.debasish.datepicker;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	
WebDriver driver;
	
	@BeforeClass
	void setUp() {
		
		Map<String,Object> prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_settings_values.notifications",2);
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Debasish\\OneDrive\\Desktop\\Debasish-Chrome.exe");
	    ChromeOptions options  = new ChromeOptions();
	    options.setExperimentalOption("prefs",prefs);
	    //options.setExperimentalOption("excludeSwitches",Arrays.asList("--enable-popup-blocking"));
	    options.addArguments("--disable-notifications");
	    //options.addExtensions(new File("C:\\Users\\Debasish\\eclipse-workspace\\SeleniumTesting\\Extensions\\Adblocker.crx"));
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(options);
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
	}
	
	@Test
	void datePicker() throws InterruptedException {
		
		try {
			
			driver.findElement(By.xpath("//input[@id='departure']")).click();
			Thread.sleep(2000);
			
			Date cuurentdate=new Date();
			SimpleDateFormat formatter=new SimpleDateFormat("dd-mmm-yy");
			String date=formatter.format(cuurentdate);
			String[] splitter=date.split("-");
			String monthyear=splitter[1];
			String day=splitter[0];
			System.out.println(monthyear);
            System.out.println(day);
            selectDate("Oct","23");
            Thread.sleep(3000);
			
		}
		
		catch (Exception e) {
			e.getMessage();
		}
}
	public void selectDate(String targetMonthyear,String targetDay) {
		while(true) {
			List<WebElement> allmonYear=driver.findElements(By.xpath("//div[@class='DayPicker-Months']"));
			
			for(WebElement ws:allmonYear) {
				String currentmoYear=ws.getText();
				System.out.println(currentmoYear);
				
				if(currentmoYear.equals(targetMonthyear)) {
					break;
				}
				else {
					driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				}
			}
		}
	}
	
	/*
	 * @AfterClass void logOut() { driver.close(); }
	 */
}
