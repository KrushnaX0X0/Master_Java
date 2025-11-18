package Inheritance;

class parant {
	String name;
	void hello () { 
		System.out.println("i am prant");
	}
}

class child extends parant {
	public void say() {
		System.out.println("i am : " + name);
	}
}
     

public class Singal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ch = new child();
		ch.name = "krushna";
		ch.say();
		ch.hello();
		
	}

}
