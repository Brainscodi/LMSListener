package com.evs.coursemanagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.utils.KishanWebUtil;

public class CoursemangementOrlayer {
	
	public CoursemangementOrlayer(KishanWebUtil kw)
	{
		PageFactory.initElements(kw.getDriver(),this);
	}
	
	
	@FindBy(xpath ="//a[@href='/course-management']" )
	private WebElement coursemangementLK;
	public WebElement getcoursemangementLK()
	{
		return coursemangementLK;
	}
	
	@FindBy(xpath = "//button[@class='cst-btn cst-success m-1 border-0 w100-sm']")
	private WebElement addcourseBT;
	public WebElement getAddCourseBT()
	{
		return addcourseBT;
	}
	
	@FindBy(xpath = "//input[@placeholder='Course title']")
	private WebElement coursetitleTX;
	public WebElement getCourseTitleTX()
	{
		return coursetitleTX;
	}
	
	@FindBy(xpath = "//input[@placeholder='Course Type']")
	private WebElement courseTypeTX;
	public WebElement getCourseTypeTX()
	{
		return courseTypeTX;
		
	}
	
	@FindBy(xpath = "//input[@placeholder='Course Description']")
	private WebElement courseDescriptionTX;
	public WebElement getCourseDescriptionTX()
	{
		return courseDescriptionTX;
	}
	
	@FindBy(xpath = "//span[text()='Submit Course']")
	private WebElement courseSubmitBT;
	public WebElement getCourseSubmitBT()
	{
		return courseSubmitBT;
	}
	
	@FindBy(xpath = "//button[contains(@class,'cst-btn light-danger')]")
	private WebElement univerCancelBT;
	public WebElement getUniverCancelBT()
	{
		return univerCancelBT;
	}
	
	@FindBy(xpath = "(//div[text()='Actions']/parent::div/parent::div/preceding-sibling::div/parent::div/parent::div/following-sibling::div//div//div/following-sibling::div/following-sibling::div/following-sibling::div/following::div/following-sibling::div//div//i)[3]")
	private WebElement courseNextpageBT;
	public WebElement getCourseNextpageBT()
	{
		return courseNextpageBT;
	}
	
	
	
	

}
