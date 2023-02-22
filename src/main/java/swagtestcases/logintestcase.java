package swagtestcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import libraries.loginpage;
import utils.apputils;

public class logintestcase extends apputils
{
	@Parameters({"username","password"})
	@Test(priority = 0)
public void loginuser(String uid,String pwd)
{
	loginpage lp = new loginpage();
	lp.login(uid,pwd);
	lp.logout();
	
}
}
