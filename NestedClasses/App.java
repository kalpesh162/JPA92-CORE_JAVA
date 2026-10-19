
class Outer{
	 private int outerField=11;
	//int outerField=11;

	void outerFunction(){
		System.out.println("Outer Field  "+outerField);
	}

   class Inner{
   	     //private int innerField=22;
   		int innerField=22;
   		void innerFunction(){
   			 System.out.println("innerField  "+innerField);
   			 System.out.println("Outer Field  "+outerField);

   		}
   }


}
public class App{
	public static void main(String[] args) {
		Outer out=new Outer();

		Outer.Inner in=out.new Inner();

		System.out.println(in.innerField);
		in.innerFunction();

		System.out.println("------------------");

		Outer.Inner in1=new Outer().new Inner();
		System.out.println(in1.innerField);
		in1.innerFunction();

	}
}