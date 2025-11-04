package Loops;
import java.util.*;
public class Palimdro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num = s.nextInt();
		  int orignal = num ;
		  int reves = 0 ;
		  
		while(num != 0) {
			int degit = num % 10 ;
			reves = reves * 10 + degit ;
			num = num / 10 ;
		}
		
		if(orignal == reves ) {
			System.out.println(orignal + " is a Palindrome Number.");
		}
		else
		{
			System.out.println(orignal + " is  Not  Palindrome Number.");
		}
  s.close();
	}

}
