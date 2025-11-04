package Conditonals;
import java.util.*;
public class ElseIfClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s = new Scanner(System.in);
         System.out.println("Enter The Number : ");
         int  n = s.nextInt(); 
         if(n > 5) {
        	 System.out.println(n + " is larger than 5 ");
         }
         else if(n < 5) 
         {
        	 System.out.println(n + " is lesser than 5 "); 
         }
         else {
        	 System.out.println(n + " = Five ");
         }
         
         s.close();
	}

}
