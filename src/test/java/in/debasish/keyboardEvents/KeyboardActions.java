package in.debasish.keyboardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardActions {

    public static void main(String[] args) {

        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://text-compare.com/");

        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME TO AUTOMATION");

        Actions act=new Actions(driver);
        
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
    }
}
