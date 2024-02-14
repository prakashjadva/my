package Test_cases;

import org.testng.annotations.Test;

import Page_object.quote_page;
import Page_object.test_base_class;
import Utilities.Excelutilities;

public class TS_001 extends test_base_class{

	
	String path = ".\\Test_Data\\test_data.xlsx";
	String xlfile = path;
	String xlsheet = "Sheet1";
	
	
	@Test(priority=0)
	public void Nevigaion_to_product_page() throws InterruptedException, Exception {	
    quote_page qp=new quote_page(driver);
		
	qp.username(Excelutilities.getCellData(xlfile, xlsheet, 0, 0 ));
	qp.mobi(Excelutilities.getCellData(xlfile, xlsheet, 0, 1 ));
	qp.mail(Excelutilities.getCellData(xlfile, xlsheet, 0, 2 ));;
	qp.Viewplans();
	Thread.sleep(20000);
	qp.Plan();
	qp.Proceed();
	
	
	
}
}