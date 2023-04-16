package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) {
		
		//TC-1 LANCH EDGE BROWSER
	  
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(options);
		
		// go to test url
			driver.get("https://www.facebook.com/");
		// click create new account
			driver.findElement(By.linkText("Create new account")).click();
		//TC-3 Click on DataPolicy Linktext
			 System.out.println("BEFORE id");
			driver.findElement(By.linkText("Privacy Policy")).click();
			 System.out.println("AFTER id");
			 WebDriverWait wait = new WebDriverWait(driver, null);
			 @SuppressWarnings("unused")
			WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Privacy Policy")));
		//	driver.close();
	}

}
