package ObjectOrient;

  
 class Person {
	 private int age ;

	 public int getAge() {
		 return age;
	 }

	 public void setAge(int age) {
		 this.age = age;
	 }
	 
 }



public class SetterGatter {

	public static void main(String[] args) {
		
		Person p = new Person();
		 p.setAge(20);
		System.out.println("Age is : "+p.getAge());
		

	}

}
