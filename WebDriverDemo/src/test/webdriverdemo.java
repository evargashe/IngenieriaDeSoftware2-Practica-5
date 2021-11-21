package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverdemo {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\cri_c\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	     driver.get("http://www.calculator.net/");
	  // Click on Math Calculators
	      driver.findElement(By.xpath(".//*[@id = 'contentout']/table/tbody//tr/td/table/tbody/tr[2]/td[2]/div/div/span[1]")).click();
	      
	      
	      
	      driver.findElement(By.xpath(".//*[@id = 'contentout']/table/tbody//tr/td/table/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();

	      
	      
	      driver.findElement(By.xpath(".//*[@id = 'contentout']/table/tbody//tr/td/table/tbody/tr[2]/td[2]/div/div/span[3]")).click();



	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id = 'contentout']/table/tbody/tr/td/table/tbody/tr/td/div/div[2]")).getText();

	      
	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);
	     
     
	      //Close the Browser.
	      //driver.quit();
	}
}
