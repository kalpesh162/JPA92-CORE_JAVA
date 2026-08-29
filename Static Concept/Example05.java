class Hello{
	private static Hello h1;  //Hello reference Type null
	private Hello(){
		System.out.println("Hello COnstructor");
	}

	public static  Hello  getInstance(){
	      if(h1!=null)
	      	return h1;
	      else
	      	h1=new Hello();
	      return h1;
	}
}
// private accessible only within that class
public  class Example05  {
	public static void main(String[] args) {
		//Hello h1=new Hello();	
		Hello h1=Hello.getInstance();	
		Hello h2=Hello.getInstance();	
		Hello h3=Hello.getInstance();	
		Hello h4=Hello.getInstance();

		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(h3.hashCode());
		System.out.println(h4.hashCode());
	}
	
}