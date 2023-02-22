package libraries;

import org.openqa.selenium.By;

import utils.apputils;

public class Getlogincre extends  apputils

{
public void credentials() {
	
String usernam =  driver.findElement(By.id("login_credentials")).getText();
	
 String password =    driver.findElement(By.className("login_password")).getText();
 
 System.out.println(usernam);
 System.out.println(password);
 closeapp();
}
}
