package Week2HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class createAccount {

	public static void main(String[] args) {
	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver TL=new ChromeDriver(options); 
		TL.get("http://leaftaps.com/opentaps/.");
		TL.manage().window().maximize();  
		TL.findElement(By.id("username")).sendKeys("demosalesmanager");
		TL.findElement(By.id("password")).sendKeys("crmsfa");
		TL.findElement(By.className("decorativeSubmit")).click();
		TL.findElement(By.partialLinkText("CRM")).click();
		TL.findElement(By.linkText("Accounts")).click();
		TL.findElement(By.linkText("Create Account")).click();
		TL.findElement(By.id("accountName")).sendKeys("Seleniumtest");
		TL.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		TL.findElement(By.name("numberEmployees")).sendKeys("10");
		TL.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		TL.findElement(By.className("smallSubmit")).click();
		
		String Title=TL.getTitle();
		System.out.println("The Title of page is" + Title);
		TL.quit();
	}

}
