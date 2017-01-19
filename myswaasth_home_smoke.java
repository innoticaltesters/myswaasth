ackage version2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class smoke {
	@Test
	public void home() throws InterruptedException, IOException
	{
		 
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	
		driver.get("http://myswaasth.sia.co.in");
		 
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\Myswassth\\homepage.png"));
		
		Myswaasthhomepage.blog(driver).click();
		Thread.sleep(3000);
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile1, new File("D:\\Myswassth\\blog.png"));
		 
		String pagetitle=driver.getTitle();
		System.out.println("Blogpagetitle="+pagetitle);
		 
		Myswaasthhomepage.Emergency(driver).click();
		Thread.sleep(3000);
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile2, new File("D:\\Myswassth\\Emergency.png"));
		 
		String pagetitle1=driver.getTitle();
		System.out.println("Emergencypagetitle="+pagetitle1);
		 
		Myswaasthhomepage.Selfhelp(driver).click();
		String pagetitle2=driver.getTitle();
		System.out.println("Selfhelppagetitle="+pagetitle2);
		Thread.sleep(3000);
		File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile3, new File("D:\\Myswassth\\selfhelp.png"));
		
		Myswaasthhomepage.Myswaasth(driver).click();
		String pagetitle3=driver.getTitle();
		System.out.println("Myswaasthhelppagetitle="+pagetitle3);
		Thread.sleep(3000);
		File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile4, new File("D:\\Myswassth\\Myswassth.png"));
		Myswaasthhomepage.home(driver).click();
		String pagetitle4=driver.getTitle();
		System.out.println("myswaasthpagetitle="+pagetitle4);
		
		Myswaasthhomepage.home(driver).click();
		String pagetitle5=driver.getTitle();
		System.out.println("Homepagetitle="+pagetitle5);
		
		
	
		
		
		Myswaasthhomepage.blog(driver).click();
		Thread.sleep(2000);
		block.myfitness(driver).click();
		
		block.Home(driver).click();
		Myswaasthhomepage.Myswaasth(driver).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		myswaasthlinkpage.signmeup(driver).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		File scrFile6 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile6, new File("D:\\Myswassth\\homeselfdiagnosticsystem.png"));
		myswaasthlinkpage.firstname(driver).sendKeys("satish kumar");
		
		
		
		
		
		
		
		 }

}
