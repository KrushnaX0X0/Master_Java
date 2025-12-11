package LamdaEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.*;

@FunctionalInterface
interface MyFunction{
	void myMethod();
}

public class Exap2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("ENTER YOUR NUMBER :");
//		int no = sc.nextInt();
//		System.out.print("ENTER YOUR String :");
//		String st = sc.next();
		
		
//		MyFunction func = ()->System.out.println("Hello dear...!");
//		func.myMethod();
		
//		Predicate<Integer> even =(num)-> num %2 == 0;
//		System.out.println(even.test(no));
//		
//		Function<String,Integer> stringlen = str->str.length();
//		System.out.println("Your String Length is : "+stringlen.apply(st));
		
//		Supplier<Double> randomno =()->Math.random();
//		System.out.println(randomno.get());

//		
//		Consumer<String> printstr = str-> System.out.print(str);
//		printstr.accept("hello");
		
		List<String> list = Arrays.asList("a","b","c");
//		list.forEach(i->System.out.println(i));
		list.forEach(System.out::println);
		list.forEach(i->System.out.println(i));
	}

}
