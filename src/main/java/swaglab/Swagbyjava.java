package swaglab;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class Swagbyjava {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.saucedemo.com/");
		
		//login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		/*//window handles
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("about_sidebar_link")).click();
		Set<String> win = driver.getWindowHandles();
	    System.out.println(win);*/
		
		//scroll
		Thread.sleep(5000);
		
           JavascriptExecutor js = (JavascriptExecutor)driver;
           
          // js.executeScript("Window.scrollBy(0,5000)");
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.className("inventory_item_img")));
		
		
		//select
		Select ram = new Select( driver.findElement(By.className("product_sort_container")));
		ram.selectByValue("za");
		
		
		
		
		
		
	}

}
