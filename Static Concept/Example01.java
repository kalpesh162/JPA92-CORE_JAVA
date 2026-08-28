class Data{
	  int x=11;
	  static int y=22;

	  // non-static method | instance method
	  void displayData(){
	  	// can access both static as well as non-static members
	  	System.out.println(x+"  "+y);
	  }

	  static void showData(){
	  	// static method can access only static data and method
	  	System.out.println(y+"  ");
	  	// Static method cant access instance fiels as well instance method
	  	// System.out.println(x+"  ");
	  }
}

public  class Example01{
	public static void main(String[] args) {
		Data d1=new Data();

		System.out.println("x"+d1.x);
		System.out.println("y"+d1.y);

		d1.displayData();

		System.out.println("---------------");
		d1.showData();

		Data d2=new Data();
	}
}