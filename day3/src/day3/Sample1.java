package day3;

public class Sample1 {
	public static void main(String[]args) {
		String[] numbers = {"one", "two", "three"};
		for(int i=0; i<numbers.length; i++) {
		    System.out.println(numbers[i]);
		}
		
		int[] marks = {90, 25, 67, 45, 80};
		for(int i=0; i<marks.length; i++) {
		    if (marks[i] >= 60) {
		        System.out.println((i+1)+"�� �л��� �հ��Դϴ�.");
		    }else {
		        System.out.println((i+1)+"�� �л��� ���հ��Դϴ�.");
		    }
		}
		
		for(int i=0; i<marks.length; i++) {
		    if (marks[i] < 60) {
		        continue;
		    }
		    System.out.println((i+1)+"�� �л� �����մϴ�. �հ��Դϴ�.");
		}
		
		for(int i=2; i<10; i++) {
		    for(int j=1; j<10; j++) {
		        System.out.print(i*j+" ");
		    }
		    System.out.println("");
		}
	}
}