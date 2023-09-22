package in.debasish;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement signInLink = driver.findElement(By.id("nav-link-accountList"));
		
		signInLink.click();
		
		WebElement signInputField = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		
		signInputField.sendKeys("prusethdebasish@gmail.com");
		
		WebElement clickOnContinuebutton = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		
		clickOnContinuebutton.click();
		
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		
		passwordField.sendKeys("debudon@211");
		
		WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
		
		signInButton.click();
		
		Thread.sleep(6000);
		
		/*
		 * WebElement clickOnLink =
		 * driver.findElement(By.xpath("//*[@id=\"browsingHistoryLabel\"]/span"));
		 * 
		 * clickOnLink.click();
		 */
		
		//To verify the page title
		
		/*
		 * String actualTitle = driver.getTitle();
		 * 
		 * String givenTitle = "Online Shopping site in India:";
		 * 
		 * if(actualTitle==givenTitle) { System.out.println("Page title is correct"); }
		 * else { System.out.println("Page title is not correct"); }
		 */
		
		//Label Validation after login--------
		
		String act_label_text = "";
		
		try {
			
	        act_label_text = driver.findElement(By.className("a-truncate-cut")).getText();
		}
		catch (NoSuchElementException e) {
					}
		
		
		String exp_label = "Pick up where you left off";
		
		
		if(act_label_text.equals(exp_label)) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Login Failed");
		}
		
		Thread.sleep(4000);
		
		//1-if we enter any invalid credentials for the negative scenario, then we will get NOSuchElementException because of subsequent control elements not getting that particular elements
		//2-To avoid this we have to use try catch block
		//3-variables declared inside the try block is not accessible outside of it
		//4-whenever we declare the string variables we should first initialise it 
		//5-if it is declared as null then we cannot perform other string operation on it
		//6-in order ro perform all string operations we have to declare it as empty
		
		
		driver.close();

	}

}