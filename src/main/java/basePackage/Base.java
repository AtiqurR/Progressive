package basePackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anik\\eclipse-workspace\\Progressive\\src\\main\\resources\\drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.progressive.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
//	@AfterMethod
//	public void tearUp() {
//		driver.quit();
//	}
	

}
