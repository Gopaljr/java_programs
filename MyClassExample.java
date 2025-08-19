package comm;

import java.util.Scanner;

public class MyClassExample {

	public static void main(String[] container) {
		float a,b,sum;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a=obj.nextInt();
		System.out.println("Enter the Second number: ");
		b=obj.nextInt();
		
		sum=a+b;
		System.out.println("The sum is: " + sum);
		
		
		double x,y,z;
		System.out.println("Enter the first double: " );
		x=obj.nextDouble();
	
		System.out.println("Enter the Second double: ");
		y=obj.nextDouble();
		
		z=x+y;
		System.out.println("The Answer is "+sum);
		
		int m,n,o;
		
		System.out.println("Enter the first number: ");
		m=obj.nextInt();
		System.out.println("Enter the Second number: ");
		n=obj.nextInt();
		
		o=m+n;
		System.out.println("The Sum is: " + o);
		o=m-n;
		System.out.println("The Sub is: "+o);
		o=m*n;
		System.out.println("The Mul is: "+o);
		o=m/n;
		System.out.println("The Div is: "+o);
		
		obj.close();
	}

}
