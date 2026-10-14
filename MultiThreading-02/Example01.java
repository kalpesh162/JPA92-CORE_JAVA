
class A extends Thread{

		@Override
		public void run(){
				for(int i=1;i<=10;i++){
					System.out.println(11*i + " "+ Thread.currentThread().getName());
					System.out.println("Thread-0 "+ Thread.currentThread().getId());
				}
		}

}


public class Example01 {

	public static void main(String[] args) {


		A a1=new A();
		a1.start();


		for(int i=1;i<=10;i++){
			System.out.println(5*i + " "+ Thread.currentThread().getName());
			System.out.println("Main ID "+ Thread.currentThread().getId());
		}
		
	}
	
}