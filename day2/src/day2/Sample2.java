package day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

 public class Sample2 {
	public static void main(String[]args) {
		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		
		//pitches.add(0,"133"); // ù��° ��ġ�� 133 ����.
		pitches.add(1,"133"); // �ι�° ��ġ�� 133 ����.
		
		System.out.println(pitches.get(1));
		System.out.println(pitches.size());
		System.out.println(pitches.contains("142"));
		
		System.out.println(pitches.remove("129"));
		System.out.println(pitches.remove(0));
		

		String one = (String) pitches.get(0); // �� ��ȯ�� �ʿ����.
		String two = (String) pitches.get(1); // //
		
		ArrayList<String> pitches1 = new ArrayList<>();
		pitches1.add("138");
        pitches1.add("129");
        pitches1.add("142");
        System.out.println(pitches1);
        
        String[] data = {"138", "129", "142"};
        ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches2);
        
        ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches3);
        
        ArrayList<String> pitches4 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = "";
        for (int i = 0; i < pitches4.size(); i++) {
            result += pitches4.get(i);
            result += ",";  // �޸��� �߰��Ѵ�
        }
        result = result.substring(0, result.length() - 1);  // ������ �޸��� �����Ѵ�
        System.out.println(result);  // 138,129,142 ���
        
        ArrayList<String> pitches5 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result1 = String.join(",", pitches5);
        System.out.println(result1);
        
        String[] pitches6 = new String[]{"138", "129", "142"};
        String result2 = String.join(",", pitches6);
        System.out.println(result2);
        
        
        ArrayList<String> pitches7 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches7.sort(Comparator.naturalOrder());  // ������������ ����
        System.out.println(pitches7);
        

	}
}