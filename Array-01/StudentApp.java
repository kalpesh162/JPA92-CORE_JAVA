import java.util.Scanner;
public  class StudentApp{	
	public static void main(String[] args) {		
		Student studList[]=new Student[5];
		Scanner scanner=new Scanner(System.in);

		for(int i=0;i<studList.length;i++){
			  System.out.println("Enter Name ");
			  String name=scanner.nextLine();	
			  System.out.println("Enter Marks ");
			  double marks=scanner.nextDouble();
			  scanner.nextLine();	
			 studList[i]=new Student(name,marks);
		}
		System.out.printf("%-5s %-10s %-10s","ID ","NAME","Marks");
		System.out.println("-------------------");
		for(int i=0;i<studList.length;i++){
			studList[i].studentInfo();
		}

		System.out.println("-------------------");

		for(Student student:studList){
			student.studentInfo();
		}

	}
}