package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Auto {
	
	public Auto(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[text()='Auto ']")
	public WebElement AutoButton;
	@FindBy(xpath = "//input[@id='zipCode_overlay']")
	public WebElement ZipCode; 
	
	
	

}
