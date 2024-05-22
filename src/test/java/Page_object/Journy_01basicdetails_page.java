package Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base_class.Base_class;

public class Journy_01basicdetails_page extends Base_class  {

	public Journy_01basicdetails_page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@formcontrolname='placeOfBirth']")
    WebElement placeOfBirth;
	
	
	@FindBy(xpath = "//input[@formcontrolname='identificationMarks']")
    WebElement identificationMarks;
	
	@FindBy(xpath = "//input[@placeholder='Enter your Permanent Account Number']")
    WebElement permanent_account_number;
	
	@FindBy(xpath = "//button[text()='next']")
    WebElement next_button;
	
	
	public void PlaceofBirth(String placeofbirth) {
	        placeOfBirth.sendKeys(placeofbirth);
		
	}
	public void IdentificationMarks(String identificationmarks) {
		identificationMarks.sendKeys(identificationmarks);
	
	}
	public void Permanent_Account_NO(String permanent_acc_no) {
		permanent_account_number.sendKeys(permanent_acc_no);

}
	
	public void Next_Button() {
		
		next_button.click();
	}
	
	
	}
