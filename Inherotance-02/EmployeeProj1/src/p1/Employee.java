package p1;
public  class Employee extends Person{
	private int id;
	private static int nextId=0;
	private double salary;

	public Employee(String name,int age,double salary){
		if(! name.isEmpty() && ! name.equals(null))	
		 super.setName(name);
		
		if(age>0  && age<200)
		super.setAge(age);

		id=++nextId;

		if(salary>0 && salary<=Integer.MAX_VALUE){
			this.salary=salary;
		}	
	}
	
	public int getEmployeeId(){return id;}
	public double getSalary(){ return salary;}

	public void setSalary(double salary){
		 if(salary>0 && salary<=Integer.MAX_VALUE){
			this.salary=salary;
		}
	}

	public void showEmployeeDetails(){
		 System.out.println("ID : "+id);
		 System.out.println("salary : "+salary);
		 //System.out.println("Name : "+super.getName());
		 //System.out.println("Age : "+super.getAge());
		 super.displayPerson();
	}
}