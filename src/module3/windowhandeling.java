package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandeling {

	public static void main(String[] args) throws InterruptedException {
/*		Assignment-1 
		TC-5	Click on knowmore Link Text 
		TC-6	Switch from 0th   Window to 1st   Window
		TC-7	After Switching Get the Title of Page 
		TC-8	Switch from 1sr   Window to 0th  Window
		TC-9    After Switching Get the Title of Page 
		TC-10	Close all windows of Browser */
//TC-1 Launch Chrome Browser
		System.setProperty("weddriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Thread.sleep(3000);
//TC-2 Go to Test URL  https://demoqa.com/browser-windows
		driver.get("https://www.facebook.com/");
//TC-3 manage the browser window to be minimize
	     driver.manage().window().minimize();
// TC-4	Get the Title of Page
	   String title =  driver.getTitle();
	   System.out.println(title);
 //  TC-5	Click on knowmore Link Text 
	   driver.findElement(By.id("tabButton")).click();
	   
		//driver.close();
	}

}
