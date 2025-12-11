
package Intrface;

import java.util.Scanner;

interface shape
{
	public void area();
	final float pi = 3.14f;
}

class Triangle implements shape
{
	public void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER BASE OF Triangle : ");
		int base = sc.nextInt();
		System.out.print("ENTER HIGHT OF Triangle : ");
		int hight = sc.nextInt();
		int area = (base*hight)/2;
		System.out.print("Area of Triangle : " + area);
	}
}

class Recttringal implements shape
{
	public void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER length OF Recttringal : ");
		int length = sc.nextInt();
		System.out.print("ENTER width OF Recttringal : ");
		int width = sc.nextInt();
		int area = length * width;
		System.out.print("Area of Recttringal : " + area);
	}
}


class Circle implements shape
{
	public void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER BASE OF RADIYES : ");
		float radis = sc.nextInt();
		float area = pi*radis*radis;
		System.out.print("Area of Circle : " + area);
	}
}

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle();
		Recttringal r = new Recttringal();
		Circle c = new Circle();
		
		t.area();
		r.area();
		c.area();
		
	}

}
