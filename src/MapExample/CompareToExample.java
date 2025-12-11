package MapExample;
import java.util.List;  
import java.util.Arrays;
import java.util.Comparator;

class Person1{
	private String name ;
	private int age;
	
	
	public Person1(String name ,int age) {
		this.name = name ;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + ":"+ age ;
	}
}


public class CompareToExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person1> people = Arrays.asList(
				new Person1("krushna",20),
				new Person1("sarthak",25)
				);
		
		Comparator<Person1> nameComparator = new Comparator<Person1>() {

			@Override
			public int compare(Person1 p1, Person1 p2) {
				// TODO Auto-generated method stub
				return p1.getName().compareTo(p2.getName());
			}
		};
		
		people.sort(nameComparator);
		
		for(Person1 p : people) {
			System.out.println(p);
		}

	}

}
