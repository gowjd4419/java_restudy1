package day6;

import day6.Animal6;
import day6.Animal6;
import day6.Barkable;

import day6.Bouncer;
import day6.Lion6;
import day6.Tiger2;



class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
	Dog() {
    }
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
	HouseDog(String name) {
        this.setName(name);
    }
	
	HouseDog(int type) {
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
    	HouseDog happy = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(happy.name);  
        System.out.println(yorkshire.name);
    }
}