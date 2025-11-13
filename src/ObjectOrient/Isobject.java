package ObjectOrient;

public class Isobject {

	public static void main(String[] args) {
		// 
		Isobject isobj = new Isobject();
		
		boolean ob = isobj instanceof Isobject ;
		
		if(ob) 
			
		{
			System.out.println("isobje is an object of isobject class");
		}
		else 
		{
			System.out.println("isobje is not an object of isobject class");
		}
		

	}

}
