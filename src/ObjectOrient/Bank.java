package ObjectOrient;

import java.util.Scanner;

class person {
	private String  customer_name;
	private int   alc_number ; 
	private int   balance ;
	
	
	
	public String getCustomer_name() {
		return customer_name;
	}



	public int getAlc_number() {
		return alc_number;
	}



	public int getBalance() {
		return balance;
	}



	person(String c,int a ,int b){
		this.customer_name = c;
		this.alc_number = a ;
		this.balance = b ;
	}
	
	
	
	
	
  }


public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		   System.out.print("ENTER YOUR NAME : ");
		   String n = s.next();
		   
		   System.out.print("ENTER YOUR A/C NUMBER : ");
		   int a = s.nextInt();
		   
		   
		   System.out.print("ENTER YOUR Balance : ");
		   int bal = s.nextInt();
		   
		   System.out.println();
		   
		
		person b = new person(n,a,bal);
		
		System.out.println(b.getCustomer_name());
		System.out.println(b.getAlc_number());
		System.out.println(b.getBalance());

	}

	
}
