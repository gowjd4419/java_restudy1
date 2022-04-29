package day3;

public class Sample3 {
    public static void main(String[] args) {
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }
        
        // wife라는 단어는 없기때문에 거짓이고 once와 run 둘다 있기때문에 거짓
        // everywhere라는 단어는 없으므로 참이여서 출력
        // anywhere도 없지만 먼저 참인것이 출력됨
        
       /* int result = 0;
        int i = 1;
        while (i <= 1000) {
            if (i % 3 == 0) {
                result += i;
            }
            i += 1;
        }
        System.out.println(result);
        // 정답 166833
         */
        
        
       /* int i = 0;
        while (true) {
            i += 1;
            if (i > 5) { 
                break;
            }
            for (int j = 0; j < i; j++) { 
                System.out.print('*'); 
            }
            System.out.println("");
    }*/
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int total = 0;
        for (int mark: marks) {
            total += mark; 
        }
        float average = (float) total / marks.length;
        System.out.println(average);
  }   
}
