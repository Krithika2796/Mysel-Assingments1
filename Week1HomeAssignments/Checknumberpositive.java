package Week1HomeAssignments;

public class Checknumberpositive {
	int version=10;
	public void checknumber(int num) {
	
		if (num>0){
			System.out.println("The number is positive:"+num);
		}
		else {
			System.out.println("The nunber is negative:"+num);
			
		}
	}
	public static void main(String[] args) {
	
	Checknumberpositive Numcheck=new Checknumberpositive();
	Numcheck.checknumber(6);
	Numcheck.checknumber(-4);

}
}
