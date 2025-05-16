package Week3HomeAssignments;

public class TextField extends WebElement{
	private String text;
	public void setText(String Text) {
		this.text="Hello";
		System.out.println("Text field:"+ text);
	}
		
		
	public String getText() {
		return this.text;
	}

}
