package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass<homePage> {
	public WebDriver driver;
	public HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
		// First job is to recognize the location of driver from your device
		// right click on chromedriver.exe --- properties -- copy the location an paste below
		// System is a Java class and setProperty is a method of System Class
		// 1st way, to show the location of chrome driver
		// This is an absolute path
		//System.setProperty("webdriver.chrome.driver", "/Users/zubaer/eclipse-workspace/org.bellevue.nychhc/driver/chromedriver");
		// We instantiated the driver here
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.chrome.driver" ,System.getProperty("user.dir")+"/driver/chromedriver");
		//dynamic path or relative path
		//System.setProperty("webdriver.chrome.driver" ,"./driver/chromedriver");
		
		driver = new ChromeDriver();
		// maximize method is used to maximize the window -- mostly used
		driver.manage().window().maximize();
		// deleteAllCookies do delete the cookies
		driver.manage().deleteAllCookies();
		//driver.manage().window().fullscreen();
		driver.get("https://www.nychealthandhospitals.org/locations/bellevue/");
		// PageLoadTimeout is used to wait to load the page for curtain amount of time
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		// Implicitly wait is used to wait for each web element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage=new HomePage(driver);
		
	}
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
