
class Hello {

	 int x=11;

	 public void f1(){

	 	     class Data{  // Hello$1Data.class
	 	     	   int num=11;

	 	     	   public void display(){
	 	     	   	 System.out.println(num);
	 	     	   }
	 	     }

	 	     Data d1=new Data();
	 	     d1.display();
	 }
	
}


public class Example06 {

	public static void main(String[] args) {
		
		Hello h1=new Hello();
		h1.f1();
	}

	
}