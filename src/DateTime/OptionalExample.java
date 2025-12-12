package DateTime;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO 
//		Optional<String> empty = Optional.empty();
//		Optional<String> present = Optional.of("Hello");
//		Optional<String> nullable = Optional.ofNullable(null);
//		
//		System.out.println(empty);
//		System.out.println(present);
//		System.out.println(nullable);
		
//		Optional<String> optional = Optional.of("Hello");
		Optional<String> optional = Optional.ofNullable(null);
//		Optional<String> optional = Optional.empty();
		optional.ifPresent(System.out::println);
		String value = optional.orElse("Default value");
		System.out.println(value);
		
		
		

	}

}
