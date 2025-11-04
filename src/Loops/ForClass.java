package Loops;
import java.util.*;
public class ForClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n = s.nextInt();
		
		for(int i=10;i>=1;i--) {
			System.out.println(i +"*" + n + "=" + i*n);
		}

	}

}
