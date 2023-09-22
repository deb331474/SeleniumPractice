package in.debasish.brokenlinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:" + allLinks.size());

		//allLinks.stream().map(WebElement::getText).forEach(System.out::println);
		for (WebElement as : allLinks) {

			String hrefAt = as.getAttribute("href");

			 if (hrefAt != null && !hrefAt.isEmpty() && hrefAt.startsWith("http")) {
				try {
					HttpURLConnection connection = (HttpURLConnection) new URL(hrefAt).openConnection();

					connection.setRequestMethod("HEAD");
					int responsecode = connection.getResponseCode();
					if (responsecode >= 400) {
						System.out.println("Broken Link" + hrefAt);
					} else {
						System.out.println("Valid Link" + hrefAt);
					}
				} catch (Exception e) {
					System.out.println("Error while checking the URL" + hrefAt);
				}
			}
		}

		driver.quit();

	}

}
