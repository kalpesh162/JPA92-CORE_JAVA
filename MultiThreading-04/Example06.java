class Tom extends Thread{
	@Override
	public void run(){
		for(int i=1;i<=5;i++){
            System.out.println((10*i)+Thread.currentThread().getName());
        }
	}
}

public  class Example06 {

	public static void main(String[] args) {
		Tom tom=new Tom();
		tom.setName("TOM");
		tom.start();
		System.out.println("-->"+Thread.currentThread.activeCount());
		try{
		tom.join();
	}catch(InterruptedException e){
	
	}

	  System.out.println("-->"+Thread.currentThread.activeCount());


	}
	
}