package com.evs.vtiger.testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.evs.coursemanagement.CourseManagementPagewiseClass;
import com.evs.vtiger.commonCodes.CommonResuableCode;

import managementcourse.CourseMangementPagemodel;
import superAdminemployee.SuperAdminEmployeeCreation;

public class LMSCommon extends BaseClass{
	@Test( invocationCount = 10,priority  = 1, enabled = true,retryAnalyzer = RetryAnalyzer.class)
	public void lm001employee() throws IOException
	{
		SuperAdminEmployeeCreation em=	  new SuperAdminEmployeeCreation(kw);
		em.employeeCreation("Kishan@12345", "Kishan@12345");

	}
	@Test(invocationCount = 10,enabled = false,retryAnalyzer = RetryAnalyzer.class)
	public void uploadfile() throws InterruptedException
	{
		CommonResuableCode cd=new CommonResuableCode(kw);
		cd.uploadfile("C:\\Users\\CBPC-09\\Pictures\\Saved Pictures\\logo2.png");
	}
	@Test(enabled = false,retryAnalyzer = RetryAnalyzer.class)
	public void uploadlogo()
	{
		CommonResuableCode cd=		new CommonResuableCode(kw);
		cd.uploadlogo("C:\\Users\\CBPC-09\\Pictures\\Saved Pictures\\download.jpg");
	}

	@Test(invocationCount = 1,enabled =false,retryAnalyzer = RetryAnalyzer.class)
	public void uploadprofile()
	{
		CommonResuableCode cd=  new CommonResuableCode(kw);
		cd.uploadprofileimage("C:\\Users\\CBPC-09\\Pictures\\Saved Pictures\\240_F_52616703_6s0dww8NUINMNDtAHWytqW5JMtFrzFXv.jpg");
	}

	@Test(invocationCount = 10,enabled  = false,retryAnalyzer = RetryAnalyzer.class)
	public void createAdmin()
	{
		SuperAdminEmployeeCreation em=	  new SuperAdminEmployeeCreation(kw);
		em.manageAdminCreate("Kishan@12345", "Kishan@12345");   
	}
	@Test(enabled = false)
	public void CourseMangement()
	{
		CourseMangementPagemodel  cm=     new CourseMangementPagemodel(kw);
		cm.createCourse();
	}
	@Test(invocationCount = 20,enabled = false)
	public void Universaldelete() throws InterruptedException
	{
		com.evs.vtiger.commonCodes.Universaldelete de=		new com.evs.vtiger.commonCodes.Universaldelete(kw);
		de.universaldelete();
	}

	@Test(invocationCount = 10, retryAnalyzer = RetryAnalyzer.class,enabled = false)
	public void courseCreation()
	{
		CourseManagementPagewiseClass cms=         new CourseManagementPagewiseClass(kw);
		cms.Coursecreate();
	}

}
