package Test_Cases_journy;

import org.testng.annotations.Test;

import Page_object.journy_09_LA_Existing_Policy;
import Page_object.test_base_class;

public class TS_09_LA_Existing_Policies extends test_base_class{
	
	String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
    String xlfile = path;
    String xlsheet = "journy";
    
    
    @Test
    public void Verify_LA_Existing_policy() throws Exception {
    	
    	journy_09_LA_Existing_Policy EP=new journy_09_LA_Existing_Policy(driver);
    	
    	EP.Existing_po_Next_Button();
    }

}
