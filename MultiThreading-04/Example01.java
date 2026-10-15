class Harry extends Thread{
      @Override
     public void run(){
         for(int i=1;i<=5;i++)
            System.out.println((5*i)+Thread.currentThread().getName());
     }
}

class Potter extends Thread{
      @Override
     public void run(){
         for(int i=1;i<=5;i++)
            System.out.println((11*i)+Thread.currentThread().getName());
     }
}
 
public  class Example02{
   public static void main(String[] args) {
      
         Harry h1=new Harry();
         h1.setName("Harry");
         Potter p1=new Potter();
         p1.setName("Potter");
   
         h1.start();
         try{h1.join();}catch(InterruptedException e){}
         p1.start();
         try{p1.join();}catch(InterruptedException e){}

         for(int i=1;i<=5;i++){
                System.out.println((13*i)+Thread.currentThread().getName());
                try{Thread.sleep(1000);}
                catch(InterruptedException e){
                    e.printStackTrace();
                }
         }
   }
}