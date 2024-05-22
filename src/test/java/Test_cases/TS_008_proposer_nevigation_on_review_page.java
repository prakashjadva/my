package Test_cases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Page_object.product_page;
import Page_object.quote_page;
import Page_object.test_base_class;
import Utilities.Excelutilities;

public class TS_008_proposer_nevigation_on_review_page extends test_base_class{
	/*String path = ".\\Test_Data\\test_data.xlsx";
	String xlfile = path;
	 String plan="cg";   
	String xlsheet = "Sheet1";*/
	
	@Test
	public void verify_proposer_case_nevigation_to_reviewpage() throws Exception{
		product_page pp=new product_page(driver);
		 quote_page qp=new quote_page(driver);
			
			/*qp.username(Excelutilities.getCellData(xlfile, xlsheet, 0, 0 ));
			qp.mobi(Excelutilities.getCellData(xlfile, xlsheet, 0, 1 ));
			qp.mail(Excelutilities.getCellData(xlfile, xlsheet, 0, 2 ));;
			qp.Viewplans();
			Thread.sleep(20000);
			qp.Plan();
			qp.Proceed();*/
			
		
		pp.Investing_for_Spouse();
		Thread.sleep(1000);
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
		//	pp.Email1();
			Thread.sleep(200);
			pp.City();
			Thread.sleep(200);
			pp.PButton1();
			Thread.sleep(200);
			pp.ProposerFname();
			Thread.sleep(200);
			pp.DobPrposer();
			//Thread.sleep(2000);
			pp.MobileProposer();
			Thread.sleep(200);
			//pp.Proposer_scenariowith_both();
			pp.EmailProposer();
			Thread.sleep(200);;
			pp.Button2();
			//Thread.sleep(70000);
			pp.Chekout_Button();
	}
	
	

}
