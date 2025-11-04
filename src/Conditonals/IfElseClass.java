package Conditonals;
import java.util.*;
public class IfElseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The number : ");
		int n = s.nextInt();
		
		if(n > 5) {
			System.out.println(n + " is grater than 5 .");
		}
		else {
			System.out.println(n + " is not grater than 5 .");
		}
     s.close();
	}

}
