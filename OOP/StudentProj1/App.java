class Student{
	 int id;
	 String name;
	 double marks;

	 void showStudentInfo(){
	 	 System.out.println("---------------------");
	 	 System.out.println(id);
	 	 System.out.println(name);
	 	 System.out.println(marks);
	 }
}


public class App{

	public static void main(String[] args) {

		Student s1=new Student();
		s1.showStudentInfo();
		// s1 ==> reference
		//new Student() ==> Object
		s1.id=10;
		s1.name="Sachin";
		s1.marks=99.99;

		s1.showStudentInfo();
		
	}

}