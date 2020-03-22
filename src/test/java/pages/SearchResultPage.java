package pages;



import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utilities.Lib6;

public class SearchResultPage extends Lib6 {
	public static void sorting(WebDriver driver) throws IOException {
		Actions ac=new Actions(driver);
		ac.moveToElement(findelement(driver,readproperties("sortt"))).build().perform();
	}
	public static void listclick(WebDriver driver) throws IOException {
		WebElement clickon=findelement(driver,readproperties("click1"));
		clickon.click();
	}
	//public static void lis(WebDriver driver) throws IOException {
		//WebElement firstonelink=findelement(driver,readproperties("firstonee"));
		//firstonelink.click();
		
		
	//}
		
		
		
	
	

}
