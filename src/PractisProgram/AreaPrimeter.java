package PractisProgram;

import java.util.Scanner;

public class AreaPrimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter radius: ");
	        double r = sc.nextDouble();

	        double area = Math.PI * r * r;
	        double perimeter = 2 * Math.PI * r;

	        System.out.println("Area of Circle: " + area);
	        System.out.println("Perimeter of Circle: " + perimeter);


	}

}
