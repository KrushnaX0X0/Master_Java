package DateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
//		LocalTime time = LocalTime.now();
//		LocalDateTime datetime = LocalDateTime.now();
//		
//		System.out.println(date);
//		System.out.println(time);
//		System.out.println(datetime);
		
		LocalDate parsedDate = LocalDate.parse("2024-08-03");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = date.format(formatter);
		System.out.println(formattedDate);

	}

}
