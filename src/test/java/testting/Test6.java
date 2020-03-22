package testting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.EbayHomePage;

import pages.SearchResultPage;


public class Test6 {
	public WebDriver driver;
	@Before
	public void initialize() {
		
	
	System.getProperty("WebDriver.Chrome.driver", "D:\\java\\ebay1\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@org.junit.Test
	public void testtt() throws InterruptedException, IOException {
		System.out.println("This is a facebook page test!!!!");
		EbayHomePage.printebaytitle(driver);
		EbayHomePage.searchxbox(driver);
		//Thread.sleep(2000);
		
		
		SearchResultPage.sorting(driver);
		SearchResultPage.listclick(driver);
        Thread.sleep(4000);
       // System.out.println("this is before sortby");
       
        //System.out.println("this is after sortby");
       // Thread.sleep(4000);
}
	@After
	public void teardown() {
		System.out.println("the test is finished!!!!!!");
		driver.manage().deleteAllCookies();
		driver.close();
		
	}
}
