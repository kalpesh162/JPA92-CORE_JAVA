import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class App{
	public static void main(String[] args)  throws IOException{
		
		Student s1=new Student(11,"Ramesh",66.77);

		// Object --> byteStream

		FileOutputStream fos=new FileOutputStream("stud.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		oos.writeObject(s1);

		oos.flush();

		oos.close();
		fos.close();

		System.out.println("END");

	}
}