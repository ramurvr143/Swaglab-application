package swagtestcases;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import libraries.loginpage;
import utils.apputils;

public class Loginwithinvalid extends apputils
{
	@Parameters({"username","password"})
	@Test(priority = 6)
	public void logininvalid(String uid,String pwd)
	{
		loginpage lp = new loginpage();
		lp.login(uid, pwd);
	
		boolean res = lp.iserrmessage();
		Assert.assertTrue(res);
	}
}
