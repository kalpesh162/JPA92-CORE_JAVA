import java.io.FileWriter;
import java.io.IOException;

class Example06 {

	public static void main(String[] args) {
		
		// try with resources
		// Note Point resources must be type of AutoClosable or Closable 
		// No need to Call Manually close() method 
		try(FileWriter fw=new FileWriter("movies.txt")){
			fw.write(100); 
			fw.write("\n"); 
			fw.write("Hello");
			fw.write("\n");
			char arr[]={'A','B','C','D'};
			fw.write(arr);
			fw.flush();
		}
		catch(IOException e){

		}



	}
	
}