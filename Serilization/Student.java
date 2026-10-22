import java.io.Serializable;
// Serilizable is a marker interface 
// java.io.NonSerilizableException
public class Student implements Serializable{
	//private static int id;
	private transient int id;
	private String name;
	private double marks;

	public Student() {
		id = 1;
		name = "";
		marks = 0.0;
	}

	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}


