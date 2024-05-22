package Page_object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_class.Base_class;

public class journy_095_doc_upload extends Base_class {
	public static WebDriverWait wait;
	public journy_095_doc_upload(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//button[@id='btnCheckboxSelection']")
    WebElement submitbtn;
	
	@FindBy(xpath = "//input[@name='files[PHOTO][Upload]']")
    WebElement photoupload_button;
	
	
	@FindBy(xpath = "//input[@name='files[ADDRESS][Front]']")
    WebElement addressfront_button;
	
	
	@FindBy(xpath = "//input[@name='files[ADDRESS][Back]']")
    WebElement addressback_button;
	
	@FindBy(xpath = "//input[@name='files[PENNY_DROP_DOC][Upload]']")
    WebElement bank_details_button;
	
	
	@FindBy(xpath = "//button[text()='next']")
    WebElement docupload_next_button;
	
	public void Submit_button() throws Exception {
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btnCheckboxSelection']")));
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
	      executor.executeScript("arguments[0].click();", submitbtn);
		//submitbtn.click();
		Thread.sleep(2000);
	}
	public void Photoupload_Button() throws Exception {
		photoupload_button.sendKeys("C:/Users/prakashjadav/Downloads");
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,150)", "");
		
		addressfront_button.sendKeys("C:/Users/prakashjadav/Downloads");
		Thread.sleep(2000);
		addressback_button.sendKeys("C:/Users/prakashjadav/Downloads");
		Thread.sleep(2000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,150)", "");
		Thread.sleep(2000);
		bank_details_button.sendKeys("C:/Users/prakashjadav/Downloads");
		Thread.sleep(2000);
		docupload_next_button.click();
	}
	
	
	

	
}
