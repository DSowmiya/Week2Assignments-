package week2.Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment2DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
				 
			//	Click Leads link
			
			
				7	Click Find leads
				8	Click on Phone
				9	Enter phone number
				10	Click find leads button
				11	Capture lead ID of First Resulting lead
				12	Click First Resulting lead
				13	Click Delete
				14	Click Find leads
				15	Enter captured lead ID
				16	Click find leads button
				17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
				18	Close the browser (Do not log out)
		
			}
		}
	}

}
