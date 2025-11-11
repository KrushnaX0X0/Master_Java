package PractisProgram;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n = n / 10;
        }

        if (sum == temp)
            System.out.println(temp + " is an Armstrong number.");
        else
            System.out.println(temp + " is not an Armstrong number.");


	}

}
