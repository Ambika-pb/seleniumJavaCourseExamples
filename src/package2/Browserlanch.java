package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browserlanch {
public static void main(String[] args) throws InterruptedException {
		
				// TC-1 Launch the edge browser
					System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
					
					WebDriver driver =new EdgeDriver();
					
			   //TC-2 Goto test url 	https://mail.google.com/mail	
			          
					driver.get("https://www.youtube.com/watch?v=vnA30oxqW5E");
			   
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
				     
				     driver.close();			}
		}



