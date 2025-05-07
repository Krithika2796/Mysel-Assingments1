package Week2HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookday2 {

	public static void main(String[] args) {
		ChromeDriver FB=new ChromeDriver();
		FB.get("https://en-gb.facebook.com");
		FB.manage().window().maximize();
		FB.findElement(By.linkText("Create new account")).click();
		FB.findElement(By.name("firstname")).sendKeys("Krithika");
		FB.findElement(By.name("lastname")).sendKeys("K");
		FB.findElement(By.name("reg_email__")).sendKeys("Krithika2796@yahoo.com");
		FB.findElement(By.id("password_step_input")).sendKeys("Welcome@123");
		WebElement Date = FB.findElement(By.name("birthday_day"));
		Select select1=new Select(Date);
		select1.selectByIndex(26);
		
		WebElement month = FB.findElement(By.id("month"));
        Select select2=new Select(month);
        select2.selectByVisibleText("Nov");
        
        WebElement year = FB.findElement(By.name("birthday_year"));
        Select select3=new Select(year);
        select3.selectByVisibleText("1996");
        
        WebElement radiobutton = FB.findElement(By.xpath("//input[@type='radio' and @ value='1']"));
        radiobutton.click();
        
        
   
        
        
        
        
        
        

       
	}

}
