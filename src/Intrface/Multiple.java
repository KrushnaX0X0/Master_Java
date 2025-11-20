
package Intrface;

interface parent1{
	public void hii(); 
}

interface parent2{
	public void hello(); 
}

interface child extends parent1 ,parent2
{
	public void hey();
}

public class Multiple implements child {
	
	public void hii() {
		System.out.println("hii");
	}
	
	
	public void hello() {
		System.out.println("hello");
	}
	
	
	public void hey() {
		System.out.println("hey");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple m = new Multiple();
		m.hii();
		m.hello();
		m.hey();
		

	}

}
