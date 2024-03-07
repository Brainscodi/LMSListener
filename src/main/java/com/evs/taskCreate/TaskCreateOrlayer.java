package com.evs.taskCreate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.evs.vtiger.utils.KishanWebUtil;

public class TaskCreateOrlayer {
	
	public TaskCreateOrlayer(KishanWebUtil kw)
	{
	 PageFactory.initElements(kw.getDriver(), this);	
	}
	
	@FindBy(xpath = "//a[@href='/tasks']")
	private WebElement taskSection;
	public WebElement Tasksection()
	{
		return taskSection;
	}
	
	@FindBy(xpath = "//button[contains(@class,'cst-btn')]")
	private WebElement addTaskButton;
	public WebElement addtaskbutton()
	{
		return addTaskButton;
	}
	
	@FindBy(name = "taskName")
	private WebElement taskName;
	public WebElement tasknameTx()
	{
		return taskName;
	}

	@FindBy(xpath = "//input[@placeholder='Task Description']")
	private WebElement TaskDescription;
	public WebElement taskDescription()
	{
		return TaskDescription;
	}
	
	@FindBy(xpath = "//span[text()='Submit Task']")
	private WebElement submittaskBT;
	public WebElement submitTaskButton()
	{
		return submittaskBT;
	}
	
	@FindBy(xpath = "//button[@class='cst-btn light-danger m-1 border-0 w100-sm']")
	private WebElement CancelTaskBT;
	public WebElement canceltaskButton()
	{
		return CancelTaskBT; 
	}
	
}
