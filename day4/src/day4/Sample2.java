package day4;

 public class Sample2 {
       // int sum(int a, int b) { // a,b �� �Ű�����
	   //return a+b;
	   //String say() {
		 //  return "Hi";
	// void sum(int a, int b) {
		// System.out.println(a+"�� " +b+"�� ���� "+(a+b)+"�Դϴ�.");
	/* void sayNick(String nick) {
		// System.out.println("Hi");
		 if("fool".equals(nick)) {
			 return;
		 }
		 System.out.println("���� ������ " + nick+"�Դϴ�.");*/
	   // void varTest(int a) {
	    //	a++;
	   //}
	/* int varTest(int a) {
		 a++;
		 return a;
	 }*/
	 int a; // ��ü ���� a
	 
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
	        //sample.sayNick("fool"); // ��µ��� �ʴ´�.
	        
	       // System.out.println(a);  // "Hi" ���
	        
	        //Sample2 sample2 = new Sample2();
	        //a = sample.varTest(a);
	       // sample.varTest(a);
	        //System.out.println(a);
	    }
 }
 
 
 
 
	   //void sum(int a, int b) {
       	//System.out.println(a+"��"+b+"�� ���� " + (a+b)+"�Դϴ�.");
       //}
	   
   
        
      /*  public static void main(String[] args) {
        	int a = 3;
        	int b = 4;
        	
        	Sample2 sample = new Sample2();
        	int c = sample.sum(3, 4); // 3, 4�� �μ�
        	
        	System.out.println(c); 
        	
        }
    }*/