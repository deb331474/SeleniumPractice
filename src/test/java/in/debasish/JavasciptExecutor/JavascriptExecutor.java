package in.debasish.JavasciptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.edge.EdgeDriver;

public class JavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.selenium.dev/downloads/");

		org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;

		for (int i = 0; i < 10; i++) {
			js.executeScript("window.scrollBy(0, 1000)");

			Thread.sleep(3000);

		}

		for (int i = 1; i < 10; i++) {
			js.executeScript("window.scrollBy(0, -1000)");
			Thread.sleep(3000);
		}
	}
}
