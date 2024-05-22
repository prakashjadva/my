package Test_Cases_journy;

import java.io.IOException;

import org.testng.annotations.Test;

import Page_object.journy_02family_details;
import Page_object.test_base_class;
import Utilities.Excelutilities;

public class TS_02_Family_Details extends test_base_class {
	
	 String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
	    String xlfile = path;
	    String xlsheet = "journy";
	    
	    
	    
	    @Test
	    public void Verify_family_details() throws Exception {
	    	 journy_02family_details FD=new  journy_02family_details(driver);
	    	 
	    	 FD.Marital_Status();
	    	 FD.Maiden_Name((Excelutilities.getCellData(xlfile, xlsheet, 5, 2)));
	    	 FD.SpouseName((Excelutilities.getCellData(xlfile, xlsheet, 6, 2)));
	    	 FD.Life_Cover_Husband((Excelutilities.getCellData(xlfile, xlsheet, 7, 2)));
	    	 FD.Father_Name((Excelutilities.getCellData(xlfile, xlsheet, 8, 2)));
	    	 FD.Mother_Name((Excelutilities.getCellData(xlfile, xlsheet, 9, 2)));
	    	 FD.Next_Button_Family_Details();
	    	
	    	
	    }

}
