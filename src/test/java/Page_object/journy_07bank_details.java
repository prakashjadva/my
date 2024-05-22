package Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base_class.Base_class;

public class journy_07bank_details extends Base_class{

	public journy_07bank_details(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//input[@placeholder='IFSC Code']")
    WebElement ifsc_Code;
	
	@FindBy(xpath = "//select[@name='accountType']")
    WebElement account_type;
	
	@FindBy(xpath = "//input[@formcontrolname='BankAccountNumber']")
    WebElement accountno;
	
	@FindBy(xpath = "//button[@id='btnPolicyNext']")
    WebElement bank_nextbutton;
	
	
	public void IFSC_Code(String ifsc_code) throws Exception {
		
		 ifsc_Code.sendKeys(ifsc_code);
	Thread.sleep(3000);
	}
	public void Account_NO(String Acco_no) throws Exception {
		
		accountno.sendKeys(Acco_no);
		Thread.sleep(2000);
		
	}
	
   public void Bank_NextButton() {
	   
	bank_nextbutton.click();
		
		
	}
	

	
}
