
class Rock{

	Rock(){
		System.out.println("Rock Constructor Called");
	}

}


public class Example01{
	public static void main(String[] args) {
			Rock rock =new Rock();	

			for(int i=1;i<=5;i++){
				Rock rock1=new Rock();
			}

			System.out.println("----------------");
			
			for(int i=1;i<=5;i++)
				new Rock();

			
	}
}


/*
Compiled from "Example01.java"
class Rock {
  Rock();  // Construtor
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return
}
*/