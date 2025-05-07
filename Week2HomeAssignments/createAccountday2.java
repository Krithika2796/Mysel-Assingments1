package Week2HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class createAccountday2 {

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
		TL.findElement(By.id("accountName")).sendKeys("Seleniumtest2");
		TL.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement Industry = TL.findElement(By.name("industryEnumId"));
		Select select1=new Select(Industry);
		select1.selectByVisibleText("Computer Software");
		WebElement MarketingCamp = TL.findElement(By.id("marketingCampaignId"));
		Select select2=new Select(MarketingCamp);
		select2.selectByIndex(6);
		WebElement state = TL.findElement(By.id("generalStateProvinceGeoId"));
			Select select3=new Select(state);
			select3.selectByValue("TX");
		TL.findElement(By.className("smallSubmit")).click();
		String Title=TL.getTitle();
		
		System.out.println("Name of the page is: "+ Title);

	}

}
