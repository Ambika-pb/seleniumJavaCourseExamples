package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//TC-1 LANCH EDGE BROWSER
		System.setProperty("weddriver.edge.driver", "C:\\\\msedgedriver.exe");
		//@SuppressWarnings("unused")
		WebDriver driver =new EdgeDriver();
		//TC-2 LANCH CROME BROWSER
				System.setProperty("weddriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver1 =new ChromeDriver();
		//TC-1 LANCH FIREFOX BROWSER
				System.setProperty("weddriver.Firefox.driver", "C:\\geckodriver.exe");
				WebDriver driver2 =new FirefoxDriver();


	}

}
