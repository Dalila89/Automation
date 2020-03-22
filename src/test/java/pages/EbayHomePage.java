package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.Lib6;

public class EbayHomePage extends Lib6 {
	public static void printebaytitle(WebDriver driver) {
		System.out.println("this is the page title  "+ GNprinttitle(driver));
	}
	public static void searchxbox(WebDriver driver) throws IOException {
		WebElement xbox=findelement(driver,readproperties("search1"));
		xbox.sendKeys("xboxone");
		xbox.submit();
		
		
	}
	
		
	
	
}
