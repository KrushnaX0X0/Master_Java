package Patterns;

public class Seven {

	public static void main(String[] args) {
		for(int row=1 ; row<=5;row++)
		{
			for(int spac= 5 ; spac > row ; spac-- )
			{
				 System.out.print(" ");
			}
			
			
			for(int str = 1; str <= row ; str ++ ) 
			{
				 System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
