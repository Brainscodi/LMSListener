package responsiveTesting;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AutomateResponsive {
	 // KishanWebUtil kw=KishanWebUtil.getobject();
	@DataProvider
	public Object[][] mobileEmulations()
	{
		return new Object[][] {
			{"BlackBerry Z30"},
			{"Blackberry PlayBook"},
			{"Galaxy Note 3"},
			{"Galaxy Note II"},
			{"Galaxy S III"},
			{"Galaxy S8"},
			{"Galaxy S9+"},
			{"Galaxy Tab S4"},
			{"LG Optimus L70"},
			{"Microsoft Lumia 550"}
		};
	}
	@Test(dataProvider = "mobileEmulations")
	public void ResponsiveTesting(String emulation) throws IOException
	{
	  Map<String, String> deviceMobEmu=new HashMap(); 
	  deviceMobEmu.put("deviceName", emulation);
	  ChromeOptions chromeOpt=new ChromeOptions();
	  chromeOpt.setExperimentalOption("mobileEmulations",deviceMobEmu);
	   WebDriver driver=    new ChromeDriver(chromeOpt);
	  driver.get("https://learning.projects-codingbrains.com/");
	//kw.takeScreenshotofFullpage("C:\\Users\\CBPC-09\\Pictures\\Responsive.png");
	}

}
