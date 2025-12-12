package StreamsExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<String> list = Arrays.asList("a","b","c");
//		List<String> upperCaseList = list.stream().map(String::toUpperCase).collect(Collectors.toList());
//		
//		System.out.println(upperCaseList);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		List<Integer> evennumber = list.stream().filter(n->n%2 ==0).collect(Collectors.toList());
		System.out.println(evennumber);
		

	}

}
