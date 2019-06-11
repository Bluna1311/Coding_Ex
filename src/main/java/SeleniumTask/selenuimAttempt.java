package SeleniumTask;



import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import driverUtiities.DriverUtilities;

public class selenuimAttempt {

	public static void main(String[] args) {
		
		//DriverUtilities driver = new DriverUtilities();
		System.setProperty("webdriver.chrome.driver","C:/Users/brian.luna/JavaEclipseWorkspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com");
	    System.out.println("Google is now opened");
	   
	   List<WebElement> links= driver.findElements(By.tagName("a"));
	   
	   for(WebElement element:links)
		   System.out.println(element.getAttribute("href"));
	   // this will print out all the links
	   // finally, for the number of links
	   
	  System.out.println(links.size());
		


	}

}
