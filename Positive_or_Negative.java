package comm;
import java.util.Scanner;

public class Positive_or_Negative {
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=obj.nextInt(); 
		
		
		if(num>0) {
			System.out.println("It is Positive");
		}
		if(num<0) {
			System.out.println("It is Negative");
		}
	}
}
