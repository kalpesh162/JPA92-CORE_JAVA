/*
public class  java.lang.Thread{
	Thread()
	Thread(Runnable)	
}
*/
class MyRunnable implements Runnable  {
	@Override
	public void run(){
		for(int i=1;i<=10;i++){
			//System.out.println(11*i + " "+ Thread.currentThread().getName());
			System.out.println(11*i + " "+ Thread.currentThread().getId());
		}
	}
}
public class Example03 {

	public static void main(String[] args) {

		MyRunnable r1=new MyRunnable();  // Work
		Thread t1=new Thread(r1);
		t1.setName("Shyam");
		Thread t2=new Thread(r1);
		t2.setName("Ram");
		
		t1.start();
		t2.start();
		// main Thread task

		System.out.println("-->  "+Thread.activeCount());

		
	}
	
}