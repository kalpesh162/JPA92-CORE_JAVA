/*
// root Cosmic
public java.lang.Object{
	Object(){}
}
*/
class Art{
    {
    	System.out.println("Art Instace Block");
    }
	Art(){
		super();
		System.out.println("Art Constructor");
	}
}
class Drawing extends Art{
	{
    	System.out.println("Drawing Instace Block");
    }
	Drawing(){
		super();
		System.out.println("Drawing Constructor");
	}
}
class Cartoon extends Drawing{
	{
    	System.out.println("Cartoon Instace Block");
    }
	Cartoon(){
		super();
		System.out.println("Cartoon Constructor");
	}
}

public  class Example04 {
		public static void main(String[] args) {

			Cartoon tomAndJerry=new Cartoon();
				
	}	
}