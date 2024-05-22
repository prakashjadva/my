package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://e2eqa.policybazaar.com/HDFCE2E/?IncomeMode=12&EnquiryID=Ovg1Fa424h8CKbrl%2FJl2uA%3D%3D&PlanID=47729&WOP=false&FIB=false&mode-of-premium=12&ProjectionPercent=27.48&isHigh=true&isSecure=false&PerformanceYear=10&PerformanceRate=27.48&PayTerm=10&PolicyTerm=20&AnnualPremium=120000&PlanType=1&irln=true&pfn=Midcap%20Momentum%20Fund&pstPred=1&pstperYer=10&sumassured=1320000&isOffline=0");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        
        WebElement name = driver.findElement(By.xpath("/html/body/app-root/body/app-layout/div/div/div[1]/div/div[1]/app-investment-calculation/div/div[2]/app-slider/div/div[1]/ul/li[2]/div/div[2]/div[2]/span"));
        
        // Scroll the element into view using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", name);
        
        // Perform the click after scrolling
        name.click();
        
        // Close the WebDriver
        //driver.quit();
    

		//name.getText();
		//System.out.println("passpb");
	}

}
