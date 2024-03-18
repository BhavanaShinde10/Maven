package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class OrganizationsTest {
	
	@Test
	public void CreateOrganizationsTest()
	{
		
		
		
		
			WebDriver driver= new ChromeDriver();
			//To maximize the window
			
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//To read the data from property file
			
			//To read data from excel file
			/*
			 * String ORGNAME = eutil.getDataFromExcel("Organizations", 0, 1); String GROUP
			 * = eutil.getDataFromExcel("Organizations", 1, 1);
			 */
			//To launch the application
			driver.get("http://localhost:8888/");
			//To login to application
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.id("submitButton")).click();
		
		
	}
	

}
