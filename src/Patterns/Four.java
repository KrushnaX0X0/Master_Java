package Patterns;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int row = 1 ; row <= 5 ;row++) 
		{
			for(int start = 1 ; start >= 5 ; start++ ) {
				System.out.print("*");
			}
			for(int str =1 ; str <= 5 ; str++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
