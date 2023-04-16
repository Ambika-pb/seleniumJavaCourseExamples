package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cromebrowser {
	
/*	package webchromepackage;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;*/

	public class ChromedriverClass {

		public static void main(String[] args) throws InterruptedException {
		// TC-1 Launch the chrome browser
		//	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
	   //TC-2 Goto test url 	https://mail.google.com/mail	
		/*	try {
			      // Navigate to Url
			      driver.get("https://google.com");
			      System.out.println("Web brower couldn't open!");
			    } finally {
			    	System.out.println("Web brower couldn't open!");
			    	driver.quit();
			    }*/
			driver.get("https://www.flipkart.com/");
	   
		//TC-3 specify wait time 5 sec
				Thread.sleep(5000);
		
		//TC-4 get the title of page into console
		     String pagetitle= driver.getTitle();
		     System.out.println(pagetitle);
		
		 //TC-5 manage the browser window to be minimize
		     driver.manage().window().minimize();
		     
		 //TC-6 specify wait time 5 sec
				Thread.sleep(5000);
		
		 //TC-7 manage the browser window to be maxmize
		 //    driver.manage().window().maxmize();
		     
		//TC-8 Close the browser
		     
		     driver.close();
				
		
		     
		}

	}


}
