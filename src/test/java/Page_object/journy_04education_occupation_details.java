package Page_object;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_class.Base_class;

public class journy_04education_occupation_details extends Base_class {

	public journy_04education_occupation_details(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//select[@formcontrolname='insuranceObjective']")
    WebElement insuranceObjective;
	
	@FindBy(xpath = "//select[@formcontrolname='education']")
    WebElement education;
	
	@FindBy(xpath = "//select[@formcontrolname='occupation']")
    WebElement occupation;
	
	@FindBy(xpath = "//input[@placeholder='Name of present Employer/Business']")
    WebElement employer_business;
	
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
    WebElement designation;
	
	@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[2]/div/app-education-occupation/form/div[1]/div/div[1]/div[5]/div/app-select-dropdown/div/div/ul/li[2]")
    WebElement seniermanager;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
    WebElement industry;
	
	@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[2]/div/app-education-occupation/form/div[1]/div/div[1]/div[6]/div/app-select-dropdown/div/div/ul/li[1]")
    WebElement Autoancylary;
	
	@FindBy(xpath = "//select[@name='occupationCategory']")
    WebElement occupation_category;
	
	@FindBy(xpath = "//select[@name='natureOfDuty']")
    WebElement nature_ofduty;
	
	@FindBy(xpath = "//input[@placeholder='*Workplace Address']")
    WebElement workplace_address;
	
	@FindBy(xpath = "//input[@placeholder='*Workplace City']")
    WebElement workplace_city;
	
	@FindBy(xpath = "//input[@placeholder='Enter Your Annual Income']")
    WebElement annual_income;
	
	@FindBy(xpath = "//button[@class='btn btn-primary']")
    WebElement Education_nextbutton;
	
	
	public void InsuranceObjective() {
		
		Select IO=new Select(insuranceObjective);
		
		IO.selectByValue("1");
		
	}
	
public void Education() {
		
		Select edu=new Select(education);
		
		edu.selectByValue("27"); 
		
	}

public void Occupation() {
	
	Select occu=new Select(occupation);
	
	occu.selectByValue("56"); 
}
	public void Employer_Business(String employerbusiness ) {
		employer_business.sendKeys(employerbusiness);
		
	}

	public void Designation( ) throws Exception {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", designation);
	    Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.elementToBeClickable(designation));
       designation.click();
       Thread.sleep(1000);
       seniermanager.click();
		
		
	}
	
	public void Industry( ) throws Exception {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", industry);
	    Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.elementToBeClickable(industry));
       industry.click();
       Thread.sleep(1000);
       Autoancylary.click();
 
	}
	public void Occupation_Category() {
		
		Select OC=new Select(occupation_category);
		OC.selectByValue("1");
	}
	
public void nature_ofduty() {
		
		Select ND=new Select(nature_ofduty);
		ND.selectByValue("13");
	}

public void Workplace_Address(String workplace_addresss) {
	workplace_address.sendKeys(workplace_addresss);
	
}

public void Workplace_City(String workplace_cityy) {
	workplace_city.sendKeys(workplace_cityy);
	
}
public void Annual_Income(String Annual_income) {
	annual_income.sendKeys(Annual_income);
	
}
public void Education_NextButton() {
	Education_nextbutton.click();
	
	
}
}
