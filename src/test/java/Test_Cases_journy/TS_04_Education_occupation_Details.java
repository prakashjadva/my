package Test_Cases_journy;

import java.io.IOException;

import org.testng.annotations.Test;

import Page_object.journy_04education_occupation_details;
import Page_object.test_base_class;
import Utilities.Excelutilities;

public class TS_04_Education_occupation_Details extends test_base_class {

	
	String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
    String xlfile = path;
    String xlsheet = "journy";
    
    
    @Test
    public void  verify_education_occupation () throws Exception{
    	
    journy_04education_occupation_details EO=new journy_04education_occupation_details(driver);
    
    EO.InsuranceObjective();
    EO.Education();
    EO.Occupation();
    EO.Employer_Business((Excelutilities.getCellData(xlfile, xlsheet, 20, 2)));
    EO.Designation();
    EO.Industry();
    EO.Occupation_Category();
    EO.nature_ofduty();
    EO.Workplace_Address((Excelutilities.getCellData(xlfile, xlsheet, 21, 2)));
    EO.Workplace_City((Excelutilities.getCellData(xlfile, xlsheet, 22, 2)));
    EO.Annual_Income((Excelutilities.getCellData(xlfile, xlsheet, 23, 2)));
    EO.Education_NextButton();
    	
    	
    	
    	
    	
    }
}
