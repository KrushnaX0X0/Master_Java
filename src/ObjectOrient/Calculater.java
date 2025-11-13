package ObjectOrient;

import java.util.Scanner;

public class Calculater {

    void calculator(int a, int b, String k) {
       
    	   if (k.equals("+")) {
               System.out.println(a + b);
           } 
           else if (k.equals("-")) {
               System.out.println(a - b);
           } 
           else if (k.equals("*")) {
               System.out.println(a * b);
           } 
           else if (k.equals("/")) {
               System.out.println(a / b);
           } 
           else {
               System.out.println("Invalid operator!");
           }  
       

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE FIRST NUMBER: ");
        int a = sc.nextInt();

        System.out.print("ENTER THE SECOND NUMBER: ");
        int b = sc.nextInt();

        System.out.print("ENTER THE OPERATOR (+, -, *, /): ");
        String k = sc.next();

        Calculater cal = new Calculater();
        cal.calculator(a, b, k);
    }
}
