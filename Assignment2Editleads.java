package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Editleads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*http://leaftaps.com/opentaps/control/main
		
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click lead

		driver.findElement(By.linkText("Leads")).click();
		
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//	Enter first name
		
		driver.findElement (By.xpath("//input[@name='firstName'][3]")).sendKeys("sowmiya");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.getTitle().contains("View Lead");
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		//Confirm the changed name appears
		if(driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText().contains("TCS"))
		{
		System.out.println("The Changed Company Name Appears Correctly");
		}

		driver.close();

	}

}
