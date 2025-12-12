package Server;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.*;


//lambdas can only be applied to functional interfaces in java
//functional interfaces only contain one abstract method

public class Driver{
	
	public static void printList(List<?> list){
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Kevin", "Sam", "Leo");
		
		
		names.sort((a, b) -> a.length() - b.length());;
		System.out.println(names);
		
		Predicate<Integer> isEven = x -> x % 2 == 0;
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		
		for(Integer n : nums) {
			if(isEven.test(n)) {
				System.out.println(n);
			}
		}
		
		Function<String, String> toUpper = s -> s.toUpperCase();
		
		List<String> words = Arrays.asList("Bob", "Steve", "Johnny");
		
		for(String w : words) {
			System.out.println(toUpper.apply(w));
		}
		
		Consumer<String> printer = s -> System.out.println("Name: " + s);
		
		words.forEach(printer);
		
		
		
		
		
		
		//predicate takes a value returns true or false
		//Function<T, R> like a function takes in something a returns something
		//Consumer<?> takes something performs an action and return nothing
		//Supplier<T> returns a value no inputs
		//Comparator<T> compares two objects and returns negative, zero, or positive
		
		
		
	
	
		
		
	}
	
	
	
	
}
