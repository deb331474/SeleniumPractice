package in.debasish.seleniumNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FileDownloadPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		FirefoxProfile pf=new FirefoxProfile();
		
		String key="browser.helperApps.neverAsk.saveToDisk";
		
		String value = "application/zip";
		
		pf.setPreference(key, value);
		
		pf.setPreference("browser.download.folderList", 2);
		
		pf.setPreference("browser.download.dir", "D:\\Debasish\\Automation");
		
		FirefoxOptions fx=new FirefoxOptions((Capabilities) pf);
		
	   driver=new FirefoxDriver();
	   
	   driver.get("http://www.seleniumhq.org/download/");

	   driver.findElement(By.xpath("//a[contains(@href,'selenium-java-4.11.0.zip')]")).click();

	   Thread.sleep(3000);
		
		

	}

}
