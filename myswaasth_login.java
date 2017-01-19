package vmyswaasthPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	private static WebElement element;
	public static WebElement signuplink(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/ui-view/div[2]/section[1]/header/div[1]/md-toolbar/div/a[4]/button"));
	}

	public static WebElement loginlink(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/ui-view/div[2]/section[1]/header/div[1]/md-toolbar/div/a[5]/button"));
	}
	public static WebElement emergencyservice(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/ui-view/div[2]/section[1]/header/div[1]/md-toolbar/div/a[3]/button"));
	}
	public static WebElement popupselectstate(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("#select_label_015>span"));
	}
	public static WebElement  up(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/div[5]/md-select-menu/md-content/md-option[1]/div"));
	}
	public static WebElement locationaddress(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/div[4]/md-dialog/md-dialog-content/div[2]/div/p[3]/span"));
	}
	
	public static WebElement maharastra(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/div[5]/md-select-menu/md-content/md-option[4]/div"));
	}
	public static WebElement delhi(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/div[5]/md-select-menu/md-content/md-option[3]/div"));
	}
	public static WebElement haryana(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/div[5]/md-select-menu/md-content/md-option[2]/div"));
	}
	public static WebElement departmentemergencynumber(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/div[4]/md-dialog/md-dialog-content/div[2]/div/p[2]/span"));
	}
	public static WebElement emergencynumbertekenfronlink(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/div[4]/md-dialog/md-dialog-content/p/a"));
	}
	public static WebElement changelocationbutton(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement enteryourcity(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement mumbaicity(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement bangalorecity(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement hyderabad(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement chennai(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement pune(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement kolkata(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement Agra(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement DELHI(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement findsymptomslink(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement findconditionslink(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement findmedicationslink(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement findprocedureslink(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement finddoctoreslink(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement findhospitalslink(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
	public static WebElement login2(WebDriver driver)
	{
		return driver.findElement(By.xpath(""));
	}
}
