package ObjectOrient;


 class Area {
	int length ,breadth;
	
	Area(int l , int b )
	{
	    this.length = l;
	    this.breadth = b ;
	}
	
	void getarea() 
	{
	     int area = length *  breadth;
	     System.out.println("Area of rectangal having "+length+" and "+breadth+" is "+area);
	}
	
}


public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area ar = new Area(17,12);
		ar.getarea();
		
		System.out.println(ar.length);
		System.out.println(ar.breadth);

	}

}
