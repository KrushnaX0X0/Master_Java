package Array;

import java.util.Scanner;
import java.util.*;
public class SingalDamationalArray {

	public static void main(String[] args) {
		// one Dimentional Array 
		
		Scanner sc = new Scanner(System.in);
	 
//		 System.out.println("ENTER NUMBER OF ELEMENT IN 1D ARRAY : ");
//		 int n = sc.nextInt();
		
		int[] arr = {12,20,19,18,17,23};
		
		
//		for(int i = 0 ; i < arr.length ; i++) 
//		{
//			System.out.print("ENTER number " + i + ":");
//			 a = sc.nextInt();
//			arr[i] = a;
//		}
//		
//		for(int j = 0 ; j < arr.length ; j++) {
//			System.out.println("ARRAY ["+ j + "] "+ arr[j]);
//		}
//		

		Arrays.sort(arr);
		for(int e:arr) {
			System.out.println(e);
		}
		  
	}

}
