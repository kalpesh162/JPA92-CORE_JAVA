class Sweeper extends Thread{
		public void run(){  // Service Thread
			 while(true){
			 	  System.out.println("A ");
			 }
		}
}

public  class Example03 {
	 // main thread  -- user thread
	public static void main(String[] args) {
		
		Sweeper s1=new Sweeper(); 
		s1.setName("A");
		s1.setDaemon(true);
		s1.start();
		try{Thread.sleep(1000);}catch(InterruptedException e){}
	}
	
}