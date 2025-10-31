package operators;

import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {
		// Relational Operators
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = s.nextInt();
		System.out.println("Enter 2st number");
		int num2 = s.nextInt(); 
		
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2) );
		System.out.println(num1 + " != " + num2 + " : " + (num1 != num2) );
		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2) );
		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2) );
		System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2) );
		System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2) );
		s.close();
		

	}

}
