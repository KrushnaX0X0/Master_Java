package Polymorphism;
 
public class Overloding {
	public void multi(int a , int b)
	{
		
		System.out.println("MULTIPLIATION OF "+ a + " AND "+ b+ " IS "+a*b);
		
	}
	
	public void multi(float a , float b)
	{
		
		System.out.println("MULTIPLIATION OF "+ a + " AND "+ b+ " IS "+a*b);
		
	}
	
	public void multi(int a , int b,int c)
	{
		
		System.out.println("MULTIPLIATION OF "+ a +" ," + b+ " AND "+ c+ " IS "+a*b*c);
		
	}
	
	public void multi(float a , float b,float c)
	{
		
		System.out.println("MULTIPLIATION OF "+ a +" ," + b+ " AND "+ c+ " IS "+a*b*c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloding ol = new Overloding();
		ol.multi(4, 5);
		ol.multi(4.5f, 5.5f);
		ol.multi(3.5f, 4.6f, 5.5f);
	}

}
