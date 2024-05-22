package Test_cases;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Page_object.quote_page;
import Page_object.test_base_class;
import Utilities.Excelutilities;

public class TS_001_Nevigation_to_product_page extends test_base_class{
	public static WebDriverWait wait;
	

    String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
    String xlfile = path;
    String xlsheet = "Sheet1";
    String plan="cg";                  
    String Country = "Indian";                
   //India,NRI  ...Plans....
    // cg
    //sn
    //Click2Invest
    //Sampoorn Nivesh - Classic Waiver Benefit
    //Sanchay Plus
    //Sanchay Fixed Maturity Plan   .............open xpath change Req ..NRI/India..
    //Guaranteed Wealth Plus-Income variant
    //Guaranteed Income Insurance Plan   ........not available for NRI
    //Sanchay Par Advantage - Immediate Income
    
    
    @Test(priority=0)
    public void Navigation_to_product_page() throws InterruptedException, Exception {
        // Create an instance of the quote_page class
        quote_page qp = new quote_page(driver);

        // Set values from Excel sheet to variables
     
        qp.username(Excelutilities.getCellData(xlfile, xlsheet, 0, 0));
        qp.SelectCountry(Country);
        qp.mobi(Excelutilities.getCellData(xlfile, xlsheet, 0, 1));
        qp.mail(Excelutilities.getCellData(xlfile, xlsheet, 0, 2));
        qp.Viewplans();  
        Thread.sleep(8000);
      
        //Select the plan and proceed
        qp.select_plan(plan);
        qp.Proceed();
        Thread.sleep(20000);
        
 
    }

}
