package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class locators {
	//package locators;
	
	
	public static void main(String[] args) throws InterruptedException  {
			//TC-1Launch Browser
			
		System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
			//TC-2get test url
					driver.get("https://en-gb.facebook.com/");
			//TC-3 create new account link
					driver.findElement(By.linkText("Create new account")).click();
					Thread.sleep(4000);
		  //TC-4 send the first name 
				driver.findElement(By.name("firstname")).sendKeys("Bramarambika");
					driver.close();
					
						}
}
	

