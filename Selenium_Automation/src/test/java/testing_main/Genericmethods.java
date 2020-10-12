package testing_main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.SearchPageObjects;
import setup.ExcelPage;
import setup.SetupPage;

public class Genericmethods extends SetupPage{
	public void enterfrom() throws InterruptedException
	{
		try {
		WebElement from=driver.findElement(SearchPageObjects.fromsearchbox);
		from.sendKeys(ExcelPage.data(0,0));
		Thread.sleep(1000);
		from.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	public void enterto() throws InterruptedException
	{
		try {
		WebElement to=driver.findElement(SearchPageObjects.tosearchbox);
		to.sendKeys(ExcelPage.data(0,1));
		Thread.sleep(1000);
		to.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(1000);
		
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	public void depdateselect() throws InterruptedException
	{
		try {
			WebDriverWait wait=new WebDriverWait(driver, 20);
			WebElement depdate=driver.findElement(SearchPageObjects.departuredate);
			depdate.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='fare_20201016']")));
			WebElement depdatetext=driver.findElement(SearchPageObjects.dateselection);
			depdatetext.click();
			
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	public void search() throws InterruptedException
	{
		try {
			WebDriverWait wait=new WebDriverWait(driver, 20);
			WebElement searchbutton=driver.findElement(SearchPageObjects.searchbutton);
			searchbutton.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='fltHpyResults intRnd']")));
			Thread.sleep(3000);
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	public String getprice() throws InterruptedException
	{
		
		try {
//			String price=null;
			String price=driver.findElement(By.xpath("(//span[@class='ico20 fb quicks'])[1]")).getText();
			System.out.println(price);
			return price;
			
		}catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
	}

}
