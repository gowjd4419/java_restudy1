package day1;

public class Sample10 {
	public static void main (String[] args) {
		//String a = "Hello Java";
		//System.out.println(a.contains("Java")); // true 출력
		
		String a = "a:b:c:d";
		System.out.println(a.charAt(6)); // "J"출력
		System.out.println(a.replaceAll("Java", "World")); // Hello World 출력
		System.out.println(a.substring(0,4)); // Hell 출력
		
		System.out.println(a.toUpperCase()); // HELLO JAVA 출력
		
		String[] result = a.split(":"); 
		System.out.println(a);
		
	}
}