package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Filldetails {

	public static void main(String[] args) throws InterruptedException {
		/*TC-1 LANCH EDGE BROWSER
		System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();*/
		//TC-1 LANCH CROME BROWSER
		  ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 WebDriver driver = new ChromeDriver(options);
		    Thread.sleep(3000);
		// go to test url
		driver.get("https://www.facebook.com/");
	// click create new account
		driver.findElement(By.linkText("Create new account")).click();
	//fill the firstname
		Thread.sleep(4000);
		driver.findElement(By.name("firstname")).sendKeys("ambika");
	//fill the lastname
		driver.findElement(By.name("lastname")).sendKeys("raj");
		Thread.sleep(4000);
	//fill the email id
				driver.findElement(By.name("reg_email__")).sendKeys("raj1234");
				Thread.sleep(4000);
				driver.close();

	}

}
