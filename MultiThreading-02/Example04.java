
class Banti extends Thread{
	 @Override
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(11*i + " "+ Thread.currentThread().getName());
		}
	}
}

class Babali implements Runnable{
	@Override
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(5*i + " "+ Thread.currentThread().getName());
		}
	}
}


public class Example04 {

	public static void main(String[] args) {

		Banti b1=new Banti();
		b1.setName("banti");
		Babali b2=new Babali(); // WORK    //Bricks
 		Thread t1=new Thread(b2);  // WORKER  // DONKEY
 		t1.setName("babali");

 		b1.start();
 		t1.start();

		for(int i=1;i<=10;i++){
			System.out.println(7*i + " "+ Thread.currentThread().getName());
		}
	}
	
}