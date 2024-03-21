package in.debasish.shadowDom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PolymerShopshadowDom1 {
	
	public static void main(String[] args) {
		
		    WebDriver driver = new ChromeDriver();
	        driver.get("https://shop.polymer-project.org/");
	        
	        driver.manage().window().maximize();
	        
	        JavascriptExecutor js=(JavascriptExecutor) driver;
		
	        WebElement shopNowLink=(WebElement) js.executeScript("return document.querySelector(\"body > shop-app\").shadowRoot.querySelector(\"iron-pages > shop-home\").shadowRoot.querySelector(\"div:nth-child(2) > shop-button > a\")");
	        
	        String shopNowlnk="arguments[0].click()";
	        
	        js.executeScript(shopNowlnk, shopNowLink);
	        
	        
	        
	        
	        
	        
	        
	        
	}

}
