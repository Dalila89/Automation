package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib6 {
	public static String GNprinttitle(WebDriver driver) {
		String value= driver.getTitle();
		return value;
		
	}
	public static WebElement findelement(WebDriver driver, String Xpath) {
		WebElement ele=driver.findElement(By.xpath(Xpath));
		return ele;
		
		
	}
	public static String readproperties(String key) throws IOException {
		File fl=new File("D:\\java\\ebay1\\loc.properties");
		FileInputStream fis= new FileInputStream(fl);
		Properties prop=new Properties();
		prop.load(fis);
		String locatr=prop.getProperty(key);
		
		return locatr ;
		
	}
	public static void takescreenshot(WebDriver driver) throws IOException {
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(scr,new File("D:\\java\\ebay1\\error.png"));
		
	}
	public static String getcurrenttime(WebDriver driver) {

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(cal.getTime());
	}




}
