package superAdminemployee;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.evs.vtiger.utils.KishanWebUtil;

public class SuperAdminEmployeeOR {
	public SuperAdminEmployeeOR(KishanWebUtil kw)
	{
		PageFactory.initElements(kw.getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement employeename;
	public WebElement getEmployeeName()
	{
		return employeename;
	}
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement employemail;
	public WebElement getEmployeeEmail()
	{
		return employemail;
	}
	
	@FindBy(xpath = "//input[@placeholder='Company Name']")
	private WebElement employcompanyName;
	public WebElement getEmployeeCompanyName()
	{
		return employcompanyName;
	}

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement employpassword;
	public WebElement getEmployeePassword()
	{
		return employpassword;
	}
	@FindBy(xpath = "//input[@placeholder=' Confirm Password']")
	private WebElement employcofirmpassword;
	public WebElement getEmployeeconfirmPassword()
	{
		return employcofirmpassword;
	}

}
