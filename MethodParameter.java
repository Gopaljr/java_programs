package comm;
import java.util.Scanner;
public class MethodParameter {
	public static void divBy12 (int num){
		if(num%12==0) {
			System.out.println(num+ " is Divisible by 12. ");
		}
		else {
			System.out.println(num+ " is Not Divisible by 12. ");
		}
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=obj.nextInt();
		
		divBy12(number);

	}

}
