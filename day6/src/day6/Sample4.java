package day6;

interface Predator1 {
	String getFood();
	
	default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
	
	int LEG_COUNT = 4;  

    static int speed() {
        return LEG_COUNT * 30;
    }
}

interface Barkable1 {
    void bark();
}

interface BarkablePredator extends Predator1, Barkable1 {
}


class Animal1 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger1 extends Animal1 implements Predator1, Barkable1{
	public String getFood() {
        return "apple";
    }
	
	public void bark() {
        System.out.println("����");
    }
}

class Lion1 extends Animal1 implements BarkablePredator {
	public String getFood() {
        return "banana";
    }
	public void bark() {
        System.out.println("������");
    }
}

class ZooKeeper1 {
    void feed(Predator predator) {  // ȣ���̰� ���� ����� ���� �ش�.
    	System.out.println("feed "+predator.getFood());
    }
}

class Bouncer1 {
	void barkAnimal(Barkable1 animal) {  // Animal ��� Barkable�� ���
        animal.bark();
    }
}

public class Sample4 {
    public static void main(String[] args) {
        Tiger1 tiger1 = new Tiger1();
        Lion1 lion1 = new Lion1();
        
        Bouncer1 bouncer= new Bouncer1();
        bouncer.barkAnimal(tiger1);
        bouncer.barkAnimal(lion1);
        
    }
}