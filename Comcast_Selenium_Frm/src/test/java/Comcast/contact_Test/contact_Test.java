package Comcast.contact_Test;

import org.testng.annotations.Test;

public class contact_Test {
	@Test(groups= "SmokeTest")
	public void contact1_Test() {
		System.out.println("execute contact_Test");
	}
	@Test(groups= "RegresssionTest")
	public void creContactwithOrgTest() {
		System.out.println("execute createContactWithOrg");
	}

	@Test(groups= "RegressionTest")
	public void delContactTest() {
		System.out.println("execute deleteContactTest");
	}


}
