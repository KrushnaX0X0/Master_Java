package operators;
import java.util.Scanner;
public class Arithmatic {

	public static void main(String[] args) {
		// Arithmatic operators 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = s.nextInt();
		System.out.println("Enter 2st number");
		int num2 = s.nextInt(); 
		System.out.println("Addition of "+ num1 + " and " + num2 + "is"+ (num1+num2));
		System.out.println("Subtrction of "+ num1 + " and " + num2 + "is"+ (num1-num2));
		System.out.println("Multiplication of "+ num1 + " and " + num2 + "is"+ (num1*num2));
		System.out.println("Division of "+ num1 + " and " + num2 + "is"+ (num1/num2));
		System.out.println("Remainder of "+ num1 + " and " + num2 + "is devied by "+ (num1%num2));
		s.close();

	}

}
