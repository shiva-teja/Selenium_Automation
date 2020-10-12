package pageObjects;

import org.openqa.selenium.By;

import setup.ExcelPage;

public class SearchPageObjects {
//	public static String depdate="fare_"+ExcelPage.data(0,2);
	public static final By fromsearchbox=By.xpath("//input[@id='gosuggest_inputSrc']");
	public static final By tosearchbox=By.xpath("//input[@id='gosuggest_inputDest']");
	public static final By departuredate=By.xpath("//input[@id='departureCalendar']");
	public static final By returndate=By.xpath("//input[@id='returnCalendar']");
	public static final By dateselection=By.xpath("//div[@id='fare_20201016']");
	public static final By searchbutton=By.xpath("//button[@id='gi_search_btn']");
	

}
