package Test_Cases_journy;

import org.testng.annotations.Test;

import Page_object.journy_091_Family_History;
import Page_object.test_base_class;

public class TS_091_Family_History extends test_base_class {
	
	
	String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
    String xlfile = path;
    String xlsheet = "journy";
    
    
    @Test
    public void Verify_Family_History() {
    	journy_091_Family_History FH=new journy_091_Family_History(driver);
    	
    	FH.Family_History_next_button();
    	
    }
    
	

}
