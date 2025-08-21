package comm;

import java.util.Scanner;

public class Odd_or_Even {

	public static void main(String[] args) {
	
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num =obj.nextInt();
		
	
		
		
		if(num%2==0) {
			System.out.println(num+" is Even");
		}
		else {
			System.out.print(num+" is Odd");
		}

	}

}
