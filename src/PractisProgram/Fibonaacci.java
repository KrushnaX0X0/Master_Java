package PractisProgram;

import java.util.Scanner;

public class Fibonaacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of terms: ");
	        int n = sc.nextInt();

	        int a = 0, b = 1,c;
//	        System.out.print("Fibonacci Series: " + a + " " + b);

	        if(n > 0) 
	        {
	        	
	        	if( n ==1 ) 
	        	{
	        		System.out.print(a);
	        	}
	        	else if(n==2)
	        	{
	        	   System.out.print(a + "\t" + b);	
	        	}
	        	else
	        	{
	        		System.out.print(a + "\t" + b);
	        	    for(int i = 2 ; i < n;i++) 
	        	    {	
	        	           c = a + b ;
	        	          a = b;
	        	          b = c;
	        	          System.out.print("\t"+ c);
	        	          
	        	          
	        	    }
	        	}
	        	
	        }
	        else {
	        	System.out.println("Invalid Number");
	        }


	}

}
