package p2;
import p1.Student;
import static p1.Student.instituteName;
import static p1.Student.getInstituteName;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


// What diff between import and static import

class App{

	public static void main(String[] args) {
		
		Student s1=new Student(11,"ABCD",77.77);

		s1.displayStudent();

		//System.out.prinln(s1.instituteName);
		System.out.println(Student.instituteName);
		System.out.println(Student.getInstituteName());

		System.out.println("--------------------------");

		System.out.println(instituteName);
		System.out.println(getInstituteName());
		System.out.println("--------------------------");
		System.out.println(PI);
		System.out.println(pow(11,3));



	}
	
}