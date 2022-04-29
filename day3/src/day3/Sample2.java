package day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Sample2 {
	public static void main(String[]args) {
	String[] numbers = {"one", "two", "three"};
	for(int i=0; i<numbers.length; i++) {
	    System.out.println(numbers[i]);
	}
	String[] numbers1 = {"one", "two", "three"};
	for(String number: numbers1) {
	    System.out.println(number);
	}
	
	 ArrayList<String> numbers2 = new ArrayList<>(Arrays.asList("one", "two", "three"));
     for (String number : numbers) {
         System.out.println(number);
     }
  }
}