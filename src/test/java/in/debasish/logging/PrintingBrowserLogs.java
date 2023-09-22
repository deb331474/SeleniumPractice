package in.debasish.logging;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintingBrowserLogs {

	public static void main(String[] args) {
		
		System.setProperty("C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe", "webdriver.chrome.driver");
		
		ChromeOptions options=new ChromeOptions();
		
		options.getCapability("\"goog:loggingPrefs\", \"{\\\"browser\\\": \\\"ALL\\\"}\"");
		
		WebDriver driver=new ChromeDriver(options);
		
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
		
		for(LogEntry log:logEntries) {
			System.out.println(log.getLevel()+ ":" +log.getMessage());
			
		}
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		
		
		

	}

}
