package Week1HomeAssignments;

public class Fibonacciseries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int count=8;
		System.out.println("Fibonaccci series:"+count);
		for(int i=0;i<=count;++i){
			System.out.println(a+" ");
			
			int D=a+b;
			a=b;
			b=D;
			// TODO Auto-generated method stub
		}

	}

}
