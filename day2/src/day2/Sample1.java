package day2;

 public class Sample1 {
	public static void main(String[]args) {
		int[] odds = {1,3,5,7,9};
		String[] weeks = {"��","ȭ","��","��","��","��","��"};
		
		//String[] weeks = new String[7];
		weeks[0] = "��";
		weeks[1] = "ȭ";
		weeks[2] = "��";
		weeks[3] = "��";
		weeks[4] = "��";
		weeks[5] = "��";
		weeks[6] = "��";
		
		//String[] weeks = new String[]; // ���̿� ���� ���ڰ��� ��� ������ �����߻�
		
		System.out.println(weeks[3]);
		for (int i = 0; i<weeks.length; i++) {
			System.out.println(weeks[i]);
			
		}
		System.out.println(weeks[7]);
		// 8��° �迭���� ��� �����߻�
		
	}
}