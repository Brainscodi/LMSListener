package superAdminemployee;

import java.io.IOException;

import com.evs.vtiger.commonCodes.CommonResuableCode;
import com.evs.vtiger.utils.KishanWebUtil;

import net.bytebuddy.utility.RandomString;

public class SuperAdminEmployeeCreation extends SuperAdminEmployeeOR{
      private KishanWebUtil kc;
	public SuperAdminEmployeeCreation(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
		
	}
	public void employeeCreation(String password,String confirmpassword) throws IOException
	{
	String random=	RandomString.make(4);
	CommonResuableCode cd=	new CommonResuableCode(kc);
	cd.gotoEmployeepage();
	//System.out.println(1/0);
	kc.mySenkeys(getEmployeeName(), random);
	kc.mySenkeys(getEmployeeEmail(), "employee"+random+"@gmail.com");
	kc.mySenkeys(getEmployeeCompanyName(), random);
	kc.mySenkeys(getEmployeePassword(), password);
	kc.mySenkeys(getEmployeeconfirmPassword(), confirmpassword);
	cd.Employeesavebutton();
	
	}
	
	public void manageAdminCreate(String password,String confirmpassword)
	{
		String random=	RandomString.make(4);
		CommonResuableCode cd=	new CommonResuableCode(kc);
		cd.gotomanageAdminpage();
		kc.mySenkeys(getEmployeeName(), random);
		kc.mySenkeys(getEmployeeEmail(), "admin"+random+"@gmail.com");
		kc.mySenkeys(getEmployeeCompanyName(), random);
		kc.mySenkeys(getEmployeePassword(), password);
		kc.mySenkeys(getEmployeeconfirmPassword(), confirmpassword);
		cd.Employeesavebutton();
	}

}
