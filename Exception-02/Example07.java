import java.io.File;
import java.io.IOException;
// What is throws ?
// throws keyword generally used with checked Exception
// redirecting Exception to caller method 

// throws keywords can apply with the method ONLY

// throws also used for throws multiple Exception at a time
// Ex public void f3( ) throws IOException,InterruptedException,SQLException

// Why we are doing this ?  to avoid runtime headaches 
public class Example07 {

	public  static void f1() throws Exception{
		   f2();
	}
	public  static void f2() throws Exception{
		 f3();
	}
	public  static void f3() throws Exception{  // Generic Exception
		// path+fileName  D:/Programs/mycontact.txt
		// Current Director 
		
		File file=new File("movies.txt");

		file.createNewFile();
	
		// 50 line of code

		Thread.sleep(100);

	}

	public static void main(String[] args) throws Exception{
		
		f1();

				System.out.println("THANK ....");
	}
	
}