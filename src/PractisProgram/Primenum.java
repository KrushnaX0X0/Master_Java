package PractisProgram;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        boolean isPrime = true;

	        if (n <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= n / 2; i++) {
	                if (n % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        if (isPrime)
	            System.out.println(n + " is a Prime number.");
	        else
	            System.out.println(n + " is a Composite number.");

	}

}
