package Page_object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_class.Base_class;

public class journy_08Life_Assured_General_Info extends Base_class {
public static WebDriverWait wait;
	public journy_08Life_Assured_General_Info(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//select[@title='In Feet']")
    WebElement height_ft;
	
	@FindBy(xpath = "//select[@title='Inches']")
    WebElement height_inches;
	
	@FindBy(xpath = "//input[@title='Weight in KGs']")
    WebElement weight;
	
	@FindBy(xpath = "//button[text()='next']")
    WebElement la_general_next_button;
	
	
	public void Height_Ft() {
		
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@title='In Feet']")));
		Select HF=new Select(height_ft);
		HF.selectByIndex(5);
		
	}
	
	
	public void Height_Inches() throws Exception {
		Select HI=new Select(height_inches);
		HI.selectByIndex(2);
		Thread.sleep(2000);
	}
	
	public void Weight(String Wt) throws Exception {
		
		weight.clear();
		Thread.sleep(2000);
		weight.sendKeys(Wt);
	}
	
  public void General_Next_Button() throws Exception {
	  la_general_next_button.click();
	  Thread.sleep(5000);
	}

}
