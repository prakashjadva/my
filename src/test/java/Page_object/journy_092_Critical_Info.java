package Page_object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_class.Base_class;

public class journy_092_Critical_Info extends Base_class {
public static WebDriverWait wait;
	public journy_092_Critical_Info(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//button[text()='next']")
    WebElement Critical_info_Next_Button;

	
	
	public void Critical_Next_Button() {
//		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='next']")));
//		Critical_info_Next_Button.click();
		
		
		WebElement element = driver.findElement(By.xpath("//button[text()='next']"));

		int attempts = 0;
		while (attempts < 2) {
		    try {
		        element.click();
		        break;
		    } catch (StaleElementReferenceException e) {
		        // Re-locate the element
		        element = driver.findElement(By.xpath("//button[text()='next']"));
		    }
		    attempts++;
		}
		
	}
}
