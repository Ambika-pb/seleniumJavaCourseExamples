package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class Relativeoperators {

	

	public static void main(String[] args) throws InterruptedException {
	//TC-1 LANCH EDGE BROWSER
		System.setProperty("weddriver.edge.driver", "C:\\\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
	// go to test url
		driver.get("https://www.facebook.com/");
	// click create new account
		driver.findElement(By.linkText("Create new account")).click();
	//fill the firstname
		Thread.sleep(4000);
		driver.findElement(By.name("firstname")).sendKeys("ambika");
	//fill the lastname
		driver.findElement(By.name("lastname")).sendKeys("raj");
	//fill the email id
				driver.findElement(By.name("reg_email__")).sendKeys("raj1234");
	//click Male RB BY USEING RELATIVE LOCATORS
		By AdmRb=RelativeLocator.with(By.tagName("input")).below(By.name("birthday_month"));
		
		//By emailLocator = RelativeLocator.with(By.tagName("input")).near(By.id("lbl-email"));
		driver.findElement(AdmRb).click();
	//Fill the new password by relative locators
		By adnewpw=RelativeLocator.with(By.tagName("input")).above(By.name("birthday_month"));
		driver.findElement(adnewpw).sendKeys("navaraj");
	

	}

}
