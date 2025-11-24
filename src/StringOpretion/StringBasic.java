package StringOpretion;

public class StringBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = "hello";
//		String str2 = "hello";
//		// str1 and str2 refres to the same object in the same pool
//		System.out.println(str1 == str2);

		String str3 = new String("World"); 
		String str4 = new String("World");
		// str3 and str4 are diffrent object in the haeap
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		 
	}

}

