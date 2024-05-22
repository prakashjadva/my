package Test_Cases_journy;

import java.io.IOException;

import org.testng.annotations.Test;

import Page_object.journy_08Life_Assured_General_Info;
import Page_object.test_base_class;
import Utilities.Excelutilities;

public class TS_08_Lifeassured_general_info extends test_base_class{
	
	String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
    String xlfile = path;
    String xlsheet = "journy";

    
    @Test
    public void Verify_LA_General_Info() throws Exception {
    	journy_08Life_Assured_General_Info GI=new journy_08Life_Assured_General_Info(driver);
    	GI.Height_Ft();
    	GI.Height_Inches();
    	GI.Weight((Excelutilities.getCellData(xlfile, xlsheet, 36, 2)));
    	GI.General_Next_Button();
    
    }
}
