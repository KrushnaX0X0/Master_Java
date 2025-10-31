package operators;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		// Logical Operators
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = s.nextInt();
		System.out.println("Enter 2st number");
		int b = s.nextInt(); 
		System.out.println("Enter 3st number");
		int c = s.nextInt();
		System.out.println("a < b and b < c : " + (a < b && b < c));
		System.out.println("a < b or b < c : " + (a < b || b < c));
		System.out.println("a < b not b < c : " + !( b < c));

	}

}
