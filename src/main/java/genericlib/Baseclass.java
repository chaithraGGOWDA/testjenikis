package genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public WebDriver driver;
	public PropertyFile pdata=new PropertyFile();
	public WebDriverDriverUtilies Utilies=new WebDriverDriverUtilies();
	@BeforeMethod
	
	public void OpenApp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPropertyFiledata("url"));
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	
	public void CloseApp(ITestResult result) throws IOException
	{
		int Status=result.getStatus();
		String name=result.getName();
		if(Status==2)
		{
			Screenshot s = new Screenshot();
			s.getPhoto(driver, name);
		}
		
		driver.quit();
	}

}
