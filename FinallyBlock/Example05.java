import java.io.FileWriter;
import java.io.IOException;

class Example05 {

	public static void createFile(String fileName) throws IOException{
			FileWriter fw=null;  
			fw=new FileWriter(fileName+".txt"); 
			fw.write(100);  
			fw.write("\n"); 
			fw.write("Hello");
			fw.write("\n");
			char arr[]={'A','B','C','D'};
			fw.write(arr);
			fw.flush();
			fw.close();
	}

	public static void main(String[] args) {
		
		String name[]={"Raju","Raveena","Kareena"};
		try{
		
			for(String n : name)
			createFile(n);
		
		}catch(IOException e){

		}

	}
	
}