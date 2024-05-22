package Test_cases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import Page_object.product_page;
import Page_object.test_base_class;

public class TS_007verify_left_side_controles extends test_base_class{
	
	
	
	@Test
	public void verify_Mode_of_premium() {
		product_page pp=new product_page(driver);
		pp.MOP1();
		
		
		
	}
	@Test
	public void verify_Pay_For() {
		product_page pp=new product_page(driver);
	pp.Pay_For2(null);
		
		
}
	@Test
	public void verify_Widraw_After() {
		product_page pp=new product_page(driver);
	pp.WA2();

}
	}
