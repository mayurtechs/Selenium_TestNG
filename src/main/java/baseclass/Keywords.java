package baseclass;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import constants.Constant;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Keywords extends Constant {

public static void openBrowser(String browserName)
{
	switch(browserName)
	{
	case "Chrome" :
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
	case "Firefox" :
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
	case "MS-Edge" :
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;
	default : System.out.println("Entered wrong browserName:"+browserName);	
	}
}

public static void impilcitWait()
{
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
}

public static void assertion(String locaterValue, String texts)
{
	String actualText = driver.findElement(By.xpath(locaterValue)).getText();
	String ExpectedText = texts;
	Assert.assertEquals(actualText, ExpectedText);
	
	
}
public static void openUrl(String url)
{
	driver.get(url);
}

public static void maximizeBrowser()
{
	driver.manage().window().maximize();
}

public static void closeBrowser()
{
	driver.close();
}
 
public static void quitBrowser()
{
	driver.quit();
}

}
