package in.debasish.brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+allLinks.size());
		
		int brokenlinks=0;
		
		for(WebElement sp:allLinks) {
			String href=sp.getAttribute("href");
			
			if(href==null && href.isEmpty()) {
				System.out.println("Href value is empty");
				continue;
			}
			URL linkUrl=new URL(href);
			
			HttpURLConnection connection=(HttpURLConnection) linkUrl.openConnection();
			
			connection.connect();
			
			if(connection.getResponseCode()>=400) {
				
				System.out.println("The link is broken "+linkUrl);
				brokenlinks++;
				
			}
			else {
				System.out.println("The link is valid "+linkUrl);
			}
			
			System.out.println(brokenlinks);
			
		}

	}

}
