package libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import utils.apputils;

public class Orderofproduct extends apputils
{
public void orderby(String order) 
{
	
	Select sec = new Select(driver.findElement(By.className("product_sort_container")));
	sec.selectByValue(order);
	
}
}
