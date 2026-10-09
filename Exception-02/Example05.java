import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class Example05 {

	public  static void f1()   {
		   f2();
	}
	public  static void f2()   {
		 f3();
	}
	public  static void f3()   {
		
		//File file=new File("E:/DS/DLL/dll.c");
		try{
		File file=new File("E:/DS/DLL/dll1.c");
		FileReader fr=new FileReader(file);  // int read()   -1

		int value=fr.read();

		while (value!=-1) {
				System.out.print((char)value);
				value=fr.read();
		}

		fr.close();
	}catch(IOException e){
		System.out.println("Exception Occured ...");
		e.printStackTrace();
	}

		
	
	}

	public static void main(String[] args)   {
		
		f1();

				System.out.println("THANK ....");
	}
	
}