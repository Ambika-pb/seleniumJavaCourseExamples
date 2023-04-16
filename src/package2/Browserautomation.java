package package2;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

	public class Browserautomation {

		public static void main(String[] args) throws InterruptedException {
	//TC-1Launch Browser
		
			System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
			
			WebDriver driver =new EdgeDriver();
	//TC-2get test url
			
			driver.get("https://www.flipkart.com/");
			
			System.out.println("url");
	//TC-3 specify wait time 3 sec
			Thread.sleep(3000);
	//TC-4 Minimize the window
			driver.manage().window().minimize();
			Thread.sleep(3000);
	//TC-5 Miximize the window
			 driver.manage().window().maximize();
	//TC-6 refresh the window
			 driver.navigate().refresh();
			 Thread.sleep(3000);
	//TC-7 Navigate to back and forword
			 driver.navigate().back();
			 Thread.sleep(3000);
			 driver.navigate().forward();
	//TC-8 Open new window 
			 driver.switchTo().newWindow(WindowType.WINDOW);
			 Thread.sleep(3000);
	//TC-9 Open new tab 
			 driver.switchTo().newWindow(WindowType.TAB);
			 Thread.sleep(3000);
	//TC-10 close the current tab
			 driver.close();
	//TC-11 Quit the window
			 driver.quit();
			 
			
		}

	}



