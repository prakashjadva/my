package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Page_object.product_page;
import Page_object.quote_page;
import Page_object.test_base_class;
import Utilities.Excelutilities;

public class TS_006_la_nevigation_on_review_page extends test_base_class {
	/*String path = ".\\Test_Data\\test_data.xlsx";
	String xlfile = path;
	 String plan="cg";   
	String xlsheet = "Sheet1";*/
	
	@Test
		public void verify_user_nevigate_on_review_page() throws Exception{
		product_page pp=new product_page(driver);
		
		/* quote_page qp=new quote_page(driver);
			
			qp.username(Excelutilities.getCellData(xlfile, xlsheet, 0, 0 ));
			qp.mobi(Excelutilities.getCellData(xlfile, xlsheet, 0, 1 ));
			qp.mail(Excelutilities.getCellData(xlfile, xlsheet, 0, 2 ));;
			qp.Viewplans();
			Thread.sleep(20000);
			qp.Plan();
			qp.Proceed();*/
			
		
		
	    pp.Name1();
	    Thread.sleep(200);
		pp.MaleGender();
		Thread.sleep(200);
		pp.FemaleGender();
		Thread.sleep(200);
		pp.Dob();
		Thread.sleep(200);
		pp.Mobile1();;
		Thread.sleep(200);
		//pp.Email1();
		Thread.sleep(200);
		pp.City();
		Thread.sleep(200);
		pp.IA1();
		Thread.sleep(200);
		pp.Pay_For1();
		Thread.sleep(200);
		pp.WA1();
		Thread.sleep(200);
		pp.MOP();
		Thread.sleep(2000);
		pp.PButton1();
		//Thread.sleep(70000);
		pp.Chekout_Button();
		
		
		
	}

}
