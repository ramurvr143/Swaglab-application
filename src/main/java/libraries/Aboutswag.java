package libraries;

import org.openqa.selenium.By;

import utils.apputils;

public class Aboutswag extends apputils
{
public void aboutus(String texturl)
{
	
	driver.findElement(By.id("react-burger-menu-btn")).click();
	driver.findElement(By.id("about_sidebar_link")).click();
	String wurl = driver.getCurrentUrl();
	String exurl = texturl;
	if (wurl.contains(exurl)) {
		System.out.println("open about ");
		
	} else {
		System.out.println("not open about ");

	}
}
}
