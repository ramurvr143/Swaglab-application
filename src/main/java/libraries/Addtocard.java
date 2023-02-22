package libraries;

import org.openqa.selenium.By;


import utils.apputils;

public class Addtocard extends apputils
{
	
public void addproduct(String id1,String id2)
{
		
	driver.findElement(By.id(id1)).click();
	driver.findElement(By.id(id2)).click();
	driver.findElement(By.className("shopping_cart_link")).click();
	boolean res = driver.findElement(By.className("inventory_item_price")).isDisplayed();
	
	if (res) 
	{
		System.out.println("iteam added to card");
	} else {
        System.out.println("iteam not added");
	}
	
	
	
}
}
