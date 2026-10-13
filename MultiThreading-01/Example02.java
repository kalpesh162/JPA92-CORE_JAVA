/*
public interface java.lang.Runnable{
	 void run();
}

public class java.lang.Thread implements Runnable{

	public  void run(){
		// default implemetation
	}
}
*/	
class MyThread extends Thread{

	// Work
	@Override
	public  void run(){
		for(int i=1;i<=10;i++){
			System.out.println(11*i + "  "+Thread.currentThread().getName());
		}
	}
	
}

// public String getName()
class Example02 {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();

		t1.run();

		for(int i=1;i<=10;i++){
			System.out.println(5*i + "  "+Thread.currentThread().getName());
		}
	}
	
}