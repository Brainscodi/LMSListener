package managementcourse;

import com.evs.vtiger.commonCodes.CommonResuableCode;
import com.evs.vtiger.utils.KishanWebUtil;

import net.bytebuddy.utility.RandomString;

public class CourseMangementPagemodel extends ManagementCourseORlayer{
     private KishanWebUtil kc;
	public CourseMangementPagemodel(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
	}
	
	public void createCourse()
	{
	CommonResuableCode cd=	new CommonResuableCode(kc);
	cd.gotoAddcoursePage();
    String randomcoursetitle=	RandomString.make(4);
	kc.mySenkeys(getCourseTitle(), randomcoursetitle);
	kc.mySenkeys(getCourseType(), "Weeckly");
	kc.mySenkeys(getCourseDescription(), "This is create course");
	kc.myclick(getUniversalSubmitbutton());
	kc.myclick(getClicknextfromcoursepag());
	}

}
