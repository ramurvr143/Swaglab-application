package swagtestcases;


import org.testng.annotations.Test;

import libraries.Getlogincre;
import utils.apputils;

public class Credentialstestcase extends apputils
{
	@Test(priority = 1)
public void prcredentials() {
	
	
	Getlogincre gc = new Getlogincre();
	gc.credentials();
	
}
}
