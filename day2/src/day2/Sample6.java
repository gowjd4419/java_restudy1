package day2;

public class Sample6 {
	public static void main(String[]args) {
		//int treeHit = 0;
		//while (treeHit < 10) {
		  //  treeHit++;
		    //System.out.println("������  " + treeHit + "�� ������ϴ�.");
		    //if (treeHit == 10) {
		      //  System.out.println("���� �Ѿ�ϴ�.");
		int coffee = 10;
		int money = 300;

		while (money > 0) {
		    System.out.println("���� �޾����� Ŀ�Ǹ� �ݴϴ�.");
		    coffee--;
		    System.out.println("���� Ŀ���� ���� " + coffee + "�Դϴ�.");
		    if (coffee == 0) {
		        System.out.println("Ŀ�ǰ� �� ���������ϴ�. �ǸŸ� �����մϴ�.");
		        break;
		    }
		}
		int a = 0;
		while (a < 10) {
			a++;
			if(a % 2 == 0) {
				continue; // ¦���� ��� ���ǹ����� ���ư�
			}
			System.out.println(a); // Ȧ���� ���
		}
		
		//while (true) {
		  //  System.out.println("Ctrl-C�� ������ while���� ���� ���� �� �ֽ��ϴ�.");
		//}
		
		
	}
}