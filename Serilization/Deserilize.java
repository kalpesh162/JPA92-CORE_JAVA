import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserilize{
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		
		FileInputStream fis=new FileInputStream("stud.txt");

		ObjectInputStream ois=new ObjectInputStream(fis);

		// FileInputStream
		// ObjectInputStream
		// Object readObject() throws ClassNotFoundException
		// ClassNotFoundException Checked Exception

		Student s1=(Student)ois.readObject();
		if(s1!=null){
			 System.out.println(s1.getId());
			 System.out.println(s1.getName());
			 System.out.println(s1.getMarks());
		}
		
		ois.close();
		fis.close();

		System.out.println("THANKS ");
	}
}