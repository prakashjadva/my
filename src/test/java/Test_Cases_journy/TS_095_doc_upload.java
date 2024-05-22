package Test_Cases_journy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Page_object.journy_095_doc_upload;
import Page_object.test_base_class;

public class TS_095_doc_upload extends test_base_class {
	
	String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
    String xlfile = path;
    String xlsheet = "journy";

    
    @Test 
    public void verify_doc_upload() throws Exception {
    	
    	journy_095_doc_upload DU=new journy_095_doc_upload(driver) ;
    	 
    		DU.Submit_button();
    		DU.Photoupload_Button();
    		
    	
    	
    }
}
