package com.evs.coursemanagement;

import com.evs.vtiger.utils.KishanWebUtil;

import net.bytebuddy.utility.RandomString;

public class CourseManagementPagewiseClass extends CoursemangementOrlayer{
   private KishanWebUtil kc;
	public CourseManagementPagewiseClass(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
	}
	
	public void Coursecreate()
	{
	String coursetitle=	RandomString.make(5);
		kc.myclick(getcoursemangementLK());
		kc.myclick(getAddCourseBT());
		kc.mySenkeys(getCourseTitleTX(), coursetitle);
		kc.mySenkeys(getCourseTypeTX(), "Wickly");
		kc.mySenkeys(getCourseDescriptionTX(), "this is cybercourse");
		kc.myclick(getCourseSubmitBT());
		kc.myclick(getCourseNextpageBT());
	}
	

}
