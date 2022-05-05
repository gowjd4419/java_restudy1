package day8;

import java.text.SimpleDateFormat;
import java.util.Date;

class Counter  {
     static int count = 0;
    Counter() {
        count++;
        System.out.println(this.count);
    }
    
    public static int getCount() {
    	return count;
    }
}

class Util {
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}

class Singleton {
	private static Singleton one;
    private Singleton() {
    }

    public static Singleton getInstance() {
    	if(one==null) {
            one = new Singleton();
        }
        return one;
    }
}

public class Sample2 {
    public static void main(String[] args) {
       // Counter c1 = new Counter();
        //Counter c2 = new Counter();
        
        //System.out.println(Counter.getCount());
    	
    	//System.out.println(Util.getCurrentDate("yyyyMMdd"));  // 오늘 날짜 출력
    	
    	Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
  }