package Testpackage;
import org.testng.annotations.Test;

import POMpages.AddtocartPage;
import POMpages.SkillaryLoginpage;
import POMpages.SkillraryDemoApp;
import genericlib.Baseclass;
import genericlib.WebDriverDriverUtilies;

public class Testcase1 extends Baseclass {
@Test
	
public void test1()
	{
	SkillaryLoginpage L=new SkillaryLoginpage(driver);
	L.gearsButton();
	L.skillarydemoapp();
	
	SkillraryDemoApp D=new SkillraryDemoApp(driver);
	Utilies.switichingTabs(driver);
	Utilies.mouseHover(driver,D.getCoursetab());
	D.seleniumtrainingtab();
	
	AddtocartPage A=new AddtocartPage(driver);
	Utilies.doubleClick(driver,A.getAdd());
	A.addtocartbutton();
	Utilies.alertPopup(driver);
	
	
	
}
}
