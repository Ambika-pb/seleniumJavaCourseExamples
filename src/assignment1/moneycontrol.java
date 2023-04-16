package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class moneycontrol {

	public static void main(String[] args) throws InterruptedException {
		//TC-1 LANCH EDGE BROWSER
	     System.setProperty("weddriver.edge.driver", "C:\\msedgedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(options);
		
		
		//TC-2 GET THE TEST URL
     
		driver.get("https://www.moneycontrol.com");
		Thread.sleep(4000);
	    driver.findElement(By.linkText("Forum")).click();
	    WebDriverWait wait = new WebDriverWait(driver, null);
		 @SuppressWarnings("unused")
		WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Forum")));
		
		driver.close();
	}

}
 