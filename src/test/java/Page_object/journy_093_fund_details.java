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

public class journy_093_fund_details  extends Base_class{
public static WebDriverWait wait;
	public journy_093_fund_details(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//button[text()='next']")
    WebElement fund_details_Next_Button;
	
	
	public void Fund_Details_Next_Button() {
//		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='next']")));
//		fund_details_Next_Button.click();
		
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
