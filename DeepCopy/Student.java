public class Student implements Cloneable{
	private int id;
	private String name;
	private double marks;
	private Address address;
	public Student() {
		System.out.println("Student default Constructor");
		id = 1;
		name = "";
		marks = 0.0;
	}
	public Student(int id, String name, double marks) {
		System.out.println("Student parametrized 3 Constructor");
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public Student(int id, String name, double marks,Address address) {
		System.out.println("Student parametrized 4 Constructor");
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address=address;
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
	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	@Override
	public Student clone() throws CloneNotSupportedException{	
		 Student cloned=(Student)super.clone();
		 cloned.address=(Address)address.clone();
		 return cloned;
	}
}
