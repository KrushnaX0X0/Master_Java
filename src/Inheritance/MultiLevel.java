package Inheritance;


    class One
    {
    	void print_hello () {
    		System.out.println("hello Everyone...");
    	}
    }
    
    class Two extends One {
    	
    	
    }
    
    class Three extends Two {
    	
    }
    
public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three t3 = new Three();
		t3.print_hello();

	}

}
