package testcases;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import pages.LoginPage;

public class simplielearnlogintest extends BaseClass{
	

	@Test
	public void Test1() {
		
		LoginPage lp = new LoginPage(driver);
		lp.Login("abc@xyz.com","Passwoe12");
		
		//Step6: Validate the error message on screen
		WebElement Error = driver.findElement(By.id("msg_box"));
		
		String ActError = Error.getText();
		String ExpError = "The email or password you have entered is not valid valid.";
		
//		if(ActError.equals(ExpError)) {
//			System.out.println("TC PAssed");
//		}else {
//			System.out.println("Tc Failed");		}
	
		Assert.assertEquals(ActError, ExpError);
		Assert.assertTrue(Error.isDisplayed());
		
		}
	
	@Test
	@Parameters({"uname","pwd"})
	public void Test2(String UserName,String Password) {
		LoginPage lp =new LoginPage(driver);
		lp.Login(UserName, Password);
	}
		
	@Test
	public void Test3() {
		
		
		
		String UserName = sheet.getRow(1).getCell(0).getStringCellValue();
		String Password = sheet.getRow(1).getCell(1).getStringCellValue();
		
		LoginPage lp = new LoginPage(driver);
		lp.Login(UserName,Password);
	}
	
	

}

		
		
	
	
		
		
		



