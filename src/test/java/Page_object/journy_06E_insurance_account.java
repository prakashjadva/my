package Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base_class.Base_class;

public class journy_06E_insurance_account extends Base_class {

	public journy_06E_insurance_account(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//span[text()='Yes']")
    WebElement ans_as_yes;
	
	@FindBy(xpath = "//input[@name='EinsuranceAccNo']")
    WebElement einsuranceaccNo;
	
	@FindBy(xpath = "//button[text()='next']")
    WebElement e_insurance_Nextbutton;
	
	
	public void Q_ans_as_yes() {
		
		ans_as_yes.click();
		
	}
public void EinsuranceAccNo(String einsuranceAccno) {
		
	einsuranceaccNo.sendKeys(einsuranceAccno);
		
	}
public void E_insurance_Nextbutton() throws Exception {
	
	e_insurance_Nextbutton.click();
	Thread.sleep(3000);
	
}
}
