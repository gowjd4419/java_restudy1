package day3;

/*class Calculator{
	static int result = 0;
	
	static int add(int num) {
		result += num;
		return result;
	}
}
*/


class Calculator1 {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}

class Calculator2 {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}
class Calculator {
    int result = 0;

    int add(int num) {
        result += num;
        return result;
    }
    
    int sub(int num) {
        result -= num;
        return result;
    }
}
public class Sample4 {
    public static void main(String[] args) {
    	
    	Calculator cal1 = new Calculator();  
        Calculator cal2 = new Calculator(); 
        
        System.out.println(Calculator1.add(3));
        System.out.println(Calculator1.add(4));

        System.out.println(Calculator2.add(3));
        System.out.println(Calculator2.add(7));
    }
}

