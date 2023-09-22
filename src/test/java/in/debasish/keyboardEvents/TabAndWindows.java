package in.debasish.keyboardEvents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TabAndWindows {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		

	}

}
