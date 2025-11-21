package Abstraction;


abstract class Bike{
	abstract void run();
}


class Hello extends Bike{
	void run() {
		System.out.println("The XML 250 RUNS VERY WELL. WHICH IS FROM HERO MOTORS.");
	}
}

public class CarModel {

	public static void main(String[] args) {
		// 
		Hello h = new Hello();
		h.run();

	}

}
