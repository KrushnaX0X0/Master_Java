package Inheritance;

class Demo1
{
   void hello ()
   {
	   System.out.println("hello Student,from Demo1");
   }
}

class Demo2 extends Demo1
{
	void hello ()
	   {
		   System.out.println("hello Student,from Demo2");
	   }
	
}

class Test1 extends Demo2
{
	void hello ()
	   {
		   System.out.println("hello Student,from test1");
	   }
}

class Test2 extends Demo2
{
	void hello ()
	   {
		   System.out.println("hello Student,from test2");
	   }
	
}


public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Demo2 d2  = new Demo2();
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		d2.hello();
		d2.hello();
		t1.hello();
		t2.hello();
		
	}

}
