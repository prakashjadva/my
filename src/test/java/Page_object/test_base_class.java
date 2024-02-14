package Page_object;

import java.io.File;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;




public class test_base_class {
	
	public static WebDriver driver;
	@BeforeSuite
	public void setup() throws Exception {
		
		driver=new ChromeDriver();
		driver.get("https://investmentnewuat.policybazaar.com/prequote-ulip-lite");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}
	@AfterSuite
	public void quit() {
		//driver.quit();
	}
	public String captureScreen(String tname) {
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\Snap\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination ));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

	}
}
