package swagtestcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import libraries.Addtocard;
import libraries.loginpage;
import utils.apputils;

public class addcardtestcase extends apputils
{
	@Parameters({"username","password","select1","select2"})
    @Test(priority = 3)
public void addcard(String url,String pwd,String id1,String id2)
{
	loginpage lp = new loginpage();
	lp.login(url, pwd);
	
	Addtocard add = new Addtocard();
	add.addproduct(id1,id2);
	
	lp.logout();
}
	
	
}
