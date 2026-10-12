import java.io.FileWriter;
import java.io.IOException;

class Example04 {

	public static void main(String[] args) {
		FileWriter fw=null;  // Its class used to create file
		try{
			fw=new FileWriter("friends.txt");  // this file creates in Current Directory
			fw.write(100);  // 100  d   // write() is overloaded method used to add content in file 
			fw.write("\n");       // write(int)   write(char[])  write(String )
			fw.write("Hello");
			fw.write("\n");
			char arr[]={'A','B','C','D'};
			fw.write(arr);

			fw.flush();
		}catch (IOException e) {
			System.out.println("Exception Caught ..");
		}
		finally{
			   try{
			   	System.out.println("Closinng File");
			   fw.close();
			   // scanner.close()
			}catch(IOException e){

			}
		}
		//Bellow code   make sure if gets exception we might handle here but resource as FileWriter we should close in 
		// finally block and continue with rest code
	}
	
}