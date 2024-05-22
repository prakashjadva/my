package Page_object;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Base_class.Base_class;

public class journy_05nominee_details extends Base_class {

	public journy_05nominee_details(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//select[@name='salutation']")
    WebElement salutation;
	
	@FindBy(xpath = "//input[@placeholder='Full Name*']")
    WebElement nominee_fullname;
	
	@FindBy(xpath = "//select[@formcontrolname='relationShip']")
    WebElement nominee_relationship;
	
	@FindBy(xpath = "//input[@name='date']")
    WebElement ndob;
	
	@FindBy(xpath = "//input[@name='percentage']")
    WebElement percentage;
	
	@FindBy(xpath = "//input[@name='mobile']")
    WebElement mobile;
	
	@FindBy(xpath = "//input[@name='email']")
    WebElement no_email;
	
	@FindBy(xpath = "//select[@name='maritalStatus']")
    WebElement no_maritalStatus;
	
	@FindBy(xpath = "//button[text()='next']")
    WebElement no_nextbutton;
	
	

	public void Salutaion() {
		
		Select sa=new Select(salutation);
		sa.selectByValue("14");
	
	}
	public void Nominee_FullName(String Nfullname) {
		
		nominee_fullname.sendKeys(Nfullname);
		
	}
  public void Nominee_Relationship() {
		
		Select re=new Select(nominee_relationship);
		re.selectByValue("89");
}
  
  public void Nominee_DOB(String N_DOB) {
		
	  ndob.sendKeys(N_DOB);
		
	}
  
  public void Nominee_Percentage(String No_percentage) {
		
	  percentage.sendKeys(No_percentage);
		
	}
  
  public void Nominee_Mobile(String No_mobile) {
	  System.out.print(No_mobile);
		
	  mobile.sendKeys(No_mobile);
		
	}
  
  public void Nominee_Email(String No_email) {
		
	  no_email.sendKeys(No_email);
		
	}
  public void Nominee_Maritalstatus() {
		
		Select MS=new Select(no_maritalStatus);
		MS.selectByValue("7");
}
  
  public void No_NextButton() {
	  no_nextbutton.click();
  }

}
