package Test_Cases_journy;

import java.io.IOException;

import org.testng.annotations.Test;

import Page_object.journy_06E_insurance_account;
import Page_object.test_base_class;
import Utilities.Excelutilities;

public class TS_06_E_Insurance_Account extends test_base_class {
	
	

	String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
    String xlfile = path;
    String xlsheet = "journy";
    
@Test
public void verify_E_Insurance_Account_Details() throws Exception {
	
	journy_06E_insurance_account E_NO=new journy_06E_insurance_account(driver);
	E_NO.Q_ans_as_yes();
	E_NO.EinsuranceAccNo((Excelutilities.getCellData(xlfile, xlsheet, 31, 2)));
	E_NO.E_insurance_Nextbutton();
	
	
	
}
	
	
}
