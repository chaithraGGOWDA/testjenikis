package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp {
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="//select[@class='chosen-select']")
	private WebElement dropdowntab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	public SkillraryDemoApp(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getCoursetab()
	{
		return coursetab;
	}
	
	public void seleniumtrainingtab()
	{
		seleniumtraining.click();
	}
	
	public WebElement getDropdowntab() {
		return dropdowntab;
	}
	
	
}


