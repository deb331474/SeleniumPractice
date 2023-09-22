package in.debasish.seleniumNotes;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jQueryTooltip {

    WebDriver driver=new ChromeDriver();

    @BeforeTest
    void setup() throws InterruptedException {
    	driver.get("https://jqueryui.com/tooltip/");
        driver.manage().window().maximize();
    }

    @Test
    void AccessApplication() throws InterruptedException {
    	
        Actions actions = new Actions(driver);
        
        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
        
        
       WebElement age= driver.findElement(By.xpath("//input[@id='age']"));
     
        actions.moveToElement(age).build().perform();
        
        String toolTipText = age.getAttribute("title");
        System.out.println("Tooltip Text: " + toolTipText);
    }

    @AfterTest
    void closeApp() {
        driver.quit();
    }
}
