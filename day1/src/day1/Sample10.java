package day1;

public class Sample10 {
	public static void main (String[] args) {
		//String a = "Hello Java";
		//System.out.println(a.contains("Java")); // true ���
		
		String a = "a:b:c:d";
		System.out.println(a.charAt(6)); // "J"���
		System.out.println(a.replaceAll("Java", "World")); // Hello World ���
		System.out.println(a.substring(0,4)); // Hell ���
		
		System.out.println(a.toUpperCase()); // HELLO JAVA ���
		
		String[] result = a.split(":"); 
		System.out.println(a);
		
	}
}