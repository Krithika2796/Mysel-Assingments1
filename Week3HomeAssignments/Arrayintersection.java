package Week3HomeAssignments;

public class Arrayintersection {
	public static void main(String[] args) {
		int num[]= {3,2,11,4,6,7};
		int num1[]= {1,2,8,4,9,7};
		for(int i=0;i<num.length;i++)
			for (int j=0;j<num1.length;j++) {
				if(num[i]==num1[j]) {
					System.out.println("Array intersection element is" +num[i]);
				}
			}
		
		
	}

}
