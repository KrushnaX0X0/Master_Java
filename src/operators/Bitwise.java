package operators;

public class Bitwise {

	public static void main(String[] args) {
		// Bitwise Operators
		
		int x = 11 ;
		int y = 30 ;
		
		System.out.println("Bitwise And : " + (x & y));
		System.out.println("Bitwise or : " + (x | y));
		System.out.println("Bitwise negation : " + ( ~y));
		System.out.println("Bitwise left Shift : " + ( y<<2));
		System.out.println("Bitwise Right Shift : " + ( y>>2));

	}

}
