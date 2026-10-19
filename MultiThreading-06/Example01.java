class Counter{
	  int cnt=0;
	  synchronized void incerement(){ cnt++;}
}

class A extends Thread{

	Counter counter;
    A(Counter counter){ this.counter=counter;}
   
   @Override 
   public  void run(){
           for(int i=1;i<=10000;i++)
           	counter.incerement();
   }
}
class B extends Thread{
	Counter counter;
	B(Counter counter){ this.counter=counter;}
   @Override 
   public  void run(){
   	for(int i=1;i<=10000;i++)
           	counter.incerement();
   	 
   }
}
class C extends Thread{
	Counter counter;
	C(Counter counter){ this.counter=counter;}
   @Override 
   public  void run(){
   	 for(int i=1;i<=10000;i++)
           	counter.incerement();
   }
}

public class Example01{
	public static void main(String[] args) {
		final Counter counter=new Counter();
		A a1=new A(counter);
		a1.setName("A");
		B b1=new B(counter);
		b1.setName("B");
		C c1=new C(counter);
		c1.setName("C");

		a1.start();

		b1.start();
		c1.start();
		
		try{a1.join();}catch(InterruptedException e){}
		try{b1.join();}catch(InterruptedException e){}
		try{c1.join();}catch(InterruptedException e){}
		//try{Thread.sleep(1000);} catch(InterruptedException e){}
		System.out.println(counter.cnt);
	}
}