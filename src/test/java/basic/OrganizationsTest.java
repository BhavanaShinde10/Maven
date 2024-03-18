package basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonutils.PropertyFileUtil;
import commonutils.WebDriverUtil;

public class OrganizationsTest {
	
	@Test
	public void CreateOrganizationsTest() throws IOException
	{
		PropertyFileUtil putil= new PropertyFileUtil();
		WebDriverUtil wutil= new WebDriverUtil();
		
		
		
		
			WebDriver driver= new ChromeDriver();
			//To maximize the window
			wutil.maximize(driver);
			//To apply wait for findelement()
			wutil.implicitwait(driver);
			//driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//To read the data from property file
			String URL = putil.getDataFromPropertyFile("Url");
			String USERNAME=putil.getDataFromPropertyFile("Username");
			String PASSWORD=putil.getDataFromPropertyFile("Password");
			//To read data from excel file
			/*
			 * String ORGNAME = eutil.getDataFromExcel("Organizations", 0, 1); String GROUP
			 * = eutil.getDataFromExcel("Organizations", 1, 1);
			 */
			//To launch the application
			driver.get(URL);
			//To login to application
			driver.findElement(By.name("user_name")).sendKeys(USERNAME);
			driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
			driver.findElement(By.id("submitButton")).click();
		
		driver.get("http://localhost:8888/");
	}
	

}
