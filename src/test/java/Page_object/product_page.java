package Page_object;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base_class.Base_class;
import io.netty.handler.timeout.TimeoutException;

public class product_page extends Base_class {
	 public static WebDriverWait wait;
	
	public product_page(WebDriver driver) {
		super(driver);
		
	}
	//Element
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[1]/app-investment-calculation/div/div[2]/app-slider/div/div[1]/ul/li[2]/div/div[2]/div[2]/span")
			WebElement certificate;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[1]/app-investment-calculation/div/div[2]/app-slider/div[3]/h4/span[2]/img")
			WebElement certificate_close;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/app-header/header/div[2]/a[2]")
			WebElement brochure;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/app-header/header/div[2]/a[4]")
			WebElement talk_to_an_Expert;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/app-header/header/div[2]/a[3]")
			WebElement bi;
			
			@FindBy(id = "mob")
			WebElement mono;
			
			@FindBy(xpath = "//input[@placeholder='Email Address']")
			WebElement email;
			
			@FindBy(xpath = "//select[@formcontrolname='payTerm']")
			WebElement payfor;
			
			@FindBy(xpath = "//select[@placeholder='Withdraw After*']")
			WebElement wa;
			
			@FindBy(xpath = "//input[@placeholder='Investment Amount*']")
			WebElement ia;
			
			@FindBy(xpath = "//select[@placeholder='Mode of Premium*']")
			WebElement mop;
			
			
			@FindBy(xpath = "//select[@class='floating-input has-value valid ng-untouched ng-pristine']")
			WebElement rs;
			
			@FindBy(id = "fullName")
			WebElement name;
			
			@FindBy(id = "mob")
			WebElement mobile;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[1]/app-investment-calculation/div/div[1]/div[2]/span/a")
			WebElement kyp;
			
			@FindBy(xpath = "(//li[@class='liPlanstep'])[1]")
			WebElement is;
			
			@FindBy(id = "lifeStageBenefits")
			WebElement ic;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[1]/app-investment-calculation/div/div[1]/div[2]/app-kyps/div/div/ul/li[2]")
			WebElement fp;
			
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[1]/app-investment-calculation/div/div[1]/div[2]/app-kyps/div/div/div[1]/span/img")
			WebElement close;
			
			@FindBy(xpath = "//input[@id='fullName']")
			WebElement name11;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[2]/app-insured-details/form/div[2]/div[3]/div/label[2]/span[1]")
			WebElement malegender;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[2]/app-insured-details/form/div[2]/div[3]/div/label[3]/span[1]")
			WebElement femalegender;
			
			@FindBy(name = "date")
			WebElement dob;
			
			
			@FindBy(xpath = "//button[@class='btn btn-primary']")
			WebElement pbutton1;
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[2]/app-insured-details/form/div[2]/div[7]/div/app-select-dropdown/div/input")
			WebElement city;

			@FindBy(xpath = "//select[@name='insuredEducation']")
			WebElement eq;

			@FindBy(xpath = "//select[@name='insuredOccupation']")
			WebElement occupation;

			@FindBy(xpath = "//input[@name='insuredPincode']")
			WebElement pincode;

			@FindBy(xpath = "//input[@name='insuredIncome']")
			WebElement income;
			
			@FindBy(xpath = "//button[@class='btn btn-primary']")
			WebElement pbutton2;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/app-header/header/div[1]/img")
			WebElement pblogo;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[2]/app-insured-details/form/div[2]/div[1]/label[2]/span/span")
			WebElement investingfor_spouse;
			

			@FindBy(xpath = "//input[@placeholder='Your Full Name*']")
			WebElement proposerfname;
			
			
			@FindBy(xpath = "//input[@placeholder='Mobile Number']")
			WebElement proposermobile;
			
			@FindBy(xpath="/html/body/app-root/body/app-layout/div/div/div[1]/div/div[2]/app-proposer-details/form/div[3]/div/div[2]/button")
			WebElement button2;
			
			@FindBy(xpath = "//button[text()='Checkout']")
			WebElement chekout_button;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[2]/app-proposer-details/form/div[2]/div[5]/div/app-select-dropdown/div/input")
			WebElement Proposer_Country;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[1]/div/div[2]/app-proposer-details/form/div[2]/div[6]/div/input")
			WebElement Proposer_International_mo_no;
			
			@FindBy(xpath = "//input[@placeholder='Email Address']")
			WebElement Proposer_mailid;
			
			@FindBy(xpath = "/html/body/app-root/body/app-layout/div/div/div[5]/div/app-investment-criteria/div[2]/div/div/div/div[2]/div[2]/p")
			WebElement pptcombination;
			
			
			
			
			
			//.................................Upper label controles..................................
			public void Certificate ()  {
				
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", certificate);
				wait=new WebDriverWait(driver,Duration.ofSeconds(5));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/body/app-layout/div/div/div[1]/div/div[1]/app-investment-calculation/div/div[2]/app-slider/div/div[1]/ul/li[2]/div/div[2]/div[2]/span")));
			    certificate.click();
			
			}	
			public void Certificate_close ()  {		
				certificate_close.click();
			
			}
			public void Brochure ()  {	
				//brochure.click();
				
				
				// Note the initial number of files in the download directory
				File downloadDir = new File("C:/Users/prakashjadav/Downloads");
				int initialFileCount = downloadDir.listFiles().length;

				// Click the download button
				brochure.click();

				// Wait for a reasonable amount of time for the download to complete
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(25));
		        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("/html/body/app-root/body/app-layout/app-header/header/div[2]/a[2]")));
			
				// Check if the number of files in the download directory has increased
				int currentFileCount = downloadDir.listFiles().length;
				if (currentFileCount > initialFileCount) {
				    System.out.println("Brochure downloaded successfully.");
				} else {
				    System.out.println("Brochure download failed or not completed.");
				}
}
			
			public void Talk_to_an_Expert ()  {	
				wait=new WebDriverWait(driver,Duration.ofSeconds(20));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/body/app-layout/app-header/header/div[2]/a[4]")));
				talk_to_an_Expert.click();
}
			public void BI ()  {
				wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/body/app-layout/app-header/header/div[2]/a[3]")));
			//	bi.click();
				
				// Note the initial number of files in the download directory
				File downloadDir = new File("C:/Users/prakashjadav/Downloads");
				int initialFileCount = downloadDir.listFiles().length;

				// Click the download button
				bi.click();

				// Wait for a reasonable amount of time for the download to complete
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(25));
		        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("/html/body/app-root/body/app-layout/app-header/header/div[2]/a[3]")));
			
				// Check if the number of files in the download directory has increased
				int currentFileCount = downloadDir.listFiles().length;
				if (currentFileCount > initialFileCount) {
				    System.out.println("BI  downloaded successfully.");
				} else {
				    System.out.println("BI download failed or not completed.");
				}
				
				
				
				}
			public void PBLOGO ()  {
				pblogo.isDisplayed();
				pblogo.getText();
			}
	//...................................Fields are Enabeled or Not.....................................		
			public void Email ()  {		
				email.isEnabled();
				
			}
			
			public void MONO ()  {		
				mono.isEnabled();
				}
			public void Pay_For ()  {		
				payfor.isEnabled();
				
}
			public void WA ()  {		
				wa.isEnabled();
			}
			public void IA ()  {
				ia.isEnabled();
			}
			public void RS ()  {
				rs.isEnabled();
			}
			public void Name ()  {
				name.isEnabled();
			}
			public void Mobile ()  {
				wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.elementToBeClickable(By.id("mob")));
				mobile.isEnabled();
			}
			
	// .........................................KYP...........................................		
			public void KYP ()  {
				wait=new WebDriverWait(driver,Duration.ofSeconds(15));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/body/app-layout/div/div/div[1]/div/div[1]/app-investment-calculation/div/div[1]/div[2]/span/a")));
				kyp.click();
		
			}
			
			public void IS ()  {
				is.click();
			}
			public void IC ()  {
				ic.click();
			}
			
			public void FP () throws Exception  {
			try {
					WebElement test=driver.findElement(By.xpath("//li[@class='SecondTab']"));
					if(test.isDisplayed()) {
				    WebElement fp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='SecondTab']")));
				    fp.click();}
				
				else {
					System.out.println("Fund performance not available");
				}}
			    catch (Exception e) {
				// TODO: handle exception
			    }
				    WebElement close = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/body/app-layout/div/div/div[1]/div/div[1]/app-investment-calculation/div/div[1]/div[2]/app-kyps/div/div/div[1]/span/img")));
				    close.click();
				}
//................................................Nevigation on Review page with life_assured..............
            public void Name1() throws InterruptedException  {
            	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		        wait.until(ExpectedConditions.elementToBeClickable(name11));
		        Thread.sleep(3000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].value = '';", name11);
				Thread.sleep(3000);
				name11.sendKeys("HDFC test");
            
            }
			public void MaleGender ()  {
				malegender.click();
			}
			public void FemaleGender ()  {
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		        wait.until(ExpectedConditions.elementToBeClickable(femalegender));
				femalegender.click();
				
				
			}
			
			 public void City() throws Exception {
				 
				    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", city);
				    Thread.sleep(1000);
					WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			        wait.until(ExpectedConditions.elementToBeClickable(city));
				    city.sendKeys("Agra");
			    
					Thread.sleep(100);
					driver.findElement(By.xpath("/html/body/app-root/body/app-layout/div/div/div[1]/div/div[2]/app-insured-details/form/div[2]/div[7]/div/app-select-dropdown/div/div/ul/li")).click();
				 
				
				}
			public void Dob ()  {
				((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 50);");
				dob.sendKeys("10101996");
			    }


            public void Mobile1 () throws Exception  {
            	((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 50);");
            try {
				WebElement test1=driver.findElement(By.id("mob"));
				if(test1.isDisplayed()) {
					 Thread.sleep(300);
			            JavascriptExecutor js = (JavascriptExecutor) driver;
			            js.executeScript("arguments[0].value = '';", mobile);
			            mobile.sendKeys("8977777777");
				}
			else {
				System.out.println("Indian mo no field is not available");
			}}
		    catch (Exception e) {
			// TODO: handle exception
		    }
		    Thread.sleep(2000);
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value = '';", email);
			email.sendKeys("test@12.com");
					Thread.sleep(400);
	        email.clear();
	        Thread.sleep(400);
	        email.sendKeys("test@12.com");
            
            }
            
			public void IA1() throws Exception {
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(ia));
				ia.clear();
				ia.sendKeys("20000");
				
			    }
			
            public void Pay_For1() throws Exception {
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(payfor));
				Select pf=new Select(payfor);
				pf.selectByValue("7");
				
            }
            public void WA1() throws Exception {
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(wa));
				Select Wa=new Select(wa);
				Wa.selectByValue("15");
				
			}
            
           public void MOP() throws Exception {
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(mop));
				Select Mop=new Select(mop);
				Mop.selectByValue("4");
				
			}
           
           public void PButton1 () throws Exception  {
        	   Thread.sleep(1000);
				pbutton1.click();
					
			}
           
           public void Chekout_Button () throws Exception  {
        	   
        	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(95));
		        wait.until(ExpectedConditions.visibilityOf(chekout_button));
		        Thread.sleep(3000);
        	   chekout_button.click();
        	   }
           public void EQ() throws Exception {
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(eq));
				Select Mop=new Select(eq);
				Mop.selectByValue("2");
				
			}
           public void Occupation() throws Exception {
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(occupation));
				Select Mop=new Select(occupation);
				Mop.selectByValue("9");
				
			}
           public void PinCode ()  {
				pincode.sendKeys("122003");
			}
           public void Income ()  {
				income.sendKeys("500000");
			}
           
           public void PButton2 ()  {
				pbutton2.click();
			}
           
           public void MOP1 ()  {
        	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(mop));
				Select Mop=new Select(mop);
				
				List<WebElement> options = Mop.getOptions();
				List<String> expectedOptions = Arrays.asList("Monthly", "Quarterly", "Half Yearly", "Annually");
				List<String> actualOptions = new ArrayList<>();
				for (WebElement option : options) {
				    actualOptions.add(option.getText());
				}

				Assert.assertEquals(actualOptions, expectedOptions, "Dropdown options do not match expected data");
			    }
           
           
           
          

           public void Pay_For2(String expectedPayFor)  {
                	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
         		        wait.until(ExpectedConditions.elementToBeClickable(payfor));
         		        
         		       String pptvalue = pptcombination.getText();
         		      Pattern pattern = Pattern.compile("\\b\\d+\\b");
         		      Matcher matcher = pattern.matcher(pptvalue);
         		      ArrayList<Integer> ppt = new ArrayList<>();
         		      while (matcher.find()) {
         		          ppt.add(Integer.parseInt(matcher.group())); 
         		      }

         		      Select Payfor = new Select(payfor);
         		      List<WebElement> options = Payfor.getOptions();

         		      for (int i = 0; i < ppt.size(); i++) {
         		          Integer pptValue = ppt.get(i);
         		          boolean found = false;
         		          for (WebElement option : options) {
         		        	   int dropdwn_ppt = Integer.parseInt(option.getAttribute("value")); 
         		              if (dropdwn_ppt == pptValue) {
         		                  found = true;
         		                  break;
         		              }
         		          }
         		          assert found : "The value " + pptValue + " was not found in the dropdown options."; 
         		      }
      				
//         				List<String> expectedOptions = Arrays.asList("5 Years","6 Years","7 Years", "8 Years", "10 Years", "12 Years","15 Years","20 Years");
//         				List<String> actualOptions = new ArrayList<>();
//         				for (WebElement option : options) {
//         				    actualOptions.add(option.getText());
//         				}
//
//         				for (int i=0; i<expectedOptions.length;i++ )
//         					assert.equals(actualOptions[i],expectedOptions[i])
//         				}
//         				Assert.assertEquals(actualOptions, expectedOptions, "Dropdown options do not match expected data");
         			}
         
           
           
           
           
           
        	
//           public void WA2()  {
//          	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//   		        wait.until(ExpectedConditions.elementToBeClickable(wa));
//   				Select Payfor=new Select(wa);
//   				
//   				List<WebElement> options = Payfor.getOptions();
//   				List<String> expectedOptions = Arrays.asList("10 Years", "12 Years", "15 Years", "20 Years");
//   				List<String> actualOptions = new ArrayList<>();
//   				for (WebElement option : options) {
//   				    actualOptions.add(option.getText());
//   				}
//
//   				Assert.assertEquals(actualOptions, expectedOptions, "Dropdown options do not match expected data");
//   			    }
//           
           
           public void WA2() {
        	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        	    wait.until(ExpectedConditions.elementToBeClickable(wa));
        	    Select payfor = new Select(wa);
        	    
        	    List<WebElement> options = payfor.getOptions();
        	    List<String> actualOptions = new ArrayList<>();
        	    for (WebElement option : options) {
        	        actualOptions.add(option.getText());
        	    }

        	    List<String> expectedOptions = new ArrayList<>();
        	    // Add "10 Years" before "15 Years"
        	    expectedOptions.add("10 Years");
        	    for (int i = 15; i <= 40; i++) {
        	        expectedOptions.add(String.valueOf(i) + " Years");
        	    }
        	    // Add the missing 16th year
        	    if (!expectedOptions.contains("16 Years")) {
        	        expectedOptions.add("16 Years");
        	    }

        	    // Sort both lists
        	    Collections.sort(actualOptions);
        	    Collections.sort(expectedOptions);

        	    System.out.println("Actual Options: " + actualOptions);
        	    System.out.println("Expected Options: " + expectedOptions);

        	    // Find the difference between the lists
        	    List<String> difference = new ArrayList<>(actualOptions);
        	    difference.removeAll(expectedOptions);
        	    System.out.println("Difference: " + difference);

        	    Assert.assertEquals(actualOptions, expectedOptions, "Dropdown options do not match expected data");
        	}
 // .............................................Proposer Details...........................................          
           public void Investing_for_Spouse ()  {
        	   
        	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(25));
		        wait.until(ExpectedConditions.elementToBeClickable(investingfor_spouse));
		        
        	   try {
        		   investingfor_spouse.click();
               } catch (org.openqa.selenium.StaleElementReferenceException e) {
            	   investingfor_spouse = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/body/app-layout/div/div/div[1]/div/div[2]/app-insured-details/form/div[2]/div[1]/label[2]/span/span")));
            	   investingfor_spouse.click();
               }
			   }
           
           public void ProposerFname ()  {
        	   proposerfname.sendKeys("Proposer name");;
			   }
           
          public void DobPrposer ()  {
			dob.sendKeys("10101990");
		    }


          public void MobileProposer () throws Exception  {

     	    Thread.sleep(200);
            proposermobile.sendKeys("7777777777");

            }
		 public void EmailProposer () throws Exception  {

	        Thread.sleep(400);
        email.sendKeys("test@12.com");
           
          }	   
         public void Button2 ()  {		
	        button2.click();
	        
	        
}
}


