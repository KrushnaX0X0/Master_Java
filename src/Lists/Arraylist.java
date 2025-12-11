package Lists;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	ArrayList list = new ArrayList();
//		list.add("India");
//		list.add("Is");
//		list.add(2,"My");
//		list.add(3,"Country");
//
//		  System.out.println(list.get(0));
//		  System.out.println(list.get(3));
//		  
//		  list.add(1,"-");
//		  for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));  
		
		
//			List names = new ArrayList();
//			names.add("harray");
//			names.add(null, 1);
//			names.add(true);
//			
//			
//		List<String> names1 = new ArrayList();
//		names.add("harray");
//		names.add(1);
//		names.add(true);
		
		
		LinkedList<String> li = new LinkedList<>();
		
		// Adding element 
		li.add("A");
		li.addFirst("A");
		li.addLast("C");
		
		// Accessing element 
		System.out.print(li.getFirst() + " ");
		System.out.print(li.get(1)+ " ");
		
		// Removing elememt 
		li.removeLast();
		
		for(String iteam : li) {
			System.out.print(iteam + " ");
		
		
		  }
	}

}
