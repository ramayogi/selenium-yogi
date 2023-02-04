package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
public class TC002 {
	@Test
	public void tc002()
	DOMConfigurator.configure("log4j.xml");
	   General obj = new General();
	   obj.openApplication();
	   obj.login();
	   obj.enterFrame();
	   obj.addNewEmp();
	   obj.exitFrame();
	   obj.logout();
	   obj.closeApplication();
	}
	}

}
