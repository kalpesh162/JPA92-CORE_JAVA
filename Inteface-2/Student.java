
/*
interface java.lang.Comparable{
	 int comapareTo(T t);
}
*/
public  class Student implements Comparable<Student> {
	int id;
	String name;
	double marks;
	
	Student(){}
	Student(int id,String name,double marks){
		this.id=id; this.name=name; this.marks=marks;
	}

	@Override
	public  String toString(){
		//return "[ id "+id+"  name "+name +"  marks "+marks +" ]";
		// System.out.printf("%d %s %f",id , name ,marks);
		return String.format("%-5d %-10s %-10.2f \n  ",id,name,marks);
	}

	//int compareTo(T o)
	@Override
	public int compareTo(Student other){
		if(this.id >  other.id) return 1;
		else if(this.id <  other.id) return -1;
		else return 0;
	}
}