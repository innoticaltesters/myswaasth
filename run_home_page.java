package vmyswaasthPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class runhomepage {
	@Test
	public void homepagerun() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://myswaasth.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			loginpage.emergencyservice(driver).click();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			loginpage.popupselectstate(driver).click();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			loginpage.up(driver).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			String locationaddress=loginpage.departmentemergencynumber(driver).getText();
			System.out.println("location address1="+locationaddress);
			
			String locationaddress2=loginpage.locationaddress(driver).getText();
			System.out.println("location address2="+locationaddress2);
			
			loginpage.popupselectstate(driver).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loginpage.haryana(driver).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String locationaddress3=loginpage.departmentemergencynumber(driver).getText();
			System.out.println("Haryana location address1="+locationaddress3);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			
			loginpage.popupselectstate(driver).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loginpage.delhi(driver).click();
			String locationaddress4=loginpage.departmentemergencynumber(driver).getText();
			System.out.println("Delhi location address="+locationaddress3);
			
			
			
}
}
