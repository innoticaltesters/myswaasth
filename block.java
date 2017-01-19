package version2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class block {
private static WebElement element;
	
	public static WebElement mylifestyle(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-blog/div[1]/div[2]/div/a[2]"));
	}

	
	public static WebElement myprevention(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-blog/div[1]/div[2]/div/a[3]"));
	}

	
	public static WebElement myfitness(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-blog/div[1]/div[2]/div/a[4]"));
	}


	
	public static WebElement myfood(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-blog/div[1]/div[2]/div/a[5]"));
	}

	
	public static WebElement videos(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-blog/div[1]/div[2]/div/a[6]"));
	}

	
	public static WebElement Home(WebDriver driver)
	{
		return driver.findElement(By.xpath("html/body/app-root/div/home/div/div/div/app-blog/div[1]/div[2]/div/a[1]"));
	}
}
