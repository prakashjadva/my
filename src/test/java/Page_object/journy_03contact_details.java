package Page_object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_class.Base_class;

public class journy_03contact_details extends Base_class{

	public journy_03contact_details(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@placeholder='Mailing Address Line1*']")
    WebElement mailing_address_line1;
    
	@FindBy(xpath = "//input[@placeholder='Mailing Address Line2*']")
    WebElement mailing_address_line2;
	
	@FindBy(xpath = "(//input[@placeholder='Landmark*'])[1]")
    WebElement maillandmark;
	
	@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[2]/div/app-contact/form/div[1]/div/div[1]/div/div[7]/div/app-select-dropdown/div/input")
    WebElement pincode;
	
	@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[2]/div/app-contact/form/div[1]/div/div[1]/div/div[7]/div/app-select-dropdown/div/div/ul/li[1]")
    WebElement pincodevalue;
	
	@FindBy(xpath = "//span[@class='CheckBoxTick']")
    WebElement checkbox;
	
	@FindBy(id = "txtPermanentAddress")
    WebElement permanent_add_line1;
	
	@FindBy(id = "txtPermanentAddress2")
    WebElement permanent_add_line2;
	
	@FindBy(xpath = "(//input[@placeholder='Landmark*'])[2]")
    WebElement permanent_landmark;
	
	@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[2]/div/app-contact/form/div[1]/div/div[5]/div/div/div[6]/div/app-select-dropdown/div/input")
    WebElement permanent_pincode;

	 
	@FindBy(xpath ="/html/body/app-root/body/app-layout/div/div/div[2]/div/app-contact/form/div[1]/div/div[5]/div/div/div[6]/div/app-select-dropdown/div/div/ul/li[2]")
    WebElement perpincode_value;
	
	@FindBy(xpath = "//button[text()='next']")
    WebElement contact_next_button;
	
	
	public void Mail_Address_Line1(String mailaddressline1) {
		mailing_address_line1.sendKeys(mailaddressline1);
		
	}

	public void Mail_Address_Line2(String mailaddressline2) {
		mailing_address_line2.sendKeys(mailaddressline2);

	
}

	public void Landmark(String Landmark) throws Exception {
		maillandmark.sendKeys(Landmark);
		Thread.sleep(1000);
		
	
	}
	public void PinCode() throws Exception {
		
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView;", pincode);
		//pincode.click();
	//	pincodevalue.click();
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pincode);
	    Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pincode));
        pincode.click();
        Thread.sleep(1000);
        pincodevalue.click();
        
}

	public void CheckBox () {
		checkbox.click();
	
	}
	
	public void Permanent_Address_Line1 (String permanentaddressline1) {
		
		permanent_add_line1.sendKeys(permanentaddressline1);
	}
	

	public void Permanent_Address_Line2 (String permanentaddressline2) {
		
		permanent_add_line2.sendKeys(permanentaddressline2);
	}
	
   public void Permanent_Landmark (String permanentlandmark) {
		
	permanent_landmark.sendKeys(permanentlandmark);
	
	}
   
   public void Permanent_Pincode () throws Exception {
		
	   
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", permanent_pincode);
	    Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.elementToBeClickable(permanent_pincode));
       permanent_pincode.click();
       Thread.sleep(1000);
       perpincode_value.click();
	
       
       
      
		}
   
   public void Contact_Next_Button () {
	   contact_next_button.click();
	
	}
	  
   
	}
