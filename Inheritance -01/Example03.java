/*
// root Cosmic
public java.lang.Object{

	Object(){}

}

*/

class Art{
	Art(){
		super();
		System.out.println("Art Constructor");
	}
}

class Drawing extends Art{

	Drawing(){
		super();
		System.out.println("Drawing Constructor");
	}


}

class Cartoon extends Drawing{

	Cartoon(){
		super();
		System.out.println("Cartoon Constructor");
	}

}


public  class Example03 {
		public static void main(String[] args) {

			Cartoon tomAndJerry=new Cartoon();
				
			}	
}