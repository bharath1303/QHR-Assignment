package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import okhttp3.internal.http.BridgeInterceptor;

public class openBrowser {
	
	public static WebDriver driver;

	public static void Browse(String browser) {
		try {
			if(browser.equalsIgnoreCase("Chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\owner\\workspace\\Google\\chromedriver.exe");			
				driver = new ChromeDriver();
				System.out.println("User is able to open " + browser + " browser");}
			else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", "C:\\Users\\owner\\workspace\\Google\\IEDriverServer.exe");			
				driver = new InternetExplorerDriver();
				System.out.println("User is able to open " + browser + " browser");
			}else{
				//wriet code gecko driver
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("User is not able to open chrome browser");
		}
	}

	public static void navigate() {
		try {
			driver.get("https://www.facebook.com");
			System.out.println("User is able to launch the application");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("User is not able to launch the application");
		}
	}

	public static void enterText(String xpath, String textValue){
		try{
			driver.findElement(By.xpath(xpath)).sendKeys(textValue);
			System.out.println("User is entered the value is " + textValue);
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("User is not entered the value is " + textValue);
		}
		
	}

	public static void clickButton (String xpath){
		try{
			driver.findElement(By.xpath(xpath)).click();
			System.out.println("User is able to click the button");
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("User is not able to click the button");
		}
	}
	
	public static void searchBar(String xpath){
		try{
			driver.findElement(By.xpath(xpath)).click();
			System.out.println("User is able to search the keyword");
		}catch(Exception e){
			e.printStackTrace();
		System.out.println("User is not able to search the keyword");
		}
		
	}

	public static void selectItem(String xpath, int selectValue){
		try{
			WebElement element = driver.findElement(By.xpath(xpath));
			Select select = new Select(element);
			select.selectByIndex(selectValue);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
}
