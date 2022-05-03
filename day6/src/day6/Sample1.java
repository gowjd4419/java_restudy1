package day6;

// Sample5.java �߻�Ŭ���� ������ ��ü Sample1.java �ּҰ� �ߺ��Ǿ� Sample5�� ��������� �ۼ�

import day6.Animal6;
import day6.Animal6;
import day6.Barkable;

import day6.Bouncer;
import day6.Lion6;
import day6.Predator6;
import day6.Tiger2;

abstract class Predator6 extends Animal6 {
    abstract String getFood();

     void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }

    static int LEG_COUNT = 4; 

    static int speed() {
        return LEG_COUNT * 30;
    }
}

interface Barkable {
    void bark();
}


class Animal6 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger2 extends Predator6 implements Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("����");
    }
}

class Lion6 extends Predator6 implements Barkable {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("������");
    }
}

class ZooKeeper2 {
    void feed(Predator6 predator) {
        System.out.println("feed " + predator.getFood());
    }
}


class Bouncer {
    void barkAnimal(Barkable animal) {
        animal.bark();
    }
}

public class Sample1 {
    public static void main(String[] args) {
    	Tiger2 tiger2 = new Tiger2();
        Lion6 lion6 = new Lion6();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger2);
        bouncer.barkAnimal(lion6); 
        
        
    }
}
