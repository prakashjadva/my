package Page_object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_class.Base_class;

public class journy_09_LA_Existing_Policy  extends Base_class{
public static WebDriverWait wait;
	public journy_09_LA_Existing_Policy(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//button[text()='next']")
    WebElement existing_po_next_button;
	
	
	public void Existing_po_Next_Button() throws Exception {
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='next']")));
		existing_po_next_button.click();
		Thread.sleep(5000);
	}

	
}
