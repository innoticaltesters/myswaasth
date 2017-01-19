package version2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reference {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		Thread.sleep(3000);
		String pagetitle11=driver.getTitle();
		System.out.println("pagetitle1="+pagetitle11);
		
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
		
		Thread.sleep(3000);
		String pagetitle12=driver.getTitle();
		System.out.println("pagetitle2="+pagetitle12);
	}

}
