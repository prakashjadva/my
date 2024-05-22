package Test_Cases_journy;

import org.testng.annotations.Test;

import Page_object.journy_094_fund_allocation;
import Page_object.test_base_class;
import Utilities.Excelutilities;


public class TS_094_fund_allocation extends test_base_class {
	
	String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
    String xlfile = path;
    String xlsheet = "journy";
    
    
    @Test
    public void Verify_Fund_Allocation() throws Exception {
    	journy_094_fund_allocation FA=new journy_094_fund_allocation(driver);
    	
    	FA.OTP((Excelutilities.getCellData(xlfile, xlsheet, 37, 2)));
    	FA.OTP_Verify_Button();
    	Thread.sleep(1000);
    	FA.Fund_Allocation_Next_Button();
    		
    	
    		
    	
    	
    	
    	
    }

}
