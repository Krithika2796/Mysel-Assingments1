package Week2HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class createLead {

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
		TL.findElement(By.linkText("Leads")).click();
		TL.findElement(By.linkText("Create Lead")).click();
		TL.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		TL.findElement(By.id("createLeadForm_firstName")).sendKeys("Krithika");
		TL.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		TL.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLeaf");
		TL.findElement(By.name("submitButton")).click();
		String Title=TL.getTitle();
				System.out.println("Titile of current webpage" + Title);
		TL.quit();
	}

}
