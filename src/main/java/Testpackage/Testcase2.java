package Testpackage;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMpages.CoursetabPage;
import POMpages.SkillaryLoginpage;
import POMpages.SkillraryDemoApp;
import genericlib.Baseclass;

public class Testcase2 extends Baseclass{
	@Test
	public void test2() throws IOException, InterruptedException
	{
		SkillaryLoginpage L=new SkillaryLoginpage(driver);
		L.gearsButton();
		L.skillarydemoapp();
		
		SkillraryDemoApp D=new SkillraryDemoApp(driver);
		Utilies.switichingTabs(driver);
		Thread.sleep(3000);
		Utilies.dropDown(D.getDropdowntab(), pdata.getPropertyFiledata("text"));
		
		CoursetabPage C=new CoursetabPage(driver);
		Utilies.switichingTabs(driver);
		Thread.sleep(3000);
		Utilies.dragAndDrop(driver,C.getJunittab(),C.getAddtocartArea());
		WebElement ele=C.getFacebookicon();
	Point facebook=ele.getLocation();
	int x=facebook.getX();
	int y=facebook.getY();
	Thread.sleep(3000);
	Utilies.scrollBar(driver, x, y);
	
	Assert.assertEquals(driver.getCurrentUrl(), pdata.getPropertyFiledata("currentURL"));
	}
	
	
	

}
