package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.Lib6;

public class NListedPage extends Lib6{
	public static void lis(WebDriver driver) throws IOException {
		WebElement firstonelink=findelement(driver,readproperties("firstonee"));
		firstonelink.click();
		
		
	}
	

}
