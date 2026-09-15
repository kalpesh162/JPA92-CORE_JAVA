class Operations{
	// data	

	static void doAdd(int x,int y){
		System.out.println(x+y);
	}

	static void doAdd(int x,int y,int z){
		System.out.println(x+y+z);
	}


	static void doAdd(int x,double y){
		System.out.println(x+y);
	}
	static void doAdd(double x,int y){
		System.out.println(x+y);
	}

	// Method Overloading | Function Overloading
}



// If we want to use compile time polymorphism we can do by method Overloading
public  class NewApp {

	public static void main(String[] args) {

		Operations op=new Operations();
		op.doAdd(11,22);
		op.doAdd(11,22,33);
		op.doAdd(11,22.22);
		op.doAdd(11.11,22);

		Operations.doAdd(11,22);
		// likewise
		/*
		int x;
		// code
		int x;  //variable x is already defined in method main(String[])
		*/
	}	
	
}