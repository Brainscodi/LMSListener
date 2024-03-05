package managementcourse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.utils.KishanWebUtil;

public class ManagementCourseORlayer {
	public ManagementCourseORlayer(KishanWebUtil kw)
	{
		PageFactory.initElements(kw.getDriver(), this);
	}
	//1 
	@FindBy(xpath = "//input[@placeholder='Course title']")
	private WebElement courseTitle;
	public WebElement getCourseTitle()
	{
		return courseTitle;
	}
	//2
	@FindBy(xpath = "//input[@placeholder='Course Type']")
	private WebElement courseType;
	public WebElement getCourseType()
	{
		return courseType;
	}
	//3
	@FindBy(xpath = "//input[@placeholder='Course Description']")
	private WebElement courseDescription;
	public WebElement getCourseDescription()
	{
		return courseDescription;
	}
	
	@FindBy(xpath = "//button[contains(@class,'cst-btn blue-btn')]")
	private WebElement universalSubmitbutton;
	public WebElement getUniversalSubmitbutton()
	{
		return universalSubmitbutton;
	}
	
	@FindBy(xpath = "//div[@id='cell-1-245']/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div//div//i/following-sibling::i/following-sibling::a")
	private WebElement clicknextfromcoursepage;
	public WebElement getClicknextfromcoursepag()
	{
		return clicknextfromcoursepage;
	}
	
	

}
