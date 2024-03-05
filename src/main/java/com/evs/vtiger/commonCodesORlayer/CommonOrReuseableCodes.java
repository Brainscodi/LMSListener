package com.evs.vtiger.commonCodesORlayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.utils.KishanWebUtil;

import lombok.Getter;
@Getter
public class CommonOrReuseableCodes {
	public CommonOrReuseableCodes(KishanWebUtil kw)
	{
		PageFactory.initElements(kw.getDriver(), this);
	}
	

	@FindBy(xpath ="//input[@placeholder='Email']" )
	private WebElement userNameTB;
	public WebElement getUserNameTB()
	{
		return userNameTB;
	}

	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement userPasswordTB ;
	public WebElement getUserPasswordTB()
	{
		return userPasswordTB;
	}
	
	@FindBy(xpath = "//button[@class='login-btn']")
	private WebElement logibutton;
	public WebElement getClickOnLoginBT()
	{
		return logibutton;
	}
	
	
	@FindBy(xpath = "//a[@href='/employees']")
	private WebElement employee;
	public WebElement getEmployee()
	{
		return employee;
	}
	@FindBy(xpath = "//a[@class='cst-btn cst-success']")
	private WebElement addbutton;
	public WebElement getAddbutton()
	{
		return addbutton;
	}
	
	@FindBy(xpath = "//img[@alt='profile']")
	private WebElement profilebutton;
	public WebElement getProfilebutton()
	{
		return profilebutton;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement logout;
	public WebElement getLogout()
	{
		return logout;
	}
	
	@FindBy(xpath = "//button[@class='cst-btn blue-btn border-0 m-1 w100-sm']")
	private WebElement savebutton;
	public WebElement getSaveButton()
	{
		return savebutton;
	}
	@FindBy(xpath = "//a[@href='/course-management']")
	private WebElement coursemanagementbutton;
	public WebElement getCourseManagement()
	{
		return coursemanagementbutton;
	}
	@FindBy(xpath = "//button[@class='cst-btn cst-success m-1 border-0 w100-sm']")
	private WebElement courseaddbutton;
	public WebElement getCourseAddbutton()
	{
		return courseaddbutton;
	}
	
	@FindBy(xpath = "//input[@placeholder='Course title']")
	private WebElement courseTitle;
	public WebElement getCourseTitle()
	{
		return courseTitle;
	}
	
	@FindBy(xpath = "//input[@placeholder='Course Type']")
	private WebElement courseType;
	public WebElement getCourseType()
	{
		return courseType;
	}
	
	@FindBy(xpath = "//input[@placeholder='Course Description']")
	private WebElement courseDescription;
	public WebElement getCourseDescription()
	{
		return courseDescription;
		
	}
	
	
	
	
	
	
	
	@FindBy(xpath = "//a[@href='/resources']")
	private WebElement resoursebutton;
	public WebElement getResourceButton()
	{
		return resoursebutton;
	}
	
	@FindBy(xpath = "//input[@id='formFile']")
	private WebElement choosefile;
	public WebElement getChooseFile()
	{
		return choosefile;
	}
	
	@FindBy(xpath = "//button[@class='cst-btn light-success']")
	private WebElement uploadbutton;
	public WebElement getUploadButton()
	{
		return uploadbutton;
	}
	
	 @FindAll({
         @FindBy(xpath = "//i[@class='fa-solid fa-trash-can text-danger font-18']"),
         
 })
	 private List<WebElement> deletefile;
	 public List<WebElement> getDeleteFile()
	 {
		 return deletefile;
	 }
	 
	 @FindBy(xpath = "//span[text()='Profile']")
	 private WebElement profile;
	 public WebElement getProfilelink()
	 {
		 return profile;
	 }
	 
	 @FindBy(xpath = "//input[@id='file']")
	 private WebElement chooseprofile;
	 public WebElement  getchooseprofile()
	 {
		return chooseprofile; 
	 }
	 
	 @FindBy(xpath = "//button[text()='Upload']")
	 private WebElement profileUploadBT;
	 public WebElement getProfileUploadBT()
	 {
		 return profileUploadBT;
	 }
	 
	 @FindBy(xpath = "//span[text()='Settings']")
	 private WebElement settingLK;
	 public WebElement getSettingLk()
	 {
		 return settingLK;
	 }
	 @FindBy(xpath = "//button[text()='Manage Logo']")
	private WebElement managelogolink;
	 public WebElement getmanagelogoLink()
	 {
		 return managelogolink;
	 }
	 
	 @FindBy(xpath = "//input[@id='file']")
	 private WebElement chooselogo;
	 public WebElement getChooseLogo()
	 {
		 return chooselogo;
	 }
	 @FindBy(xpath ="//button[@class='btn btn-success']")
	 private WebElement uploadlogobutton;
	 public WebElement getUploadlogobutton()
	 {
		 return uploadlogobutton;
	 }
	 
	 @FindBy(xpath = "//span[text()='Manage Admin']")
	 private WebElement manageadminLK;
	 public WebElement getManagequicklink()
	 {
		 return manageadminLK;
	 }
	 
	 @FindBy(xpath = "//a[@href='/manage/new']")
	private WebElement manageAdminAddbutton;
	 public WebElement getManageAdminAddbutton()
	 {
		 return manageAdminAddbutton;
	 }
	 
	 @FindBy(xpath = "//img[@alt='lms-logo']")
	 private WebElement takelmslogo;
	 public WebElement getTakesLMslogo()
	 {
		 return takelmslogo;
	 }
	 
	 @FindBy(xpath = "//a[@href='/course-management']")
	 private WebElement coursemanagementLK;
	 public WebElement getCoursemanagementLK()
	 {
		 return coursemanagementLK;
	 }
	 
	 @FindBy(xpath = "//button[contains(@class,'cst-btn cst-success')]")
	 private WebElement universalAddbutton;
	 public WebElement getUniversalAddbutton()
	 {
		 return universalAddbutton;
	 }
	 
	  
	 @FindAll({
         @FindBy(xpath = "//div[text()='Action']/parent::div/parent::div/preceding-sibling::div/parent::div/parent::div/following-sibling::div//div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div//div//div//a/following-sibling::i"),
         
 })
	 private WebElement universaldelete;
	 public WebElement getUniversaldelete()
	 {
		 return universaldelete;
	 }
	 
	 @FindBy(xpath = "//button[text()='Yes, delete it!']")
	 private WebElement AcceptDelete;
	 public WebElement getAcceptDelete()
	 {
		 return AcceptDelete;
	 }
	 

	
	
	
	
	
	


	
}
