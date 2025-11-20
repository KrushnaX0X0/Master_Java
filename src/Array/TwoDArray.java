package Array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER YOUR COLLAGE :");
		int r = sc.nextInt();
		System.out.print("ENTER YOUR STUDENT IN ONE CLASS : ");
		int c = sc.nextInt();
		
		int arr[][] = new int[r][c];
		
		for(int i = 0; i < arr.length ; i++)
		{
			for(int j=0;j < arr[i].length;j++)
			{
				System.out.print("ENTER STUDENT NUMBER "+ (i+1)+" : " );
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i = 0; i < arr.length ; i++)
		{
			for(int j=0;j < arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}

}
