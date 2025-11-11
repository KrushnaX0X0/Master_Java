package Array;

import java.util.Scanner;

public class TwoDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.print("ENTER NUMBER OF CLASS : ");
       int cls  = sc.nextInt();
       
       System.out.println("ENTER NUMBER OF STUDENTS(All Class ) : ");
       int stu = sc.nextInt();
       
       
       int arr[][] = new int[cls][stu] ;
       
       for(int i = 0 ; i < arr.length ; i++)
       {
    	   for(int j=0 ; j < arr[i].length ; j++)
    	   {
    		   System.out.print("ENTER THE AGE OF CLASS " + (i+1) +" S " + (j+1) + " STUDENT :" );
    		   arr[i][j] = sc.nextInt();
    	   }
    	   System.out.println();
       }
       System.out.println();
       
       
       for(int i = 0 ; i < arr.length ; i++)
       {
    	   for(int j=0 ; j < arr[i].length ; j++)
    	   {
    		   System.out.println("  AGE OF CLASS " + (i+1) +" S " + (j+1) + " STUDENT : " + arr[i][j] );
    		   
    	   }
    	   System.out.println();
       }

	}

}
