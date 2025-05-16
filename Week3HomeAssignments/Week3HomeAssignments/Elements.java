package Week3HomeAssignments;

public class Elements extends button{

	public static void main(String[] args) {
		TextField Text=new TextField() ;
	
		Text.setText("Hello Wortld");
		System.out.println("Textfield:"+Text);
		Text.Click();
		
		CheckBoxButton check=new CheckBoxButton();
		check.Click();
		check.clickcheckButton();
		check.Submit();
		
		RadioButton radio=new RadioButton();
		radio.Click();
		radio.selectRadioButton();
		radio.Submit();
		
		Elements element=new Elements();
		element.Click();
		element.Submit();
		
		
			

}
}


