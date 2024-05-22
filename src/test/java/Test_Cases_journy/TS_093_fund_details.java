package Test_Cases_journy;

import org.testng.annotations.Test;

import Page_object.journy_093_fund_details;
import Page_object.test_base_class;

public class TS_093_fund_details extends test_base_class {
	
	String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
    String xlfile = path;
    String xlsheet = "journy";
	

    
    
    @Test
    public void verify_Fund_Details() {
    	
    	journy_093_fund_details FD=new journy_093_fund_details(driver);
    	FD.Fund_Details_Next_Button();
    	
    }
}
