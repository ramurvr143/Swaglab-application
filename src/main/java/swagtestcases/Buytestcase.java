package swagtestcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import libraries.Buyproduct;
import libraries.loginpage;
import utils.apputils;

public class Buytestcase extends apputils
{
	@Parameters({"username","password","fname","lname","pincode"})
	@Test(priority = 4)
public void orderplaced(String uid,String pwd,String fname,String lname,
		String pincode) 
{
	loginpage lp = new loginpage();
	lp.login(uid, pwd);
	Buyproduct bp = new Buyproduct();
	bp.billpayment(fname, lname, pincode);
}
}
