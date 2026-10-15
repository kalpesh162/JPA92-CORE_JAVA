class Table {
synchronized  void printTable(int n){
         for(int i=1;i<=5;i++){
            System.out.println((n*i)+Thread.currentThread().getName());
        }
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
 
public  class Example04{
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