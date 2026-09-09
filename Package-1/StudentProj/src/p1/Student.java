package p1;
class Student{
	 private int id;
	 private String name;
	 private double marks;

	 Student(){}
	 Student(int id,String name,double marks){
	 		this.id=id; this.name=name; this.marks=marks;
	 }

	 void displayStudent(){
	 	System.out.print("Id  "+id);
	 	System.out.print("Name  "+name);
	 	System.out.println("Marks  "+marks);

	 }
}