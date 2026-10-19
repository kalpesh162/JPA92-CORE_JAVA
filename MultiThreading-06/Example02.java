class Sweeper extends Thread{
		
		public void run(){
			  for(int i=1;i<=10;i++){
			  	System.out.println(5*i +" "+Thread.currentThread().getName());
			  	if(Thread.currentThread().isDaemon()){
			  		System.out.println("isDaemon");
			  	}
			  }
		}
}

public  class Example02 {

	 // main thread  -- user thread
	public static void main(String[] args) {
		
		Sweeper s1=new Sweeper(); 
		s1.setName("A");
		s1.setDaemon(true);
		s1.start();


		try{Thread.sleep(1000);}catch(InterruptedException e){}

	}
	
}