package Intrface;

abstract class Shap 
{
	int length = 10;
	int width = 8 ;
	float radius = 8;
	float pi = 3.14f;
	
	abstract void area();
}

class Cricle extends Shap{
	void area() {
		System.out.println("AREA OF CIRXLE : "+ pi*radius*radius);
	}
}

class Rectangle extends Shap{
	void area() {
		System.out.println("AREA OF Rectangle : "+ length* width);
	}
}




public class AreaF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cricle c = new Cricle();
		Rectangle r = new Rectangle();
		c.area();
		r.area();
		

	}

}
