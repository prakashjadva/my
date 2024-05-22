package Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Base_class.Base_class;

public class journy_02family_details extends Base_class{

	public journy_02family_details(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//select[@formcontrolname='maritalStatus']")
    WebElement marital_status;
	
	@FindBy(name = "maidenFullName")
    WebElement maidenFullName;
	
	@FindBy(name = "spouseName")
    WebElement spouseName;
	
	@FindBy(name = "txtSpouseName")
    WebElement life_cover_husband;
	
	@FindBy(id = "txtFatherName")
    WebElement father_name;
	
	@FindBy(id = "txtMotherName")
    WebElement mother_name;
	
	@FindBy(xpath = "//button[text()='next']")
    WebElement next_button_family_details;
	
	public void Marital_Status() {
		Select mt=new Select(marital_status);
		mt.selectByValue("7");
		
	}
	
	public void Maiden_Name(String Maidenname) {
		
		maidenFullName.sendKeys(Maidenname);
		
	}
public void SpouseName(String SpouseName) {
		
	spouseName.sendKeys(SpouseName);
		
	}
public void Life_Cover_Husband(String Life_cover_husband) {
	
	life_cover_husband.sendKeys(Life_cover_husband);
	
}
public void Father_Name(String FatherName) {
	
	father_name.sendKeys(FatherName);
	
}
public void Mother_Name(String MotherName) {
		
		mother_name.sendKeys(MotherName);
		
	}
 public void Next_Button_Family_Details() {
	
	next_button_family_details.click();
	
}
	

}
