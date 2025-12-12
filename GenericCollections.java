package Server;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

//? - means we dont know the type but we are gonna read it
//? extends Number, Integer, Boolean, String etc means we can read of this type
//? super Integer, String, etc means we can write to of this type

//List.of immutable
//Arrays.asList - fixed sized and can be mutable with .set( , )


public class Driver{
	
	public static<T> void printArray(T[] array) {
		for(T element : array) {
			System.out.println(element);
		}
	}
	
	public static void printList(List<?> list){
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	
	public static void printNumbersList(List<? extends Number> list) {
		for(Number n : list) {
			System.out.println(n);
		}
	}
	
	public static void addNums(List<? super Integer> list) {
		list.add(10);
		list.add(20);
	}
	
	
	public static void main(String[] args) {
		
		
		List<String> names = List.of("Kevin", "Sam", "Leo");
		List<String> namesAgain = Arrays.asList("Stevie", "John", "Hulk");
		
		
		
		
	

		printList(names);
		
		
		namesAgain.set(0, "Bobby");
		printList(namesAgain);
	
		
		
		List<Integer> nums = List.of(1,2,3,4,5);
		List<Double> numsAgain = List.of(1.1, 1.2, 1.3, 1.4);
		
		
		printNumbersList(nums);
		printNumbersList(numsAgain);
		
		
		List<? super Integer> list = new ArrayList<Number>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		
		
		
		
		String[] words = {"yessir", "bananas", "Sandwiches"};
		
		
		printArray(words);
	
		
		
		
		
		
	}
	
	
	
	
	
}
