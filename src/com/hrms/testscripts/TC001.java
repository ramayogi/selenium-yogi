package com.hrms.testscripts;

public class TC001 {
	import org.apache.log4j.xml.DOMConfigurator;
	import org.testng.annotations.Test;

	import com.hrms.lib.General;
	@Test
	public void tc001() {
	    //TestSteps
	DOMConfigurator.configure("log4j.xml");
	   General  obj  = new General();
	   obj.openApplication();
	   obj.login();
	   obj.logout();
	   obj.closeApplication();
	}
	}

