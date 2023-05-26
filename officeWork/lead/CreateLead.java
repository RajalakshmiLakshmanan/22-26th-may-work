package officeWork.lead;
//1. Launch URL "http://leaftaps.com/opentaps/control/login"
//2. Enter UserName and Password Using Id Locator
//3. Click on Login Button using Class Locator
//4. Click on CRM/SFA Link
//5. Click on Leads Button
//6. Click on Create Lead 
//7. Enter CompanyName Field Using id Locator
//8. Enter FirstName Field Using id Locator
//9. Enter LastName Field Using id Locator
//10. Enter FirstName(Local) Field Using id Locator
//11. Enter Department Field Using any Locator of Your Choice
//12. Enter Description Field Using any Locator of your choice 
//13. Enter your email in the E-mail address Field using the locator of your choice
//14. Select State/Province as NewYork Using Visible Text
//15. Click on Create Button
//        16. Get the Title of Resulting Page. refer the video  using driver.getTitle()

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{

	    @Test(dataProvider="setData")
		public void createlead(String compname,String fname,String lname,String depname) throws InterruptedException {
		   driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		   Thread.sleep(1000);
		   //WebElement compname = driver.findElement(By.name("companyName"));
//		   Actions action = new Actions(driver);
//		   
//		   action.sendKeys(compname,"TCS");
			   
		   driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compname);
		   driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(depname);
		   driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9900445453");
		   driver.findElement(By.id("createLeadForm_description")).sendKeys("text for test");
		   driver.findElement(By.name("submitButton")).click();
		   String title = driver.getTitle();
		   if(title.contains("View Lead")) {
			   System.out.println("success");
			   
		   }
			
			
		}
//	    @Test
//	    
//		public void runEditLead() {
//			
//			driver.findElement(By.linkText("Edit")).click();
//			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("note for edit");
//			driver.findElement(By.className("smallSubmit")).click();
//			
//		}
	    
		
		
		
	

}
