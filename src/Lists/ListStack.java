package Lists;

import java.util.Stack;

public class ListStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> st = new Stack<>();
		
		//Pushing element 
		st.push("A");
		st.push("B");
		st.push("C");
		
	//Popping  element 
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		//Checking if the stack is empty 
		System.out.println(st.isEmpty());
		
		

	}

}
