package Admin.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WH_Admin {

	public static void main(String[] args)

	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium_Practice\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://adminstag.westhillglobal.com/");	
		dr.manage().window().maximize();
		dr.findElement(By.xpath("/html/body/app-root/app-login/div/div/div/div[2]/div/div/div/app-signin/form/div[2]/input")).sendKeys("whg.superadmin@dispostable.com");		
		dr.findElement(By.cssSelector("body > app-root > app-login > div > div > div > div.col-md-6.form_box > div > div > div > app-signin > form > div:nth-child(3) > show-hide-password > input")).sendKeys("Test@123");
	    dr.findElement(By.cssSelector("body > app-root > app-login > div > div > div > div.col-md-6.form_box > div > div > div > app-signin > form > button")).click();
	}
}
