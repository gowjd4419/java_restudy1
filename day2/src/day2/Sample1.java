package day2;

 public class Sample1 {
	public static void main(String[]args) {
		int[] odds = {1,3,5,7,9};
		String[] weeks = {"월","화","수","목","금","토","일"};
		
		//String[] weeks = new String[7];
		weeks[0] = "월";
		weeks[1] = "화";
		weeks[2] = "수";
		weeks[3] = "목";
		weeks[4] = "금";
		weeks[5] = "토";
		weeks[6] = "일";
		
		//String[] weeks = new String[]; // 길이에 대한 숫자값이 없어서 컴파일 오류발생
		
		System.out.println(weeks[3]);
		for (int i = 0; i<weeks.length; i++) {
			System.out.println(weeks[i]);
			
		}
		System.out.println(weeks[7]);
		// 8번째 배열값이 없어서 오류발생
		
	}
}