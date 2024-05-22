package Test_cases;

import org.apache.poi.ss.formula.functions.PPMT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Page_object.product_page;
import Page_object.test_base_class;

public class TS_005_kyp_section extends test_base_class {
	public static WebDriverWait wait;
	@Test
	public void TC_021_verify_KYP_section() throws Exception{
		product_page pp=new product_page(driver);
		
		
		
		Thread.sleep(200);
		pp.KYP();
		Thread.sleep(200);
		pp.IS();
		Thread.sleep(200);
		pp.IC();
		Thread.sleep(200);
		pp.FP();
		Thread.sleep(200);
		//pp.Close();
		  
		
		
		
		
	
		
		
		
		
		
	}
	

}
