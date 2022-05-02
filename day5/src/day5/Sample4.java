package day5;

interface Predator2 {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }

    int LEG_COUNT = 4; 

    static int speed() {
        return LEG_COUNT * 30;
    }
}

interface Barkable {
    void bark();
}

interface BarkablePredator extends Predator, Barkable {
}

class Animal3 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger2 extends Animal3 implements Predator, Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("æÓ»Ô");
    }
}

class Lion2 extends Animal2 implements BarkablePredator {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("¿∏∏£∑∑");
    }
}

class ZooKeeper2 {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}


class Bouncer {
    void barkAnimal(Barkable animal) {
        animal.bark();
    }
}

public class Sample4 {
    public static void main(String[] args) {
    	Tiger2 tiger2 = new Tiger2();
        Lion2 lion2 = new Lion2();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger2);
        bouncer.barkAnimal(lion2); 
        
        
    }
}