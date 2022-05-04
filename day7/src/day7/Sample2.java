package day7;

interface Predator1 {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }

    int LEG_COUNT = 4;  // �������̽� ���

    static int speed() {
        return LEG_COUNT * 30;
    }
}

interface Barkable {
    void bark();
}

interface BarkablePredator extends Predator1, Barkable {
}

class Animal1 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger1 extends Animal implements Predator1, Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("����");
    }
}

class Lion1 extends Animal implements BarkablePredator {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("������");
    }
}

class ZooKeeper1 {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Barkable animal) {
        animal.bark();
    }
}

public class Sample2 {
    public static void main(String[] args) {
        Tiger1 tiger1 = new Tiger1();
        Lion1 lion1 = new Lion1();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger1);
        bouncer.barkAnimal(lion1);
    }
}