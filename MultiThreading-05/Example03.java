class Account{
	 int balance=10000;

	synchronized  void withdraw(int amt){
	 	System.out.println("withdraw  "+ Thread.currentThread().getName());
	 	System.out.println("Before withdraw BALANCE is "+ balance);
	 	
	 	if(this.balance<amt){
	 		try{wait(); }catch(InterruptedException e){}
	 	}	 

	 	  this.balance=this.balance-amt;


	 	System.out.println("After withdraw BALANCE is "+ balance);
	 	
	 }

	synchronized  void deposit(int amt){
	 	System.out.println("deposit  "+ Thread.currentThread().getName());
	 	System.out.println("Before deposit BALANCE is "+ balance);
	 	
	 	  this.balance=this.balance+amt;

	 	  System.out.println("After deposit BALANCE is "+ balance);
	 	  notify();
	 }
}

class Ram extends Thread{
	Account account;
	Ram(Account account){ this.account=account;}
	@Override
	public void run(){
		account.withdraw(15000);
	}
}



class Shyam extends Thread{
	Account account;
	Shyam(Account account){ this.account=account;}
	@Override
	public void run(){
		account.deposit(5000);
	}

}

public class Example03{
	public static void main(String[] args) {
		final Account account=new Account();
		Ram r1=new Ram(account);
		r1.setName("RAM");
		Shyam s1=new Shyam(account);
		s1.setName("SHYAM");

		r1.start();
		s1.start();


	}
}