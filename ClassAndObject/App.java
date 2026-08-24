// Box is a type
class Box{
	// fields
   int length;
   int width;
   int height;

   // memeber methods
   double volumeOfBox(){
   		return length*width*height;
   }
   double areaOfBox(){
   	  return length*width;
   }
}
class App{
	public static void main(String[] args) {
		// How to use class
		// By creating Object
		// Type typename=new Type();
		Box box1=new Box();     // Heap Area
		// box1 reference Name| type 
		// new Box()  Object

		System.out.println(box1.length);
		System.out.println(box1.width);
		System.out.println(box1.height);

		box1.length=4;
		box1.height=3;
		box1.width=5;

		System.out.println(box1.length);
		System.out.println(box1.width);
		System.out.println(box1.height);


		System.out.println(box1.volumeOfBox());
		System.out.println(box1.areaOfBox());



	}

}