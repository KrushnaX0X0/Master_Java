package Conditonals;
import java.util.*;
public class Ifclass {

	public static void main(String[] args) {
		// if Statement 
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = s.nextInt();
		if(number > 5) {
			System.out.println(number  +  " is Larger than 5.");
		}
    s.close();
	}

}
