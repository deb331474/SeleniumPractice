package in.debasish.shadowDom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaveenShadowDoMAutomation {
	
	

	    public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://teststore.automationtesting.co.uk/");
	        
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("(//span[normalize-space()='Sign in'])[1]")).click();
	        
	        driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys("prusethdebasish@gmail.com");
	        driver.findElement(By.cssSelector(".js-visible-password")).sendKeys("debudon@211");
	        driver.findElement(By.cssSelector("#submit-login")).click();
	        
	        Thread.sleep(5000);
	        
	        driver.findElement(By.cssSelector(".dropdown-item[href='http://teststore.automationtesting.co.uk/9-art']")).click();
	        

	        // Locate the slider element
	        WebElement slider = driver.findElement(By.cssSelector(".ui-slider-range.ui-widget-header.ui-corner-all"));

	        // Use Actions class to move the slider handle
	        Actions actions = new Actions(driver);

	        // Assuming the slider has a range from 0 to 100
	        int sliderRange = 100;

	        // Move the slider handle to a specific percentage (e.g., 50%)
	        moveSlider(actions, slider, 0.5);

	        
	        Thread.sleep(5000);
	        // Close the browser
	        driver.quit();
	    }

	    private static void moveSlider(Actions actions, WebElement slider, double percentage) {
	        // Calculate the offset based on the slider range and desired percentage
	        int xOffset = (int) (slider.getSize().getWidth() * percentage);

	        // Get the leftmost position of the slider
	        int initialX = slider.getLocation().getX();

	        // Perform the slider movement
	        actions.moveToElement(slider).clickAndHold().moveByOffset(xOffset, 0).release().build().perform();
	    }
	}

