package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main/");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ram");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ram");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("test engineer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing all aspects of the product");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ram26@gmail.com");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Virginia");
		driver.findElement(By.className("smallSubmit")).click();
		String predictTitle = "View Lead | opentaps CRM";
		String actualTitle = driver.getTitle();

		if (predictTitle.equals(actualTitle)) {
			System.out.println("Result page display");
		} 
		else 
		{
			System.out.println("Result page not display");
		}
		}

}
