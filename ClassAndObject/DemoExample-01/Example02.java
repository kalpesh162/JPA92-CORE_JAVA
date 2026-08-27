class Cake{
	 int wt;
	 static int cnt=0;

	 Cake(int wt){
	 		cnt++;
	 	 this.wt=wt;
	 }
}


public  class Example02{
	public static void main(String[] args) {
		
		Cake cake1=new Cake(1);
		Cake cake2=new Cake(2);
		System.out.println(cake1.cnt);
		Cake cake3=new Cake(3);
		Cake cake4=new Cake(4);
		System.out.println(cake2.cnt);
		Cake cake5=new Cake(5);

		
    // How many Objects are created for this Cake class

		//System.out.println(cake5.cnt);
		//System.out.println(cake1.cnt);

	}
}