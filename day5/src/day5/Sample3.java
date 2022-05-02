package day5;

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
class Animal2 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal2 implements Predator {
	public String getFood() {
        return "apple";
    }
}

class Lion extends Animal2 implements Predator{
	public String getFood() {
        return "banana";
    }
}
class Crocodile extends Animal2 implements Predator {
	public String getFood() {
        return "mango";
    }
}
class Leopard extends Animal2 implements Predator {
	public String getFood() {
        return "mellon";
    }
}

class ZooKeeper {
    void feed(Predator predator) {  
    	System.out.println("feed "+predator.getFood());
       
    }

    void feed(Lion lion) { 
        System.out.println("feed banana");
    }
    
    public void feed(Crocodile crocodile) {
        System.out.println("feed strawberry");
    }
    
    public void feed(Leopard leopard) {
        System.out.println("feed orange");
    }
}

public class Sample3 {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);  
        zooKeeper.feed(lion);  
    }
}