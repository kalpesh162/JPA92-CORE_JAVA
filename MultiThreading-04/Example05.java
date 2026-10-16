class Table {

  void printTable(int n){
    // synchronized Block
        synchronized (this){
         for(int i=1;i<=5;i++){
            System.out.println((n*i)+Thread.currentThread().getName());
        }
    }
     
     // non-synchronized

    }   
}
class Harry extends Thread{
    Table table;
    Harry(Table table){ this.table=table;}
      @Override
     public void run(){
        table.printTable(5);
     }
}
class Potter extends Thread{
    Table table;
    Potter(Table table){ this.table=table;}
      @Override
     public void run(){
         table.printTable(11);
     }
}
 
public  class Example05{
   public static void main(String[] args) {
        final Table table=new Table();
         Harry h1=new Harry(table);
         h1.setName("Harry");
         Potter p1=new Potter(table);
         p1.setName("Potter");
   
         h1.start();
         //try{h1.join();}catch(InterruptedException e){}
         p1.start();
         //try{p1.join();}catch(InterruptedException e){}
  }
}