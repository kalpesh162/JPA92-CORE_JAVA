class Outer{ 
private int outerField=11;
	//int outerField=11;

	void outerFunction(){
		System.out.println("Outer Field  "+outerField);
	}

   static class Inner{
   	     //private int innerField=22;
   		int innerField=22;
   		void innerFunction(){
   			 System.out.println("innerField  "+innerField);
   			 //System.out.println("Outer Field  "+outerField);

   		}
   }
}


public  class Example05 {

	public static void main(String[] args) {
		// When we design static inner class
		// If we dont want to create Outer Class Object but still need inner class Object
		// then 
			Outer.Inner in=new Outer.Inner();

			in.innerFunction();
	}
	
}