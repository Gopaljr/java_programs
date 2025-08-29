package comm;

import java.util.Scanner;

public class Calculator {
	public static int add(int a,int b) {
		return a+b;
	}
	public static int subtract(int a,int b) {
		return a-b;
	}
	public static int multiply(int a,int b) {
		return a*b;
	}
	public static double divide(int a,int b) {
		return a/b;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int num2=sc.nextInt();
		
		System.out.println("Enter the operator(+ , -, *, /): ");
		char operator=sc.next().charAt(0);
		
		int result=0;
		double result2=0;
		
		if(operator=='+') {
			result=add(num1,num2);
			System.out.println("The Result is: "+result);
		}
		else if(operator=='-') {
			result=subtract(num1,num2);
			System.out.println("The Result is: "+result);
		}
		else if(operator=='*') {
			result=multiply(num1,num2);
			System.out.println("The Result is: "+result);
		}
		else if(operator=='/') {
			result2=divide(num1,num2);
			System.out.println("The Result is: "+result2);
		}
		else {
			System.out.println("Invalid operator");
		}
		
		
	}

}
