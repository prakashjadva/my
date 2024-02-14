package Test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://uate2e.policybazaar.com/newbajaj/?IncomeMode=12&EnquiryID=PhEH%2BxwtwhtgAdg9rxIY8Q%3D%3D&PlanID=317&WOP=false&FIB=false&mode-of-premium=12&ProjectionPercent=21.18&isHigh=true&isSecure=false&PerformanceYear=10&PerformanceRate=21.18&PayTerm=10&PolicyTerm=20&AnnualPremium=120000&PlanType=1&GuaranteedPlanID=322&UlipPlanID=255&pt_cg=20&irln=true&pfn=Midcap%20Index%20Fund&pstPred=1&pstperYer=10&sumassured=1200000&isOffline=0");
		driver.manage().window().maximize();
		Thread.sleep(50000);
		WebElement name= driver.findElement(By.xpath("//input[@placeholder='Investment Amount*']"));
		name.clear();
		name.sendKeys("12000");
		
	}

}
