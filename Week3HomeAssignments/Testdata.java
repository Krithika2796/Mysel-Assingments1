package Week3HomeAssignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testdata {
	public void usename() {
		
	String UN="Testleaf";
	System.out.println("Username is"+UN);
	}
	public void password() {
	String PW="Welcome@123";
	System.out.println("Password is" +PW);
	
	
		
	}
	public void navigatetohomepage() {
		ChromeDriver home=new ChromeDriver();
		home.get("https://www.Testleaf.com");
		
	}

}
