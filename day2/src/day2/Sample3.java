package day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sample3 {
	public static void main(String[]args) {
		HashMap<String,String>map = new HashMap<>();
		map.put("people","���");
		map.put("baseball","�߱�");
		
		System.out.println(map.keySet());
		
		System.out.println(map.get("people")); 
		
		System.out.println(map.get("java"));
		System.out.println(map.getOrDefault("java", "�ڹ�"));
		System.out.println(map.containsKey("people"));
		System.out.println(map.remove("people"));
		System.out.println(map.size());
		
		
	}
}