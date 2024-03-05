package com.evs.vtiger.commonCodes;

import com.evs.vtiger.utils.KishanWebUtil;

public class Universaldelete extends CommonResuableCode{
     private KishanWebUtil kc;
	public Universaldelete(KishanWebUtil kw) {
		super(kw);
		this.kc=kw;
	}
	
	public void universaldelete() throws InterruptedException
	{
		 //CommonResuableCode cd=new CommonResuableCode(kc);
		 kc.myclick(getResourceButton());
		 kc.myclick(getDeleteFile());
		 kc.myclick(getAcceptDelete());
		 Thread.sleep(1000);
		 //kc.popupaccept();
	}

}
