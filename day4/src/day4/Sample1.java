package day4;

class Animal{ 
	String name;
	

    public void setName(String name) {
	   this.name = name;
   }
    
    public class Sample1 {
    	public static void main(String[]args){
    		Animal cat = new Animal();
    		//Animal dog = new Animal();
    		//Animal horse = new Animal();
    		
    		cat.setName("boby");
    		
    		Animal dog = new Animal();
    		dog.setName("happy");
    		
    		System.out.println(cat.name);
    		System.out.println(dog.name);
    		//System.out.println(cat.name);
    		
    		
         }
      } 
}