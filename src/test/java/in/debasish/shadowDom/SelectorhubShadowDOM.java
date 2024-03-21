package in.debasish.shadowDom;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelectorhubShadowDOM {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
        
        driver.manage().window().maximize();
        
        driver.switchTo().frame("pact");
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        
        WebElement element=(WebElement) js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
        
        WebElement launchTime=(WebElement) js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
        
        String jse1="arguments[0].setAttribute('value','Mutton Curry')";
        
        String jse="arguments[0].setAttribute('value','Green Masala Tea')";
        
        js.executeScript(jse, element);
        
        js.executeScript(jse1, launchTime);
        
        Thread.sleep(5000);
        driver.close();
        
	}

}
