package Page_object;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_class.Base_class;

public class Payment_page extends Base_class {
	public static WebDriverWait wait;
	public Payment_page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "4")
    WebElement bankname;
	
	@FindBy(id="paynb")
	WebElement paynb;
	
	@FindBy(xpath="//button[text()='Success']")
	WebElement Successbutton;
	 
	@FindBy(id="netbanking")
    WebElement netbanking;
	
	
	@FindBy(id="otherbank")
    WebElement otherbank;
	
	@FindBy(id="acc-number")
    WebElement accountnumber;
	
	@FindBy(id="confirm-acc-number")
    WebElement confirm_acc_number;
	
	@FindBy(id="acc-ifcs-code")
    WebElement acc_ifcs_code;
	
	@FindBy(id="acc-holder-name")
    WebElement acc_holder_name;
	
	@FindBy(id="mobile-number")
    WebElement mobile_number;
	
	
	@FindBy(xpath="(//button[@class='register-autopay btn'])[1]")
    WebElement autopay;
	
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[4]/form/div[4]/div")
    WebElement authenticate;
	
	
	@FindBy(xpath="//button[@type='submit']")
    WebElement submitbutton;
	
	 public void BankName() {
		 bankname.click();
	    }
	 
	 public void PayNb() {
		 paynb.click();
	    }
	 
	 public void SuccessButton() {
	 Successbutton.click();
	    }
	 
	 public void NetBanking() {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
	      wait.until(ExpectedConditions.visibilityOf(netbanking));
		 netbanking.click();
	    }
	 
	 public void OtherBank() {
		 
		 Select Otherbank = new Select(otherbank);
		 otherbank.click();
		 Otherbank.selectByValue("UTIB");
		 
	    }
	 
	 public void AccountNumber(String accountno) {
		 accountnumber.sendKeys(accountno);
		 
	    }
	 
	 
	 public void Confirm_AccountNumber(String canaccountno) {
		 confirm_acc_number.sendKeys(canaccountno);
		 
	    }
	 
	 public void IFSC_Code(String ifsc) {
	 acc_ifcs_code.sendKeys(ifsc);
		 
		 
	    }

	 public void Account_Ho_Name(String Acc_HO_Name) {
		 acc_holder_name.sendKeys( Acc_HO_Name);
			 
	
	
	 }
	 public void Mobile_Number(String Mobilenumber) {
		 mobile_number.sendKeys( Mobilenumber);
		 
}
	 public void AutoPay() throws Exception {
		 autopay.click();
		 
		  Thread.sleep(2000);  
		  driver.switchTo().frame(0);
		    }
	 
	 public void Authenticate() throws Exception {
		 
		 
		 authenticate.click();
		 
		 String parent=driver.getWindowHandle();

		  Set<String>s=driver.getWindowHandles();

		 
		  Iterator<String> I1= s.iterator();

		  while(I1.hasNext())
		  {

		  String child_window=I1.next();


		  if(!parent.equals(child_window))
		  {
		  driver.switchTo().window(child_window);

		  System.out.println(driver.switchTo().window(child_window).getTitle());
		  
		  
		  wait=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/form/button[1]")));
		  
		  driver.findElement(By.xpath("/html/body/form/button[1]")).click();
		  
		  Thread.sleep(2000);
		  }
		  
		  }
		  driver.switchTo().window(parent);
	    }
	 public void SubmitButton() throws Exception {
		 
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
	      Thread.sleep(1000);
	      
	      JavascriptExecutor executor = (JavascriptExecutor) driver;
	      executor.executeScript("arguments[0].click();", submitbutton);
		// submitbutton.click();
		 Thread.sleep(3000);
		 
	    }
	 
	 
	 
}
