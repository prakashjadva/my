package Test_cases;

import org.testng.annotations.Test;

import Page_object.product_page;
import Page_object.test_base_class;

       public class TS_004_Fields_enabled_or_not extends test_base_class {
	
	    @Test(priority=5)
	    public void TC_014Mo_no_isEnabled_or_not() {
		      product_page pp=new product_page(driver);
		      pp.Mobile();
	    }
	    
	    @Test
	    public void TC_015Mail_id_isEnabled_or_not() {
		      product_page pp=new product_page(driver);
		      pp.Email();
	    }
		
		@Test
		 public void TC_016IA_isEnabled_or_not() throws Exception {
				product_page pp=new product_page(driver);
				Thread.sleep(200);
				pp.IA();
		 }
		@Test
		 public void TC_017Pay_for_isEnabled_or_not() {
			product_page pp=new product_page(driver);
			pp.Pay_For();
		}
		
		@Test
		 public void TC_018WA_isEnabled_or_not() {
				product_page pp=new product_page(driver);
				pp.WA();
				
		 }
		 
		@Test
		 public void TC_019Name_isEnabled_or_not() {
				product_page pp=new product_page(driver);
				pp.Name();
		}
				@Test
				 public void TC_020Residantial_Status_isEnabled_or_not() {
				 product_page pp=new product_page(driver);
				 pp.RS();
		
	}
       }

