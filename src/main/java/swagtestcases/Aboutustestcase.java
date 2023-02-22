package swagtestcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import libraries.Aboutswag;
import libraries.loginpage;
import utils.apputils;

public class Aboutustestcase extends apputils
{
	@Parameters({"username","password","texturl"})
	@Test(priority = 5)
 public void about(String uid,String pwd,String texturl) throws InterruptedException {
	 loginpage lp = new loginpage();
	 lp.login(uid,pwd );
	 Thread.sleep(5000);
	Aboutswag as = new Aboutswag();
	as.aboutus(texturl);
}
}
