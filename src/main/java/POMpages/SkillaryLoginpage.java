package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryLoginpage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsBtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoApp;
	
	public SkillaryLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void gearsButton()
	{
		gearsBtn.click();
	}
	
	public void skillarydemoapp()
	{
		demoApp.click();
	}
	}
	
	


