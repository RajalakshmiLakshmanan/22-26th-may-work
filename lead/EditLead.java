package officeWork.lead;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLead extends BaseClass {
	
	//@Test(dependsOnMethods="officeWork.lead.CreateLead.createlead")-- to inject the dependency
	@Test
	public void runEditLead() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mani");
		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kannan");
		   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ADMIN");
		   driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9900445453");
		   driver.findElement(By.id("createLeadForm_description")).sendKeys("text for test");
		   driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("note for edit");
		driver.findElement(By.className("smallSubmit")).click();
		
	}
	
	
	
	
	
	

	

}
