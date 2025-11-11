package Patterns;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int row = 1 ; row <= 5 ;row++) 
		{
			for(int start = 1 ; start <= row ; start++ ) {
				System.out.print("");
			}
			for(int str =1 ; str <= row ; str++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
