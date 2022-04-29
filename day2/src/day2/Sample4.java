package day2;

import java.util.ArrayList;

public class Sample4 {
	public static void main(String[]args) {
		boolean money = true;
		if(money) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
		
		int x = 3;
		int y = 2;
		System.out.println(x > y); 
		System.out.println(x < y);
		System.out.println(x == y);
		System.out.println(x != y); 
		
		int money1 = 2000;
		if (money1 >= 3000) {
		    System.out.println("택시를 타고 가라");
		}else {
		    System.out.println("걸어가라");
		}
		
		int money2 = 2000;
		boolean hasCard = true;

		if (money2>=3000 || hasCard) {
		    System.out.println("택시를 타고 가라");
		} else {
		    System.out.println("걸어가라");
		}
		
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("handphone");
		pocket.add("money");

		if (pocket.contains("money")) {
		    System.out.println("택시를 타고 가라");
		}else {
		    System.out.println("걸어가라");
		}
		
		boolean hasCard1 = true;
		ArrayList<String> pocket1 = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("handphone");

		if (pocket.contains("money")) {
		    System.out.println("택시를 타고 가라");
		}else {
		    if (hasCard) {
		        System.out.println("택시를 타고 가라");
		    }else {         
		        System.out.println("걸어가라");
		    }
		}
		
		boolean hasCard2 = true;
		ArrayList<String> pocket2 = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("handphone");

		if (pocket.contains("money")) {
		    System.out.println("택시를 타고 가라");
		}else if(hasCard) {
		    System.out.println("택시를 타고 가라");
		}else {         
		    System.out.println("걸어가라");
		}
		
	}
}