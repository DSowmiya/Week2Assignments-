package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createContactAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();


		// Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sowmiya");
		driver.findElement(By.id("lastNameField")).sendKeys("Devarajan");
		
		//Enter FirstName(Local) Field Using id Locator
				
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sow");
				
		//Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("TMD");
				
		//Enter Department Field Using any Locator of Your Choice
				 
		driver.findElement(By.name("departmentName")).sendKeys("Electronics");
				
				
		// Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createContactForm_description")).sendKeys("Creating contact of mine for recording purpose");
			
		//Enter your email in the E-mail address Field using the locator of your choice
				
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("babu@testleaf.com");
		
			
		// Select State/Province as NewYork Using Visible Text
		WebElement own = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select owner = new Select(own);
		owner.selectByValue("New York");


			// Click on Create Contact
			driver.findElement(By.name("submitButton")).click();
				
			// Click on edit button 
				
								
				 // Clear the Description Field using .clear
			
				//Fill ImportantNote Field with Any text
			
				// Click on update button using Xpath locator
			
				// Get the Title of Resulting Page
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateContactForm_description")).clear();
			driver.findElement(By.name("importantNote")).sendKeys("Editing description missed important notes");
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();

			System.out.println("Title of Resulting Page is " +driver.getTitle());

			driver.close();
				}
		       			
			}

			


