
class A extends Thread{

		@Override
		public void run(){
				for(int i=1;i<=10;i++){
					System.out.println(11*i + " "+ Thread.currentThread().getName());
				}
		}

}


public class Example02 {

	public static void main(String[] args) {


		A a1=new A();
		a1.setName("A");
		a1.start();


		for(int i=1;i<=10;i++){
			System.out.println(5*i + " "+ Thread.currentThread().getName());
		}
		
	}
	
}