package superAdmin_manageAdmin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.utils.KishanWebUtil;

public class ManagementAdminOrlayer {
	
public ManagementAdminOrlayer(KishanWebUtil kw)
{
	PageFactory.initElements(kw.getDriver(), this);
}

@FindBy(xpath = "//input[@placeholder='Name']")
private WebElement adminName;
public WebElement getAdminName()
{
	return  adminName;
}

//@FindBy(xpath = "//input[@placeholder='Name']")
//private WebElement adminName;
//public WebElement getAdminName()
//{
//	return  adminName;
//}

}
