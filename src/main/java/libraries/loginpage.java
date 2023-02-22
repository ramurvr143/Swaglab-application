package libraries;

import org.openqa.selenium.By;

import utils.apputils;

public class loginpage extends apputils
{
public void login(String uid,String pwd)
{
	driver.findElement(By.id("user-name")).sendKeys(uid);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.findElement(By.id("login-button")).click();
}
public void logout()
{
	driver.findElement(By.id("react-burger-menu-btn")).click();
	driver.findElement(By.id("logout_sidebar_link")).click();
}
public boolean iserrmessage()
{
	
	 String errmsg = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[3]")).getText();
	 if (errmsg.toLowerCase().contains(" not match")) {
		 
		 return true;
		
	} else {
		
		return false;

	}
}
}
