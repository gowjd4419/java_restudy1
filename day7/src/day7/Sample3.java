package day7;

abstract class Predator2 extends Animal {
    abstract String getFood();

     void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }

    static int LEG_COUNT = 4;  // 인터페이스 상수

    static int speed() {
        return LEG_COUNT * 30;
    }
}

interface Barkable2 {
    void bark();
}


class Animal2 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger2 extends Predator2 implements Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion2 extends Predator2 implements Barkable {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper2 {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}

class Bouncer2 {
    void barkAnimal(Barkable animal) {
        animal.bark();
    }
}

public class Sample3 {
    public static void main(String[] args) {
        Tiger1 tiger1 = new Tiger1();
        Lion1 lion1 = new Lion1();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger1);
        bouncer.barkAnimal(lion1);
    }
}