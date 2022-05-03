package day6;

// Sample1.java 상속 페이지 전체

class Animal5 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog5 extends Animal5 {
	 void sleep() {
	        System.out.println(this.name+" zzz");
	    }
}

class HouseDog5 extends Dog {
	void sleep() {
        System.out.println(this.name + " zzz in house");
    }
	
	void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class Sample5 {
    public static void main(String[] args) {
    	HouseDog5 houseDog = new HouseDog5();
        houseDog.setName("happy");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}