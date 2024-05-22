package Test_cases;

import java.io.IOException;

import org.testng.annotations.Test;

import Page_object.Payment_page;
import Page_object.quote_page;
import Page_object.test_base_class;
import Utilities.Excelutilities;

public class TS_009_Payment extends test_base_class {
	
	
	 String path = "C:\\pbtest\\Test_Data\\test_data.xlsx";
	    String xlfile = path;
	    String xlsheet = "PG";
	@Test
	public void payment_page () throws Exception {
		
		Payment_page paypage = new Payment_page(driver);
		
		paypage.BankName();
		paypage.PayNb();
		paypage.SuccessButton();
		paypage.NetBanking();
		paypage.OtherBank();
		paypage.AccountNumber((Excelutilities.getCellData(xlfile, xlsheet, 1, 1)));
		paypage.Confirm_AccountNumber((Excelutilities.getCellData(xlfile, xlsheet, 1, 1)));
		paypage.IFSC_Code((Excelutilities.getCellData(xlfile, xlsheet, 2, 1)));
		paypage.Account_Ho_Name(Excelutilities.getCellData(xlfile, xlsheet, 3, 1));
		paypage.Mobile_Number((Excelutilities.getCellData(xlfile, xlsheet, 4, 1)));
		paypage.AutoPay();
		paypage.Authenticate();
		//paypage.SuccessButton();
		paypage.SubmitButton();
	}
	
	

	
	
}
