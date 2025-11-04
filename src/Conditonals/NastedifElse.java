package Conditonals;
import java.util.*;
public class NastedifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
         System.out.println("ENTER YOUR USERNAME : ");
          String name = s.nextLine();
          System.out.println("ENTER YOUR PASSOWARD : ");
          Number pass = s.nextInt();
          
          if(name.equals("krushna")) {
        	  if( pass.equals(1234)) {
        		  System.out.println("Welcome To Dashbord ");
        	  }
        	  else {
        		  System.out.println("Invalid Credentials");
        			  
        		  }
        	  }else {
        	  System.out.println("User Not Fond...!");
              }
       s.close();
	}

}
