package Test_cases;

import org.apache.poi.ss.formula.functions.PPMT;
import org.testng.annotations.Test;

import Page_object.product_page;
import Page_object.test_base_class;

public class TS_005 extends test_base_class {
	
	@Test
	public void TC_021_verify_KYP_section() throws Exception{
		product_page pp=new product_page(driver);
		
		
		
		Thread.sleep(2000);
		pp.KYP();
		Thread.sleep(2000);
		pp.IS();
		Thread.sleep(2000);
		pp.IC();
		Thread.sleep(2000);
		pp.FP();
		Thread.sleep(2000);
		pp.Close();
		
		
		
		
		
	
		
		
		
		
		
	}
	

}
