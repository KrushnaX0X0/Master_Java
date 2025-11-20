package Object;

import java.util.Scanner;

public class Arrayofconstru {
	  
    String name;
    int age;
    int roll;

    Arrayofconstru(String st, int a, int r) 
    {
        this.name = st;
        this.age = a;
        this.roll = r;
    }

    void display() {
        System.out.println("Hello I am " + name + " my age is : " + age  + " and My roll number is :" + roll);
    }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
         System.out.print("ENTER YOUR ELEMENT :");
         int n = sc.nextInt();
            
        
    	Arrayofconstru obj[] = new Arrayofconstru[n];


   
        for(int i = 0;i < n ; i++)
        {
        	 System.out.print("ENTER YOUR NAME : ");
             String na = sc.next();
             
             System.out.print("ENTER YOUR AGE : ");
             int ag = sc.nextInt();

             System.out.print("ENTER YOUR ROLL NO : ");
             int ro = sc.nextInt();
        	obj[i] = new Arrayofconstru(na, ag, ro);

        }


        for(int i = 0; i < n; i++) {
            obj[i].display();
        }

}
}
