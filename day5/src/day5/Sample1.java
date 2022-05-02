package day5;

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
	 void sleep() {
	        System.out.println(this.name+" zzz");
	    }
}

class HouseDog extends Dog {
	 void sleep() {
	        System.out.println(this.name + " zzz in house");
	    }
	 void sleep(int hour) {
	        System.out.println(this.name + " zzz in house for " + hour + " hours");
	    }
}

public class Sample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
        
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}