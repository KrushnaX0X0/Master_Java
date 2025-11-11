package Function;

public class UserDfun {

	// no input no output
	public void multi()
	{
		int a = 20 ;
		int b = 30 ;
		
		System.out.println(a*b);
		
	}
	
	
	// no input but output
	public int add () {
		int a = 20 ;
		int b = 30 ;
		
		return a + b;
		
	}
	
	// input but no output 
	public void sub(int a, int b) 
	{
		
		System.out.println(a-b);
	}
	
	// input and output
	
	public int div(int a , int b)
	{
		return (a/b);
	}
	
	// 
	  
	
	public static void main(String[] args) {
		// 
		
		UserDfun fun = new UserDfun();
		
//		fun.multi();
//		
//		System.out.println(fun.add());
//		
//		fun.sub(20,10);
		System.out.println(fun.div(10, 2));
		
		

	}

}
