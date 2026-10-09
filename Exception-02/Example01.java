import java.io.File;
import java.io.IOException;
public class Example01 {

	public  static void f1(){
		   f2();
	}
	public  static void f2(){
		 f3();
	}
	public  static void f3(){
		// path+fileName  D:/Programs/mycontact.txt
		// Current Director 
		try{
		File file=new File("mycontact.txt");

		file.createNewFile();
		}catch(IOException e){
			System.out.println("catch Block");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		f1();

				System.out.println("THANK ....");
	}
	
}