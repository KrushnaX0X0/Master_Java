package LamdaEx;

import java.util.Arrays;
import java.util.List;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//syntax
//		(parameters) -> expression
		
		
		// Example
	List<String> list = Arrays.asList("a","b","c");
//	list.forEach(i->System.out.println(i));
	list.forEach(System.out::println);
	list.forEach(i->System.out.println(i));
	

	}

}

