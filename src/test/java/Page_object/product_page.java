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

public class product_page extends Base_class {
	 public static WebDriverWait wait;
	
	public product_page(WebDriver driver) {
		super(driver);
		
	}
	//Element
			@FindBy(xpath = "/html/body/app-root/body/app-layout/app-header/header/div[2]/div[1]/div[3]/img")
			WebElement certificate;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/app-header/header/div[2]/div[3]/h4/span/img")
			WebElement certificate_close;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/app-header/header/div[2]/a[2]")
			WebElement brochure;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/app-header/header/div[2]/a[4]")
			WebElement talk_to_an_Expert;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/app-header/header/div[2]/a[3]")
			WebElement bi;
			
			@FindBy(id = "mob")
			WebElement mono;
			
			@FindBy(xpath = "//input[@placeholder='Email Address']")
			WebElement email;
			
			@FindBy(xpath = "//select[@formcontrolname='payTerm']")
			WebElement payfor;
			
			@FindBy(xpath = "//select[@placeholder='Withdraw After*']")
			WebElement wa;
			
			@FindBy(xpath = "//input[@placeholder='Investment Amount*']")
			WebElement ia;
			
			@FindBy(xpath = "//select[@placeholder='Mode of Premium*']")
			WebElement mop;
			
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[2]/app-insured-details/form/div[2]/div/div[6]/div/select")
			WebElement rs;
			
			@FindBy(id = "fullName")
			WebElement name;
			
			@FindBy(id = "mob")
			WebElement mobile;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[1]/app-investment-calculation/div/div[1]/div[2]/span/a")
			WebElement kyp;
			
			@FindBy(id = "freeBenefits")
			WebElement is;
			
			@FindBy(id = "lifeStageBenefits")
			WebElement ic;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[1]/app-investment-calculation/div/div[1]/div[2]/app-kyps/div/div/ul/li[2]")
			WebElement fp;
			
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[1]/app-investment-calculation/div/div[1]/div[2]/app-kyps/div/div/div[1]/span[2]/img")
			WebElement close;
			
			@FindBy(xpath = "//input[@id='fullName']")
			WebElement name11;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[2]/app-insured-details/form/div[2]/div/div[2]/div/label[2]/span[1]")
			WebElement malegender;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[2]/app-insured-details/form/div[2]/div/div[2]/div/label[3]/span[1]")
			WebElement femalegender;
			
			@FindBy(name = "date")
			WebElement dob;
			
			@FindBy(xpath = "//button[@class='btn btn-primary']")
			WebElement pbutton1;
			

			@FindBy(xpath = "//select[@name='insuredEducation']")
			WebElement eq;

			@FindBy(xpath = "//select[@name='insuredOccupation']")
			WebElement occupation;

			@FindBy(xpath = "//input[@name='insuredPincode']")
			WebElement pincode;

			@FindBy(xpath = "//input[@name='insuredIncome']")
			WebElement income;
			
			@FindBy(xpath = "//button[@class='btn btn-primary']")
			WebElement pbutton2;
			
			
			public void Certificate ()  {		
			certificate.click();
			
			}	
			public void Certificate_close ()  {		
				certificate_close.click();
			
			}
			public void Brochure ()  {		
				brochure.click();
}
			public void Talk_to_an_Expert ()  {	
				wait=new WebDriverWait(driver,Duration.ofSeconds(20));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/body/app-layout/app-header/header/div[2]/a[4]")));
				talk_to_an_Expert.click();
}
			public void BI ()  {
				wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/body/app-layout/app-header/header/div[2]/a[3]")));
				bi.click();
				
				}
			public void Email ()  {		
				email.isEnabled();
				
			}
			public void MONO ()  {		
				mono.isEnabled();
				}
			public void Pay_For ()  {		
				payfor.isEnabled();
				
}
			public void WA ()  {		
				wa.isEnabled();
			}
			public void IA ()  {
				ia.isEnabled();
			}
			public void RS ()  {
				rs.isEnabled();
			}
			public void Name ()  {
				name.isEnabled();
			}
			public void Mobile ()  {
				wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(By.id("mob")));
				mobile.isEnabled();
			}
			public void KYP ()  {
				wait=new WebDriverWait(driver,Duration.ofSeconds(15));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/body/app-layout/div/div/div[1]/div/div[1]/app-investment-calculation/div/div[1]/div[2]/span/a")));
				kyp.click();
				
				
				
			}
			
			public void IS ()  {
				is.click();
			}
			public void IC ()  {
				ic.click();
			}
			public void FP ()  {
				fp.click();
			}
			public void Close ()  {
				close.click();
			}

            public void Name1() throws InterruptedException  {
            	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		        wait.until(ExpectedConditions.elementToBeClickable(name11));
		        Thread.sleep(3000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].value = '';", name11);
				Thread.sleep(3000);
				name11.sendKeys("Bajaj test");
            
            }
			public void MaleGender ()  {
				malegender.click();
			}
			public void FemaleGender ()  {
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		        wait.until(ExpectedConditions.elementToBeClickable(femalegender));
				femalegender.click();	
			}
			public void Dob ()  {
				dob.sendKeys("10101996");
			}


           public void Mobile1 () throws Exception  {
 
          	 Thread.sleep(3000);
	         JavascriptExecutor js = (JavascriptExecutor) driver;
	         js.executeScript("arguments[0].value = '';", mobile);
	          mobile.sendKeys("8888888888");
	
}
			public void Email1 () throws Exception  {

				Thread.sleep(4000);
			    JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].value = '';", email);
				email.sendKeys("test@12.com");
						Thread.sleep(4000);
		        email.clear();
		        Thread.sleep(4000);
		        email.sendKeys("test@12.com");
			
}
			public void IA1() throws Exception {
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(ia));
				ia.clear();
				ia.sendKeys("20000");
				
			}
			
            public void Pay_For1() throws Exception {
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(payfor));
				Select pf=new Select(payfor);
				pf.selectByValue("7");
				
            }
            public void WA1() throws Exception {
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(wa));
				Select Wa=new Select(wa);
				Wa.selectByValue("15");
				
			}
            
           public void MOP() throws Exception {
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(mop));
				Select Mop=new Select(mop);
				Mop.selectByValue("4");
				
			}
           
           public void PButton1 ()  {
				pbutton1.click();
			}
           public void EQ() throws Exception {
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(eq));
				Select Mop=new Select(eq);
				Mop.selectByValue("2");
				
			}
           public void Occupation() throws Exception {
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(occupation));
				Select Mop=new Select(occupation);
				Mop.selectByValue("9");
				
			}
           public void PinCode ()  {
				pincode.sendKeys("122003");
			}
           public void Income ()  {
				income.sendKeys("500000");
			}
           
           public void PButton2 ()  {
				pbutton2.click();
			}
}	
				