package Test_Cases_journy;

import java.io.IOException;

import org.testng.annotations.Test;

import Page_object.Journy_01basicdetails_page;
import Page_object.test_base_class;
import Utilities.Excelutilities;

public class TS_01_Basic_Details extends test_base_class{

	 String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
	    String xlfile = path;
	    String xlsheet = "journy";
	    
	    @Test
	   public void verify_basic_details() throws Exception {
	    	Journy_01basicdetails_page BD=new Journy_01basicdetails_page(driver);
	    	
	    	BD.PlaceofBirth((Excelutilities.getCellData(xlfile, xlsheet, 1, 2)));
	    	BD.IdentificationMarks((Excelutilities.getCellData(xlfile, xlsheet, 2, 2)));
	    	BD.Permanent_Account_NO((Excelutilities.getCellData(xlfile, xlsheet, 3, 2)));
	    	BD.Next_Button();
	    	
	    }
}
