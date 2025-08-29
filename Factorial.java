package comm;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int num) {
		int i=1,fact=1;
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int result=factorial(number);
		System.out.println("Factorial of "+number+" is "+result);

	}

}
