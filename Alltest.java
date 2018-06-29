package Tatocautomation.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alltest {
	WebDriver web;
	basicCourse basic;
	GridGate grid;
	FrameDungeon frame;
	Drag drag;
	Popup popup;
	Cookie cookie;
	

	@BeforeClass
	public void start() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepakkandpal\\Desktop\\chromedriver_win32\\chromedriver.exe");
		web = new ChromeDriver();
		web.get("http://10.0.1.86/tatoc/");
		initPage();
	}
	
	public void initPage() {
		basic =new basicCourse(web);
		grid = new GridGate(web);
		frame = new FrameDungeon(web);
		drag = new Drag(web);
		popup = new Popup(web);
		cookie = new Cookie(web);
	}


	
	@Test(priority=1)
	public void testBasicCourse() {
		
		basic.clickOnBasicCourse(); 
		
		
	}
	


	@Test(priority=2)
	public void testGreenBox() {

		grid.clickOnGreenBox();
	}

	

	@Test(priority=3)
	public void testrepaintBox() {

		frame.repaintBox();

	}

   @Test(priority=4)	
   public void testboxInDropBox() {

		drag.boxInDropBox();
	}

	@Test(priority=5)
	public void testLaunchwindowEnterTextAndProceed() {

		popup.launchWindowEnterTextAndProceed();

	}

	@Test(priority=6)
	public void testProceedWithGeneratingTokenAndAddingCookie() {

		cookie. proceedWithGeneratingTokenAndAddingCookie();

	}
	
	
	@AfterClass
	public void end() {
		web.quit();
	}
}


