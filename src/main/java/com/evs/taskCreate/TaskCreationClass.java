package com.evs.taskCreate;

import com.evs.vtiger.utils.KishanWebUtil;

import net.bytebuddy.utility.RandomString;

public class TaskCreationClass extends TaskCreateOrlayer{
     private KishanWebUtil kc;
	public TaskCreationClass(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
	}
	
	public void taskcreation() throws InterruptedException
	{
		kc.myclick(Tasksection());
		Thread.sleep(5000);
		kc.myclick(addtaskbutton());
        String random=RandomString.make(5);
		kc.mySenkeys(tasknameTx(), random);
		kc.mySenkeys(taskDescription(), "This is task");
		kc.myclick(submitTaskButton());
	}

}
