package Test_Cases_journy;

import java.io.IOException;

import org.testng.annotations.Test;

import Page_object.journy_03contact_details;
import Page_object.test_base_class;
import Utilities.Excelutilities;

public class TS_03_Contact_Details extends test_base_class{
	
	String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
    String xlfile = path;
    String xlsheet = "journy";
    
    
    @Test
    
    public void Verify_Contact_Details() throws Exception {
    	
    	journy_03contact_details CD=new journy_03contact_details(driver);
    	
    	CD.Mail_Address_Line1((Excelutilities.getCellData(xlfile, xlsheet, 11, 2)));
    	CD.Mail_Address_Line2((Excelutilities.getCellData(xlfile, xlsheet, 12, 2)));
    	CD.Landmark((Excelutilities.getCellData(xlfile, xlsheet, 13, 2)));
    	CD.PinCode();
    	CD.CheckBox();
    	CD.Permanent_Address_Line1((Excelutilities.getCellData(xlfile, xlsheet, 15, 2)));
    	CD.Permanent_Address_Line2((Excelutilities.getCellData(xlfile, xlsheet, 16, 2)));
    	CD.Permanent_Landmark((Excelutilities.getCellData(xlfile, xlsheet, 17, 2)));
    	CD.Permanent_Pincode();
    	CD.Contact_Next_Button();
    	
    	
    	
    	
    	
    	
    }
}
