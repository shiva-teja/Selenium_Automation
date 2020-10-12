package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupPage {
public static WebDriver driver;
	
	public static void SetupPages()
	{
		String usrdir=System.getProperty("user.dir");
		System.out.println(usrdir);
		System.setProperty("webdriver.chrome.driver", usrdir+"/drivers/chrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.goibibo.com");
		driver.manage().window().maximize();
	}

}
