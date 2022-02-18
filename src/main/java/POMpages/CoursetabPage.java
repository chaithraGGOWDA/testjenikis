package POMpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursetabPage {
	@FindBy(xpath="//img[@id='munit testing ']")
	private WebElement junittab;
	
	@FindBy(id="cartArea")
	private WebElement addtocartArea;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[1]")
	private WebElement facebookicon;
	
	public CoursetabPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getJunittab() {
		return junittab;
	}
	public WebElement getAddtocartArea() {
		return addtocartArea;
	}

	public WebElement getFacebookicon() {
		return facebookicon;
	}

	
	
	

}
