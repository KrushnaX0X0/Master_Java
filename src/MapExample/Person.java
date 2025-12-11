package MapExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	
	public Person(String name ,int age) {
		this.name = name;
		this.age = age;
		
	}
	
	
	@Override
	public int compareTo(Person other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, other.age);
	}
	
	public String toString() {
		return name + ":"+ age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> people = Arrays.asList(
				new Person("krushna",20),
				new Person("prthmesh",24),
				new Person("pavan",18)
				);

		 Collections.sort(people);
		 
		 for(Person p : people) {
			 System.out.println(p);
		 }
		 
		 
	

}

}
