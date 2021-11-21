package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleChromeTest {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cri_c\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com/");
	    System.out.println("google chrome configurado satisfactoriamente");
	     
     
	    //Close the Browser.
	    driver.quit();
	}
}
