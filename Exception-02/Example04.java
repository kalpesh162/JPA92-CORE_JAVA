import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class Example04 {

	public  static void f1() throws IOException{
		   f2();
	}
	public  static void f2() throws IOException{
		 f3();
	}
	public  static void f3() throws IOException{
		
		//File file=new File("E:/DS/DLL/dll.c");
		File file=new File("E:/DS/DLL/dll1.c");
		FileReader fr=new FileReader(file);  // int read()   -1

		int value=fr.read();

		while (value!=-1) {
				System.out.print((char)value);
				value=fr.read();
		}

		fr.close();

		
	
	}

	public static void main(String[] args) throws IOException{
		
		f1();

				System.out.println("THANK ....");
	}
	
}