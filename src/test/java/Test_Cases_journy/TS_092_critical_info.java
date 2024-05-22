package Test_Cases_journy;

import org.testng.annotations.Test;

import Page_object.journy_092_Critical_Info;
import Page_object.test_base_class;

public class TS_092_critical_info extends test_base_class{
	
	String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
    String xlfile = path;
    String xlsheet = "journy";
    
    
    @Test
    public void Verify_Critical_info() {
    	
    	journy_092_Critical_Info CI=new journy_092_Critical_Info(driver);
    	
    	CI.Critical_Next_Button();
    	
    	
    	
    }
}
