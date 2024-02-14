package Test_cases;


import java.io.IOException;

import org.testng.annotations.Test;

import Page_object.product_page;
import Page_object.quote_page;
import Page_object.test_base_class;
import Utilities.Excelutilities;

      public class TS_002 extends test_base_class{
	
	
	  @Test(priority=3)
	  public void TC_002Certificate() throws Exception {
	  product_page pp=new product_page(driver);
	  Thread.sleep(1000);
	  pp.Certificate();
	  Thread.sleep(1000);
	  pp.Certificate_close();
	
	}
	 @Test(priority=2)
	 public void TC_003Brochure() throws Exception {
		product_page pp=new product_page(driver);
		Thread.sleep(1000);
		pp.Brochure();
		
	}
	

    @Test(priority=4)
    public void TC_004BI() throws Exception {
	product_page pp=new product_page(driver);
	Thread.sleep(2000);
	pp.BI();
	
}
	@Test(priority=1)
			
	public void TC_005Talk_to_anExpert() {
	product_page pp=new product_page(driver);
	pp.Talk_to_an_Expert();
		
	


	}
}