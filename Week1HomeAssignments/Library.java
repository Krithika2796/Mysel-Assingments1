package Week1HomeAssignments;

public class Library {
	
	public String addBook(String booktitle) {
		System.out.println(booktitle+ " Book added Successfully");
		return (booktitle);
		
	}
public void issueBook() {
	System.out.println("Book issued successfully");
}

public static void main(String[] args) {
	Library Books=new Library();
	Books.addBook("SachinTendulkar");
	Books.issueBook();
	
}
}


