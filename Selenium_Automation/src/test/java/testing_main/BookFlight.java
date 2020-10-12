package testing_main;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObjects.SearchPageObjects;
import setup.ExcelPage;
import setup.SetupPage;

public class BookFlight extends SetupPage{

	@BeforeTest
	public void prereq() throws EncryptedDocumentException,IOException{
		SetupPage.SetupPages();
		ExcelPage.excel();
	}
	@org.testng.annotations.Test
	public void test() 
	{
		try {

			Genericmethods gm=new Genericmethods();
			gm.enterfrom();
			gm.enterto();
			Thread.sleep(3000);
			gm.depdateselect();
			gm.search();
			Thread.sleep(3000);
			gm.getprice();

			Thread.sleep(6000);

		}
		catch (Exception e) {
			System.out.println(e);
		}

	}
	@AfterTest
	public void end()
	{
		driver.close();
		driver.quit();
	}

}
