package comm;

import java.util.Scanner;

public class Leapyear_or_not {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year=obj.nextInt(); 
		
		
		if(year%4==0) {
			System.out.println("Leap Year");
		}
		if(year%4!=0) {
			System.out.println("Not a Leap Year");
		}

	}

}
