package operators;

public class Assignment {

	public static void main(String[] args) {
		// Assignment operators
		
		int a = 5 ;
		int b = 7 ;
		int c = a ;
		System.out.println("c : " + c );
		System.out.println(" a += b  : " + (a+=b) );
		System.out.println(" a -= b  : " + (a-=b) );
		System.out.println(" a *= b  : " + (a*=b) );
		System.out.println(" a /= b  : " + (a/=b) );
		System.out.println(" a %= b  : " + (a%=b) );
		
		
	}

}
