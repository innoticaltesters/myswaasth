ackage version2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Emergency_page {
	private static WebElement element;
	
	public static WebElement makeemergencyappointment(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-emergency/div[1]/div[2]/div/a[2]"));
	}
	public static WebElement callambulance(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-emergency/div[1]/div[2]/div/a[3]"));
	}

	public static WebElement firstaidandemergency(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-emergency/div[1]/div[2]/div/a[1]"));
	}
	public static WebElement titletext(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-emergency/div[1]/div[1]/div[1]/div[1]/span"));
	}	
}
