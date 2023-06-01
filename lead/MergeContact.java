package officeWork.lead;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/*1. Launch URL "http://leaftaps.com/opentaps/control/login"
* 
* 2. Enter UserName and Password Using Id Locator
* 
* 3. Click on Login Button using Class Locator
* 
* 4. Click on CRM/SFA Link
* 
* 5. Click on contacts Button
* 	
* 6. Click on Merge Contacts using Xpath Locator
* 
* 7. Click on Widget of From Contact
* 
* 8. Click on First Resulting Contact
* 
* 9. Click on Widget of To Contact
* 
* 10. Click on Second Resulting Contact
* 
* 11. Click on Merge button using Xpath Locator
* 
* 12. Accept the Alert
* 
*13. Verify the title of the page
**/

public class MergeContact extends BaseClass{
	@Test
	public void runMergeContact() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']//a)[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handle  =new ArrayList<String>(windowHandles);
		driver.switchTo().window(handle.get(1));
		
		//Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		WebElement table1 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		table1.click();
		driver.switchTo().window(handle.get(0));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']//a)[2]")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> whandle  =new ArrayList<String>(handles);
		driver.switchTo().window(whandle.get(1));
		
		//Thread.sleep(1000);
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.switchTo().window(whandle.get(0));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']//a)[3]")).click();
		
		Alert alert =  driver.switchTo().alert();
		alert.accept();
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
