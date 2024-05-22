package Test_Cases_journy;

import java.io.IOException;

import org.testng.annotations.Test;

import Page_object.journy_07bank_details;
import Page_object.test_base_class;
import Utilities.Excelutilities;

public class TS_07_Bank_Details extends test_base_class {
	
	String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
    String xlfile = path;
    String xlsheet = "journy";
    
    
    @Test
    public void Verify_bank_Details() throws Exception {
    	
    	journy_07bank_details BAD=new journy_07bank_details(driver);
    	


    	BAD.IFSC_Code((Excelutilities.getCellData(xlfile, xlsheet, 33, 2)));
    	BAD.Account_NO((Excelutilities.getCellData(xlfile, xlsheet, 34, 2)));
    	BAD.Bank_NextButton();
    	
    }

}
