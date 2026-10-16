class Tom extends Thread{
	@Override
	public void run(){
		for(int i=1;i<=5;i++){
            System.out.println((10*i)+Thread.currentThread().getName());
            System.out.println("-->"+Thread.currentThread().getPriority());
        }
	}
}
public  class Example02 {

	public static void main(String[] args) {
		Tom tom=new Tom();
		tom.setName("TOM");
		tom.setPriority(15);
		tom.start();
	   System.out.println("-->"+Thread.currentThread().getPriority());
		
	  System.out.println("NORM_PRIORITY "+Thread.NORM_PRIORITY);
	  System.out.println("MIN_PRIORITY "+Thread.MIN_PRIORITY);
	  System.out.println("MAX_PRIORITY "+Thread.MAX_PRIORITY);
	  
	 	for(int i=1;i<=5;i++){
            System.out.println((11*i)+Thread.currentThread().getName());
            
        }
	}
	
}