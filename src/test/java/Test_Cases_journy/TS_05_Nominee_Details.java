package Test_Cases_journy;



import org.testng.annotations.Test;

import Page_object.journy_05nominee_details;
import Page_object.test_base_class;
import Utilities.Excelutilities;

public class TS_05_Nominee_Details extends test_base_class  {

	String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
    String xlfile = path;
    String xlsheet = "journy";
    
    @Test
    public void verify_Nominee_Details() throws Exception {
    	journy_05nominee_details ND=new journy_05nominee_details(driver);
    	Thread.sleep(2000);
    	ND.Salutaion();
    	Thread.sleep(2000);
    	ND.Nominee_FullName((Excelutilities.getCellData(xlfile, xlsheet, 25, 2)));
    	Thread.sleep(2000);
    	ND.Nominee_Relationship();
    	Thread.sleep(2000);
    	ND.Nominee_DOB((Excelutilities.getCellData(xlfile, xlsheet, 26, 2)));
    	Thread.sleep(2000);
    	ND.Nominee_Percentage((Excelutilities.getCellData(xlfile, xlsheet, 27, 2)));
    	Thread.sleep(2000);
    	ND.Nominee_Mobile((Excelutilities.getCellData(xlfile, xlsheet, 30, 2)));
    	Thread.sleep(2000);
    	ND.Nominee_Email((Excelutilities.getCellData(xlfile, xlsheet, 29, 2)));
    	Thread.sleep(2000);
    	ND.Nominee_Maritalstatus();
    	Thread.sleep(2000);
    	ND.No_NextButton();
    	
    	
    
    	
    	
    	
    }
}
