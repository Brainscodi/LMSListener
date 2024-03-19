package com.evs.vtiger.testScript;

import org.testng.annotations.Test;

import com.evs.taskCreate.TaskCreationClass;

public class Tasks extends BaseClass {
@Test(invocationCount = 2, retryAnalyzer = RetryAnalyzer.class,enabled = true)
public void TaskCreation() throws InterruptedException
{
	TaskCreationClass objtask=	new TaskCreationClass(kw);
	objtask.taskcreation();
	Thread.sleep(2000);
}

}
