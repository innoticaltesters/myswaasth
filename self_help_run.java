package version2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selfhelprun {
	@Test
	public void home() throws InterruptedException, IOException
	{
		 
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://myswaasth.sia.co.in");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Myswaasthhomepage.Selfhelp(driver).click();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		selfhelppage.conditions(driver).click();
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\Myswassth\\conditionspage.png"));
		
		selfhelppage.procedures(driver).click();
		Thread.sleep(4000);
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile1, new File("D:\\Myswassth\\procedurepage.png"));
		
		selfhelppage.medications(driver).click();
		Thread.sleep(4000);
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile2, new File("D:\\Myswassth\\medicationspage.png"));
		
		selfhelppage.Doctors(driver).click();
		Thread.sleep(4000);
		File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile3, new File("D:\\Myswassth\\doctorespage.png"));
		
		selfhelppage.Hospiotals(driver).click();
		Thread.sleep(4000);
		File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile4, new File("D:\\Myswassth\\hospitalspage.png"));
		
		selfhelppage.symptoms(driver).click();
		Thread.sleep(4000);
		File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile5, new File("D:\\Myswassth\\symptonspage.png"));
		
		selfhelppage.rotate(driver).click();
		Thread.sleep(4000);
		File scrFile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile6, new File("D:\\Myswassth\\rotate.png"));
		
		selfhelppage.femalerotate(driver).click();
		Thread.sleep(4000);
		File scrFile7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile7, new File("D:\\Myswassth\\female.png"));

		selfhelppage.rotate(driver).click();
		Thread.sleep(4000);
		File scrFile8 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile8, new File("D:\\Myswassth\\femaleback.png"));
		
		selfhelppage.Avatar(driver).click();
		Thread.sleep(4000);
		File scrFile9 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile9, new File("D:\\Myswassth\\avatar.png"));
	
		selfhelppage.Allsymptoms(driver).click();
		Thread.sleep(4000);
		File scrFile10 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile10, new File("D:\\Myswassth\\allsymptoms.png"));
		
		
		
		
		
		
		    
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
