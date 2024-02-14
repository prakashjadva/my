package Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Base_class.Base_class;

public class quote_page extends Base_class {

	public quote_page(WebDriver driver) {
		super(driver);		
	}
//Element
	@FindBy(id = "txtCustomerName")
	WebElement usename;
	@FindBy(id = "txtMobileNo")
	WebElement mob;
	@FindBy(id ="txtEmail")
	WebElement email;
	
	@FindBy(xpath = "//button[text()='View Plans']")
	WebElement viewplans;
	
	@FindBy(xpath ="(//button[@id='btn_317'])")
	//(//button[@id='btn_47729'])")
	WebElement plan1;
	//(//button[@id='btn_74902'])[1]
	
	@FindBy(xpath = "//button[@class='ng-tns-c3767660653-3 ng-star-inserted']")
	WebElement proceed;
	
//ActionMethod
	
	public void username(String name) {
		usename.sendKeys(name);
	}
	public void mobi(String no) {
		mob.sendKeys(no);
	}
	public void mail(String Email) {
		email.sendKeys(Email);
	}
	public void Viewplans() {
		viewplans.click();
	}
	public void Plan()  {		
		plan1.click();
		
	}
	public void Proceed() {
		proceed.click();
	}
}
