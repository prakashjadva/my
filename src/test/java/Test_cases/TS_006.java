package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Page_object.product_page;
import Page_object.test_base_class;

public class TS_006 extends test_base_class {
	
	@Test
		public void verify_user_nevigate_on_review_page() throws Exception{
		product_page pp=new product_page(driver);
		
	    pp.Name1();
	    Thread.sleep(2000);
		pp.MaleGender();
		Thread.sleep(2000);
		pp.FemaleGender();
		Thread.sleep(2000);
		pp.Dob();
		Thread.sleep(2000);
		pp.Mobile1();;
		Thread.sleep(2000);
		pp.Email1();
		Thread.sleep(2000);
		pp.IA1();
		Thread.sleep(2000);
		pp.Pay_For1();
		Thread.sleep(2000);
		pp.WA1();
		Thread.sleep(2000);
		pp.MOP();
		Thread.sleep(2000);
		pp.PButton1();
		pp.EQ();
		pp.Occupation();
		pp.PinCode();
		pp.Income();
		Thread.sleep(2000);
		pp.PButton2();
		
		
		
		
		
		
		
	}
	

}
