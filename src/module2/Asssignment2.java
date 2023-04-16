package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Asssignment2 {

	public static void main(String[] args) throws InterruptedException {
		
	//TC-1 LANCH CROME BROWSER
		  ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			 WebDriver driver = new ChromeDriver(options);
		    Thread.sleep(3000);
	//TC-2 Goto Test URL https://www.google.com
		driver.get("https://www.google.com/");
	//TC-3 specify wait time 3 sec
		Thread.sleep(3000);
	//TC-4 Get the Title of Page into Console
		String currurl=driver.getCurrentUrl();
	    System.out.println(currurl);
 // TC-5 Close the Browser
		driver.close();
	}

}
