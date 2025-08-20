package comm;
import java.util.Scanner;
public class NumericString {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Numeric String: ");
		String numericString=obj.nextLine();
		
		Integer intValue =new Integer(numericString);
        Long longValue = new Long(numericString);
        Float floatValue = new Float(numericString);
        Double doubleValue = new Double(numericString);
		
    
		
		System.out.println("Integer value: "+intValue);
		System.out.println("Long value: "+longValue);
		System.out.println("Float value: "+floatValue);
		System.out.println("Double value: "+doubleValue);
				
	}

}
