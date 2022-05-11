package Utility.passwd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase_Passwd {
	
	public static WebDriver driver;
	public static Properties doo;
	
	public TestBase_Passwd() {
		
	doo = new Properties();
	
	try {
		FileInputStream fls= new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\config\\passwd\\Passwd.properties");
		
		doo.load(fls);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	public void initil() {
		String browserName = doo.getProperty("browser");
		
		if(browserName.equals("CC")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\Driver\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Util_Passwd.page_Load_Timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Util_Passwd.implicitly_Wait, TimeUnit.SECONDS);
			System.out.println("This is Chrome Browser");
		}
		else if(browserName.equals("FF"));
		
		
		
		
	}
	public static void getURL(String URL) {
		
		driver.get(doo.getProperty("PassURL"));
		
		
		
	}
	
}
