import java.io.File;
import java.io.IOException;
// What is throws ?
// throws keyword generally used with checked Exception
// redirecting Exception to caller method 

// throws keywords can apply with the method ONLY

// throws also used for throws multiple Exception at a time
// Ex public void f3( ) throws IOException,InterruptedException,SQLException
public class Example06 {

	public  static void f1() throws IOException,InterruptedException{
		   f2();
	}
	public  static void f2() throws IOException,InterruptedException{
		 f3();
	}
	public  static void f3() throws IOException,InterruptedException{
		// path+fileName  D:/Programs/mycontact.txt
		// Current Director 
		
		File file=new File("movies.txt");

		file.createNewFile();
	
		// 50 line of code

		Thread.sleep(100);

	}

	public static void main(String[] args) throws IOException,InterruptedException{
		
		f1();

				System.out.println("THANK ....");
	}
	
}