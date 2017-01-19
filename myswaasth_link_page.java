package version2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class myswaasthlinkpage {
	private static WebElement element;
	public static WebElement Emailaddress(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-login/div/div[2]/div[1]/div/form/div[3]/input"));
	}
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-login/div/div[2]/div[1]/div/form/div[4]/input"));
	}
	public static WebElement keepmesignin(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-login/div/div[2]/div[1]/div/form/div[5]/p-checkbox/div/div[2]"));

	}
	public static WebElement forgotpassword(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-login/div/div[2]/div[1]/div/form/div[6]/a"));
	}
	public static WebElement Signmein(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-login/div/div[2]/div[1]/div/form/div[7]/button"));
	}
	public static WebElement firstname(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/signup-app/div/div/div[1]/div/div/form/div[3]/input"));
		
	}
	public static WebElement lastname(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/signup-app/div/div/div[1]/div/div/form/div[4]/input"));
	}
	public static WebElement Emailaddressfield(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/signup-app/div/div/div[1]/div/div/form/div[5]/input"));
	}
	public static WebElement passwordfield(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/signup-app/div/div/div[1]/div/div/form/div[6]/input"));
	}
	public static WebElement Mobilenumber(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/signup-app/div/div/div[1]/div/div/form/div[7]/input"));
	}
	public static WebElement Bloodgroup(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/signup-app/div/div/div[1]/div/div/form/div[8]/p-dropdown/div/label"));
	}
	
	
	public static WebElement termsandconditions(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/signup-app/div/div/div[1]/div/div/form/div[9]/p-checkbox/div/div[2]"));
	}
	public static WebElement signmeinn(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/signup-app/div/div/div[1]/div/div/form/div[10]/button"));
	}
	
	public static WebElement signmeup(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-login/div/div[2]/div[2]/div/div/div[5]/button"));
	}
	public static WebElement signinfacebook(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-login/div/div[2]/div[1]/div/form/div[8]/button"));
	}
	public static WebElement signingoogle(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-login/div/div[2]/div[1]/div/form/div[9]/div/div/div"));
	}
	
}
