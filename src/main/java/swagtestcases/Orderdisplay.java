package swagtestcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import libraries.Orderofproduct;
import libraries.loginpage;
import utils.apputils;

public class Orderdisplay extends apputils
{
	@Parameters({"username","password","order"})
	@Test(priority = 2)
public void order(String url,String pwd,String order)
{
	
	loginpage lp = new loginpage();
	lp.login(url, pwd);
	
	Orderofproduct or = new Orderofproduct();
	or.orderby(order);
}
}
