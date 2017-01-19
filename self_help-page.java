package version2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selfhelppage {
	private static WebElement element;
	
	public static WebElement conditions(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[2]/div/a[2]"));
	}

	public static WebElement procedures(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[2]/div/a[3]"));
	}
	public static WebElement medications(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[2]/div/a[4]"));
	}
	public static WebElement Doctors(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[2]/div/a[5]"));
	}
	public static WebElement Hospiotals(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[2]/div/a[6]"));
	}
	public static WebElement symptoms(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[2]/div/a[1]"));
	}
	
	public static WebElement SIGNUP(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[1]/div[2]/div[3]/button"));
	}
	public static WebElement Location(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[1]/div[2]/div[1]"));
		
	}
	public static WebElement titletext(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[1]/div[1]/div[1]/span"));
		
	}
	
	
	
	public static WebElement Enteryourlocation(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[1]/div[2]/div[2]/div[1]/div/p-autocomplete/span/input"));
		
	}
	public static WebElement Mumbaicity(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/label[1]"));
		
	}
	public static WebElement Bangalorecity(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/label[2]"));
		
	}
	public static WebElement Hyderabadcity(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/label[3]"));
		
	}
	public static WebElement Chennaicity(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/label[4]"));
		
	}
	public static WebElement punecity(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/label[5]"));
		
	}
	public static WebElement Kolcuttacity(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/label[6]"));
		
	}
	public static WebElement Agracity(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/label[7]"));
		
	}
	
	public static WebElement Delhicity(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/label[8]"));
		
	}
	public static WebElement Avatar(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/app-symptoms/div/div/div/app-avatar/div/div/div/panel/div/div[1]/header/div/div[1]"));
		
	}
	public static WebElement Allsymptoms(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/app-symptoms/div/div/div/app-avatar/div/div/div/panel/div/div[1]/header/div/div[2]"));
		
	}
	public static WebElement rotate(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/app-symptoms/div/div/div/app-avatar/div/div/app-male-front/div/div[1]/div/div[1]/button"));
		
	}
	public static WebElement gender(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/app-symptoms/div/div/div/app-avatar/div/div/app-male-front/div/div[1]/div/div[3]/button"));
		
	}
	public static WebElement femalerotate(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-self-help/div[2]/div/app-symptoms/div/div/div/app-avatar/div/div/app-female-front/div/div[1]/div/div[1]/button"));
	}
	
}
