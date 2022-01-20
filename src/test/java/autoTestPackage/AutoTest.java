package autoTestPackage;

import org.testng.annotations.Test;
import basePackage.Base;
import webPages.Auto;

public class AutoTest extends Base {
	
	
	@Test
	public void autoTest() {
		Auto auto = new Auto(driver);
		auto.AutoButton.click();
		auto.ZipCode.sendKeys("10472");
		
		
	}
	

}
