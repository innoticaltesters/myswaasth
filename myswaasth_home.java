package version2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Myswaasthhomepage {
	private static WebElement element;
	
	public static WebElement  Emergency(WebDriver driver){
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/nav/ul/li[4]"));
		
	}
	public static WebElement Myswaasth(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/nav/ul/li[3]"));
		
	}
	public static WebElement blog(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/nav/ul/li[5]"));
		
	}

public static WebElement Selfhelp(WebDriver driver)
{
	return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/nav/ul/li[2]"));
}
public static WebElement home(WebDriver driver)
{
	return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/nav/ul/li[1]"));
}
public static WebElement homeselfdiagnosticsystem(WebDriver driver)
{
	return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/dashboard/div/div/div[4]/div[1]"));
}
public static WebElement Basicfirstaidguide(WebDriver driver)
{
	return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/dashboard/div/div/div[4]/div[1]"));
}
public static WebElement consultdoctor(WebDriver driver)
{
	return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/dashboard/div/div/div[4]/div[3]"));
}
public static WebElement joinnoebutton(WebDriver driver)
{
	return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/dashboard/div/div/div[3]/div/button"));
}


}
