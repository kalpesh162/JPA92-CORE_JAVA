package p1;
// deafult
public class Student{
	 private int id;
	 private String name;
	 private double marks;

	public Student(){}
	public Student(int id,String name,double marks){
	 		this.id=id; this.name=name; this.marks=marks;
	 }

	 public void displayStudent(){
	 	System.out.print("Id  "+id);
	 	System.out.print("Name  "+name);
	 	System.out.println("Marks  "+marks);

	 }


	 // public setter

	 // public getter
}