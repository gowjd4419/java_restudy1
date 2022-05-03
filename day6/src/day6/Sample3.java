package day6;

interface Predator {
	String getFood();
	
	default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
	
	int LEG_COUNT = 4;  

    static int speed() {
        return LEG_COUNT * 30;
    }
}

class Animal4 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal4 implements Predator{
	public String getFood() {
        return "apple";
    }
}

class Lion extends Animal4 implements Predator{
	public String getFood() {
        return "banana";
    }
}

class ZooKeeper {
    void feed(Predator predator) {  // ȣ���̰� ���� ����� ���� �ش�.
    	System.out.println("feed "+predator.getFood());
    }

    void feed(Lion lion) {  // ���ڰ� ���� �ٳ����� �����ش�.
        System.out.println("feed banana");
    }
}

public class Sample3 {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  // feed apple ���
        zooKeeper.feed(lion);  // feed banana ���
    }
}