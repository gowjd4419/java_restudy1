package day4;

 public class Sample2 {
       // int sum(int a, int b) { // a,b 는 매개변수
	   //return a+b;
	   //String say() {
		 //  return "Hi";
	// void sum(int a, int b) {
		// System.out.println(a+"과 " +b+"의 합은 "+(a+b)+"입니다.");
	/* void sayNick(String nick) {
		// System.out.println("Hi");
		 if("fool".equals(nick)) {
			 return;
		 }
		 System.out.println("나의 별명은 " + nick+"입니다.");*/
	   // void varTest(int a) {
	    //	a++;
	   //}
	/* int varTest(int a) {
		 a++;
		 return a;
	 }*/
	 int a; // 객체 변수 a
	 
	 void varTest() {
		 this.a++;
	 }
	   public static void main(String[] args) {
	      // int a = 1; 
		   Sample2 sample = new Sample2();
		   sample.a = 1;
		   sample.varTest();
		   System.out.println(sample.a); 
	       // String a = sample.say();
	        //sample.sum(3,4);
	        
	       // sample.say();
	       // sample.sayNick("angel");
	        //sample.sayNick("fool"); // 출력되지 않는다.
	        
	       // System.out.println(a);  // "Hi" 출력
	        
	        //Sample2 sample2 = new Sample2();
	        //a = sample.varTest(a);
	       // sample.varTest(a);
	        //System.out.println(a);
	    }
 }
 
 
 
 
	   //void sum(int a, int b) {
       	//System.out.println(a+"과"+b+"의 합은 " + (a+b)+"입니다.");
       //}
	   
   
        
      /*  public static void main(String[] args) {
        	int a = 3;
        	int b = 4;
        	
        	Sample2 sample = new Sample2();
        	int c = sample.sum(3, 4); // 3, 4는 인수
        	
        	System.out.println(c); 
        	
        }
    }*/