/*
// root Cosmic
public java.lang.Object{
	Object(){}
}
*/
class Art{
	static{
		System.out.println("Art static Block -1");	
	}

    {
    	System.out.println("Art Instace Block");
    }
	
	Art(){
		super();
		System.out.println("Art Constructor");
	}

	static{
		System.out.println("Art static Block -2");	
	}
}
class Drawing extends Art{
	static{
		System.out.println("Drawing static Block -1");	
	}

	{
    	System.out.println("Drawing Instace Block");
    }

	Drawing(){
		super();
		System.out.println("Drawing Constructor");
	}

	static{
		System.out.println("Drawing static Block -2");	
	}
}
class Cartoon extends Drawing{

	static{
		System.out.println("Cartoon static Block -1");	
	}
	{
    	System.out.println("Cartoon Instace Block");
    }
	Cartoon(){
		super();
		System.out.println("Cartoon Constructor");
	}

	static{
		System.out.println("Caroon static Block -2");	
	}
}

public  class Example06 {
		
		public static void main(String[] args) {

			Art art;
			// Art.class load nahi hogi

				
	}	
}