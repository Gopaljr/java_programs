package comm;

import java.util.Scanner;

public class CheckPalindrome {
	
	public static boolean palindrome(int num) {
		int original=num;
		int reverse=0;
		
		while(num!=0) {
			int number=num%10;
			reverse=reverse*10+number;
			num=num/10;
		}
		return original==reverse;
	}
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=obj.nextInt();
		
		if(palindrome(a)) {
			System.out.println(a+" is a Palindrome");
		}
		else {
			System.out.println(a+" is Not a Palindrome");
		}

	}

}
