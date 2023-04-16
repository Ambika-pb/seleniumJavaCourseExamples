package module3_windowshandeling;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		/*
TC-7	After Switching Get the Title of Page 
TC-8	Switch from 1sr   Window to 0th  Window
TC-9    After Switching Get the Title of Page 
TC-10	Close all windows of Browser */
		//TC-1 LANCH EDGE BROWSER
	//TC-1	Launch Chrome Browser	  
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 WebDriver driver = new ChromeDriver(options);
    //TC-2Go to Test URL  https://demoqa.com/browser-windows
			 driver.get("https://demoqa.com/browser-windows");
	//TC-3	Maximize the Browser Window
			 driver.manage().window().minimize();
    //TC-4	Get the Title of Page
			 driver.manage().window().maximize();
	//TC-5	Click on knowmore Link Text 
			 driver.findElement(By.id("tabButton")).click();
 WebDriverWait wait = new WebDriverWait(driver, null);
			 @SuppressWarnings("unused")
			WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tabButton")));
			 System.out.println("before currenturl");
			 String crturl=driver.getCurrentUrl();
			 System.out.println("crturl");
			 
			 // TC-6	Switch from 0th   Window to 1st   Window
			 ArrayList<String>tabs=new ArrayList<String>();
	          System.out.println("before tab");
			 driver.switchTo().window(tabs.get(0));
			 Thread.sleep(3000);
			 driver.close();
			 
			 
		
			
	}

}
