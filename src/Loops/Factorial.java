package Loops;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner  s = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n = s.nextInt();
	   int fact = 1;
	    for(int i = n ; i >=1 ; i--) {
	    	 fact*=i;
	    } 
	    System.out.println("Factorial of " + n + " is " + fact);
	    
	    
	    s.close();
	}
}
