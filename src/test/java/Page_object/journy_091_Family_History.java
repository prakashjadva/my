package Page_object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_class.Base_class;

public class journy_091_Family_History extends Base_class{
	public static WebDriverWait wait;
	public journy_091_Family_History(WebDriver driver) {
		super(driver);
	
	}
	 
    
	@FindBy(xpath = "//button[text()='next']")
    WebElement Family_History_next_button;

	
	public void Family_History_next_button() {
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='next']")));
		Family_History_next_button.click();
		
	}
	
}
