package Week1HomeAssignments;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		int output=0;
		int Num=input;
		for(int i=Num;i>0;i/=10) {
			int rem=i%10;
			output=output*10+rem;
		}
		if(input==output)
		{
			System.out.println(input+ " This is a Palindrome");
			}
		else 
		{
			System.out.println(input+ " This is not a palindrome");
		}
		scanner.close();
		
			
	}
	}


