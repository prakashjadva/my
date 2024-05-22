package Page_object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_class.Base_class;

public class journy_094_fund_allocation  extends Base_class{
public static WebDriverWait wait;
	public journy_094_fund_allocation(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@formcontrolname='otp']")
    WebElement otp;
	
	@FindBy(xpath = "//button[text()='Verify']")
    WebElement otp_verify_button;
	
	@FindBy(xpath = "//button[text()='next']")
    WebElement fund_Allocation_Next_Button;
	
	public void OTP(String otpvalue) throws Exception {
		
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)", "");
		
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='otp']")));
	    
		otp.sendKeys(otpvalue);
	
	}
	
	public void OTP_Verify_Button() {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)", "");
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(otp_verify_button));
		
		 JavascriptExecutor executor = (JavascriptExecutor) driver;
	      executor.executeScript("arguments[0].click();", otp_verify_button);
		//otp_verify_button.click();
		
	}
	
	public void Fund_Allocation_Next_Button() {
		
		//fund_Allocation_Next_Button.click();
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