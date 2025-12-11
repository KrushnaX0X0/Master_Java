package StringOpretion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InbultFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String str = "Hello all , i am learning java";
//		int len = str.length();
//		System.out.println("String length is : "+len);
//		
//		char ch = str.charAt(20);
//		System.out.println("character at index 20 is : "+ch);
		
		
//SubString Extraction 
		// print only index 
//		String st = "Welcome are fool till when we are not getting overaly knowleg";
//         String sub = st.substring(35);
//         System.out.println("substring is : " + sub);
//         
//         // print as start index and end index 
//         String sub1 = st.substring(38,45);
//         System.out.println("substring is : " + sub1);
		
		
// case conversion 
//		String st = "Welcome are fool till when we are not getting overaly knowleg";
//		String lowe = st.toLowerCase();
//		
//		System.out.println(lowe);
//		String upper = st.toUpperCase();
//		System.out.println(upper);
		
		
// Equlaty and comparison 
//		String one = "i am good";
//		String two = "i am good";
//		System.out.println(one.equals(two));
//		String three = new String("I Am Good");
//		System.out.println(one == three);
//		System.out.println(one.equals(three));
//		
//		boolean v3 = one.equalsIgnoreCase(three);
//		System.out.println(v3);
		
		
// contains
//		String sd = "I am hopping a lot of things";
//		boolean yes  = sd.contains("hopping");
//		System.out.println(yes);
		
//		boolean strat = sd.startsWith("I am");
//		boolean end = sd.endsWith("things");
//		
//		System.out.println("String start with : " + strat);
//		System.out.println("String end with : " + end);
		
// Searching
		
//		String sd = "I am hopping a lot of things";
//		int in = sd.indexOf("a lot");
//		System.out.println(in);
//		int lastin = sd.lastIndexOf("s");
		
// String modification 
		
//		String str = "I am hopping a lot of things";
//		String re = str.replace("I", "we").replace("lot","have");
//		System.out.println(re);
//		
//		String reall = str.replaceAll(" ", "-");
//		System.out.println(reall);
	
// WhiteSpace and trimming
//		String str = "   I am hopping a lot of things     ";
//		System.out.println(str.trim());
		
// Splitting and concatenation
		String str = "I am hopping a lot of things";
		System.out.println(Arrays.toString(str.split(" ")));
		
		String con = str.concat(" i am happy");
		System.out.println(con);
		
		
	}

}
