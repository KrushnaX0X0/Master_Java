package Polymorphism;

public class Examples {
	
	int Add(int a ,int b,int c , int d,int e )
	{
	   return a+b+c+d+e;
	}
	float Add(float a ,float b,float c , float d,float e )
	{
	   return a+b+c+d+e;
	}
	
	long Add(long a ,long b,long c , long d,long e )
	{
	   return a+b+c+d+e;
	}
	
	double Add(double a ,double b,double c , double d,double e )
	{
	   return a+b+c+d+e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examples e = new Examples();
		System.out.println(e.Add(12, 13, 14, 15, 16));
        System.out.println(e.Add(2.5f,3.5f , 4.5f, 5.5f,6.5f));
		System.out.println(e.Add(1332, 232, 313, 1313, 3231));
		System.out.println(e.Add(1.1, 0.1,0.23, 1.12, 22.3));
		
		

	}

}
