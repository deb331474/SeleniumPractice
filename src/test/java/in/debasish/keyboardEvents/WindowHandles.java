package in.debasish.keyboardEvents;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import in.debasish.JavasciptExecutor.JavascriptExecutor;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window handle - " + parentWindowHandle + driver.getTitle());

		driver.findElement(By.xpath("//button[normalize-space()='Open New Window']")).click();

		Set<String> windowhandles = driver.getWindowHandles();

		for (String ws : windowhandles) {
			if (!ws.equals(parentWindowHandle)) {
				driver.switchTo().window(ws);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("Debasish");
				Thread.sleep(3000);
				driver.close();
				Thread.sleep(2000);
			}
		}
		
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("HYR TUtorials");

		driver.close();
	}

}
