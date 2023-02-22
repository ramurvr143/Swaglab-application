package libraries;

import org.openqa.selenium.By;


import utils.apputils;

public class Buyproduct extends apputils
{
	
public void billpayment(String fname,String lname,String pincode) 

{
		
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
	driver.findElement(By.className("shopping_cart_link")).click();
	driver.findElement(By.id("checkout")).click();
	driver.findElement(By.id("first-name")).sendKeys(fname);
	driver.findElement(By.id("last-name")).sendKeys(lname);
	driver.findElement(By.id("postal-code")).sendKeys(pincode);
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("finish")).click();
String text =	driver.findElement(By.className("complete-header")).getText();
String extext= "THANK YOU ";
if (text.contains(extext)) {
	System.out.println("order placed");
} else {
	System.out.println("order not placed");
}
}
}
