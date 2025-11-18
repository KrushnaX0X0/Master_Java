package Inheritance;


  class Prant 
  {
	  String name = "krushna" ;
	  void info()
	  {
		 System.out.println("Hello all, i am "+ name); 
	  }
  }
  
  class Chlid1 extends Prant
  {
	  String name = "rushi";
	  void info() {
		  System.out.println("Hello all, i am "+ name); 
	  }  
  }
  
  class Chlid2 extends Prant
  {
	  String name = "Siddhu";
	  void info() {
		  System.out.println("Hello all, i am "+ name); 
	  }
  }
  
  class Chlid3 extends Prant
  {
	  
  }


public class Hirarchical {

	public static void main(String[] args) {
		// Hirachical 
		Chlid1 c1 =  new Chlid1();
		Chlid2 c2 = new Chlid2();
		Chlid3 c3 =  new Chlid3();
		c1.info();
		c2.info();
		c3.info();		
	}

}
