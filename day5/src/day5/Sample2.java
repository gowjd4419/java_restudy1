package day5;

class Animal1 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog1 extends Animal1 {
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog1 extends Dog1 {
	HouseDog1(String name) {
        this.setName(name);
    }
	
	HouseDog1(int type) {
        if (type == 1) {
            this.setName("yorkshire");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }
	
	
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class Sample2 {
    public static void main(String[] args) {
    	HouseDog1 dog = new HouseDog1("happy");
    	HouseDog1 yorkshire = new HouseDog1(1);

        System.out.println(dog.name);
        System.out.println(yorkshire.name);
    }
}