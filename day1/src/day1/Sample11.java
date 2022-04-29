package day1;

public class Sample11 {
	public static void main (String[] args) {
		System.out.println(String.format("I eat %d apples.", 3));// "I eat 3 apples." 출력
	    System.out.println(String.format("I eat %s apples", "five"));
	    
	    int number = 10;
	    System.out.println(String.format("I eat %d apples", number));
	    
	    String day = "three";
	    
	    System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day));
		System.out.println(String.format("I have %s apples", 3));
		System.out.println(String.format("rate is %s", 3.234));
		
		//System.out.println(String.format("Error is %d%.", 98));
		
		System.out.println(String.format("Error is %d%%.", 98));
		// "Error is 98%." 출력
		
		System.out.println(String.format("%10s", "hi")); // "    hi"
		
		System.out.println(String.format("%-10sjane.", "hi"));
		System.out.println(String.format("%.4f", 3.42134234));
		System.out.println(String.format("%10.4f", 3.42134234));
		System.out.println(String.format("I eat %d apples.", 3));
		System.out.printf("I eat %d apples.", 3);
	}
}