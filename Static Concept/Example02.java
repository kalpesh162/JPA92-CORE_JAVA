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
	  	//System.out.println(this.y+"  Using this");  // this current Object yoiu can not use inside static method
	  	//System.out.println(this.x+"  Using this");  // this current Object yoiu can not use inside static method

	  	//If you want to access instance member and method
	  	Data d2=new Data();
	  	d2.displayData();// instance method
	  }

	  /*
	  static void showData(Data d){
	  	
	  }
	  */
	  /*
	  static void showData(Data d){
	  	System.out.println(this.y+"  ");
	  }
	  */

}

public  class Example02{
	public static void main(String[] args) {
		Data d1=new Data();

		System.out.println("x"+d1.x);  // 
		System.out.println("y"+d1.y);  //  Data.y
		// Why we are calling static field on reference
		// is Allowed ?
		// if field is static or method is static internally refernce resolved Type 
		// that means d1.y  --> resolve to Data.y
		d1.displayData();

		System.out.println("---------------");
		d1.showData();  // Data.showData()

		// normal Method instance call d1.displayData();
		// But internally Compiler is doing for you note you can not do this
		// d1.displayData(d1)  Compiler is do for you like d1.displayData(this(d1))

		// this call d1.showData() even resolve to Data.showData()
		// Compiler Data.showData() in that thing not passing this as argument to showData
		Data d2=new Data();
	}
}