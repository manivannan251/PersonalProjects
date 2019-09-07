package garbage_collections;

import java.util.Date;

public class RuntimeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Runtime r = Runtime.getRuntime();
		System.out.println("The total memory is "+r.totalMemory()/1000+"MB");
		System.out.println("The free memory is "+r.freeMemory()/1000+"MB");
		for(int i=0;i<10000;i++) {
			Date d = new Date();
			d=null;
		}
		System.out.println("The free memory after creation of object is "+r.freeMemory()/1000+"MB");
		System.gc();
		Thread.sleep(2000);
		System.out.println("The free memory after running of gc is "+r.freeMemory()/1000+"MB");
		
		for(int i=0;i<10000;i++) {
			Date d = new Date();
			d=null;
		}
		Thread.sleep(2000);
		System.out.println("The free memory after running of gc  for secodn time is "+r.freeMemory()/1000+"MB");
		System.gc();
		System.out.println("The free memory after running of gc  for third time is "+r.freeMemory()/1000+"MB");
		System.out.println("The total memory is "+r.totalMemory()/1000+"MB");
		

	}

}
