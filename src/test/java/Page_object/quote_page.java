package Page_object;

import java.io.IOException;
import java.time.Duration;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_class.Base_class;
import Utilities.Excelutilities;

public class quote_page extends Base_class {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	public static WebDriverWait wait;
    public quote_page(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this); 
        
    }
    
    
    
    //                    ............................Prequote  Xpaths Details.......................
    @FindBy(id = "txtCustomerName")
    WebElement usename;
    @FindBy(id = "txtMobileNo")
    WebElement mob;
    @FindBy(id = "txtEmail")
    WebElement email;
    @FindBy(xpath = "//button[text()='View Plans']")
    WebElement viewplans;
    
    @FindBy(xpath = "/html/body/app-root/app-ulip-prequote-lite/div[2]/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div/label")
    WebElement Country_Drp;
    @FindBy(xpath = "/html/body/app-root/app-ulip-prequote-lite/div[2]/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/ul/li[2]")
    WebElement NRI_UAE;
    @FindBy(xpath = "/html/body/app-root/app-ulip-prequote-lite/div[2]/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/ul/li[1]")
    WebElement India;
    @FindBy(xpath = "//button[text()='Proceed']")
    WebElement proceed;
    
    

   //.....................................   Prequote Action Method............................................
    
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
    public void Proceed() {
        proceed.click();
    }
    
    public void SelectCountry(String Country) throws InterruptedException {
        String CountryName = Country;
        if (Country.equals("NRI")) {
            // Select NRI country
        	Country_Drp.click();
        	NRI_UAE.click();
           
        } else if(Country.equals("India")){
            // Select  India as country
        	Country_Drp.click();
        	India.click();
        }
    }
    
    //.................................Plan xpaths .........................................
    
    //................................Market linked All plans................................
 // CG
    @FindBy(xpath = "/html/body/app-root/app-quotes/div[2]/div[1]/div[2]/div[1]/div[2]/app-ulip-card/div/div[1]/div[1]/span")
    WebElement CGscroll;
                
    @FindBy(id = "btn_47704")
    WebElement cg;
 // Sampoorn Nivesh             
    @FindBy (xpath = "//span[text()='High Life Cover']")            
    WebElement SNscroll;
    @FindBy(id = "btn_227")
    WebElement Sampoorn_Nivesh;
 //Click2Invest
    @FindBy(xpath = "/html/body/app-root/app-quotes/div[2]/div[1]/div[2]/div[1]/div[2]/app-ulip-card/div/div[3]/div[2]/div[1]/a")
    WebElement Click2Invest_Scroll;
    @FindBy(id = "btn_79190")
    WebElement Click2Invest;
//Sampoorn_Nivesh_Classic_Waiver_Benefit
    @FindBy(xpath = "/html/body/app-root/app-quotes/div[2]/div[1]/div[2]/div[1]/div[2]/app-ulip-card/div/div[3]/div[6]/div[3]")
    WebElement Ne_Sampoorn_Nivesh_Classic_Waiver_Benefit ;
    @FindBy(id = "btn_238")
    WebElement Sampoorn_Nivesh_Classic_Waiver_Benefit ;
    @FindBy(xpath= "/html/body/app-root/app-quotes/div[2]/div[1]/div[2]/div[1]/div[2]/app-ulip-card/div/div[3]/div[3]/div[2]/div[1]/a")
    WebElement Scroll_Sampoorn_Nivesh_Classic_Waiver_Benefit;
    
    //................................Guranteed Return plan->Lumpsum................................
//Sanchay Plus
    @FindBy(xpath = "(//button[@id='btn_300'])[2]")
    WebElement Sanchay_Plus;  
    @FindBy(id = "btn_396")
    WebElement Sanchay_Plus_Scroll;
    @FindBy(xpath = "/html/body/app-root/app-quotes/div[2]/div[1]/div[2]/div[1]/div[1]/div/button[2]/span")
    WebElement Market_Linked; 
    @FindBy(xpath = "/html/body/app-root/app-quotes/div[1]/div[1]/div[2]/div/div[1]/em")
    WebElement Plan_type_Guaranteed_return; 
    
//Sanchay Fixed Maturity Plan
    @FindBy(xpath = "(//div[contains(@class, 'moreplan_box ng-tns-c3362395671-3 ng-star-inserted')])[5]")  //[7] for indian
    WebElement Sanchay_Fixed_Maturity_Plan_open;                                                           // [5] for NRI
    
    @FindBy(xpath = "(//button[@id='btn_11133'])[2]")
    WebElement Sanchay_Fixed_Maturity_Plan; 
    
    //................................Guranteed Return plan->Income for Long Term................................
//Guaranteed Wealth Plus-Income variant
    
    @FindBy(xpath = "/html/body/app-root/app-quotes/div[2]/div[1]/div[2]/div[1]/div[1]/div/div/trad-money-return-ways/div[2]/div[3]")
    WebElement Lumpsum_click;
    @FindBy(xpath = "/html/body/app-root/app-quotes/div[2]/div[1]/div[2]/div[1]/div[1]/div/div/trad-money-return-ways/div[3]/label[4]/div/div/span")
    WebElement Income_for_Long_Term_click;
    
 
    @FindBy(xpath= "/html/body/app-root/app-quotes/div[2]/div[1]/div[2]/div[1]/div[2]/app-trad-card/div/div[1]/div/div[5]/div[1]/div[1]/ul/li[4]/button")
    WebElement Guaranteed_Wealth_Plus_Income_variant_Scroll;
    @FindBy(xpath= "(//button[@id='btn_77211'])[2]")
    WebElement Guaranteed_Wealth_Plus_Income_variant;
    
//Guaranteed Income Insurance Plan 
    
    @FindBy(xpath= "/html/body/app-root/app-quotes/div[2]/div[1]/div[2]/div[1]/div[2]/app-trad-card/div/div[1]/div/div[10]/div[2]/div[3]")
    WebElement Guaranteed_Income_Insurance_Plan_open;
    @FindBy(xpath= "(//button[@id='btn_45518'])[2]")
    WebElement Guaranteed_Income_Insurance_Plan;
    
//Sanchay Par Advantage - Immediate Income
    
    @FindBy(xpath= "(//button[@id='btn_320'])[2]")
    WebElement Sanchay_Par_Advantage_Immediate_Income;
    
    
    
    public void select_plan(String plan) throws InterruptedException {
        String planname = plan;
        if (plan=="cg") {
        	Thread.sleep(3000);
        	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 700);");
            Thread.sleep(3000);
			cg.click();
        } else if (plan=="sn") {
          js.executeScript("arguments[0].scrollIntoView();", SNscroll);
            Thread.sleep(5000);
            Sampoorn_Nivesh.click();
        } else if (plan.equals("Click2Invest")) {
        	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 700);");
            Thread.sleep(5000);
            Click2Invest.click();
        } else if (planname.equals("Sampoorn Nivesh - Classic Waiver Benefit")) {
        	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300);");
        	Thread.sleep(5000);
        	Ne_Sampoorn_Nivesh_Classic_Waiver_Benefit.click();
        	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300);");
        	Sampoorn_Nivesh_Classic_Waiver_Benefit.click();
        	
        } else if (planname.equals("Sanchay Plus")) {
        	Thread.sleep(10000);
        	Market_Linked.click();
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        	WebElement Plan_type_Guaranteed_return = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-quotes/div[1]/div[1]/div[2]/div/div[1]/em")));
        	Plan_type_Guaranteed_return.click();
        	js.executeScript("arguments[0].scrollIntoView();",Sanchay_Plus_Scroll );
       	    Thread.sleep(5000);
        	Sanchay_Plus.click();
        	
        } else if (planname.equals("Sanchay Fixed Maturity Plan")) {
        	Thread.sleep(12000);
        	Market_Linked.click();
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        	WebElement Plan_type_Guaranteed_return = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-quotes/div[1]/div[1]/div[2]/div/div[1]/em")));
        	Plan_type_Guaranteed_return.click();
        	js.executeScript("arguments[0].scrollIntoView();",Sanchay_Plus );
        	Sanchay_Fixed_Maturity_Plan_open.click();
        	Thread.sleep(5000);
        	Sanchay_Fixed_Maturity_Plan.click();
        	
        } else if (planname.equals("Guaranteed Wealth Plus-Income variant")) {
        	Thread.sleep(12000);
        	Market_Linked.click();
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        	WebElement Plan_type_Guaranteed_return = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-quotes/div[1]/div[1]/div[2]/div/div[1]/em")));
        	Plan_type_Guaranteed_return.click();
        	Thread.sleep(5000);
        	Lumpsum_click.click();
        	Thread.sleep(5000);
        	Income_for_Long_Term_click.click();
        	Thread.sleep(6000);
        	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
        	Thread.sleep(5000);
        	Guaranteed_Wealth_Plus_Income_variant.click();
        	
        } else if (planname.equals("Guaranteed Income Insurance Plan")) {
        	Thread.sleep(12000);
        	Market_Linked.click();
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        	WebElement Plan_type_Guaranteed_return = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-quotes/div[1]/div[1]/div[2]/div/div[1]/em")));
        	Plan_type_Guaranteed_return.click();
        	Thread.sleep(5000);
        	Lumpsum_click.click();
        	Thread.sleep(5000);
        	Income_for_Long_Term_click.click();
        	Thread.sleep(6000);
        	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1400);");
        	Thread.sleep(5000);
        	Guaranteed_Income_Insurance_Plan_open.click();
        	Thread.sleep(2000);
        	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 120);");
        	Thread.sleep(5000);
        	Guaranteed_Income_Insurance_Plan.click();
        	
        } else if (planname.equals("Sanchay Par Advantage - Immediate Income")) {
        	Thread.sleep(10000);
        	Market_Linked.click();
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        	WebElement Plan_type_Guaranteed_return = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-quotes/div[1]/div[1]/div[2]/div/div[1]/em")));
        	Plan_type_Guaranteed_return.click();
        	Thread.sleep(5000);
        	Lumpsum_click.click();
        	Thread.sleep(5000);
        	Income_for_Long_Term_click.click();
        	Thread.sleep(6000);
        	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1100);");
        	Thread.sleep(5000);
        	Sanchay_Par_Advantage_Immediate_Income.click();
        	
        } else {
               // Handle the case when planname does not match any expected value
        	System.out.println("Plan not available");
        }
        }
    
    }
