package day6;

// Sample5.java 추상클래스 페이지 전체 Sample1.java 주소가 중복되어 Sample5에 상속페이지 작성

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
        System.out.println("어흥");
    }
}

class Lion6 extends Predator6 implements Barkable {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
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
