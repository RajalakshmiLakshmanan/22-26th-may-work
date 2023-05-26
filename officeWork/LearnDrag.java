package officeWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnDrag {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications-");
			ChromeDriver driver =new ChromeDriver(option);
			
			driver.get("https://www.leafground.com/drag.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		
		
			Actions opt=new Actions(driver);
			
			opt.dragAndDropBy(drag, 100,200).perform();
			
			WebElement dragtarget = driver.findElement(By.xpath("//p[text()='Drag to target']"));
			WebElement droptarget = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
			
			opt.dragAndDrop(dragtarget, droptarget).perform();
	}

}
