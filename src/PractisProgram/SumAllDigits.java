package PractisProgram;

import java.util.Scanner;

public class SumAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        long n = sc.nextLong();
	        long sum = 0;

	        while (n > 0) {
	            sum += n % 10;
	            n = n / 10;
	        }

	        System.out.println("Sum of digits: " + sum);

	}

}
