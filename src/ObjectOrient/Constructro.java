package ObjectOrient;

public class Constructro {
   String name ;
   int age ;
   
   Constructro(){
	   System.out.println("DEFULT CONSTRUCTOR");
   }
   
	Constructro(String n , int a)
	{
      name = n;
      age = a ;
	}
	
	
	void test()
	{
		System.out.println("I AM "+ name + " MY AGE IS : "+ age);
	}
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructro b = new Constructro("krushna",20);
		
		
		
		b.test();
		
		Constructro a = new Constructro();

	}

}
