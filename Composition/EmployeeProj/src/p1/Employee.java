package p1;

public class Employee {
	private static int nextId=0;
	private int id;
	private String name;
	private double salary;
	// has-a
	private Address address;
	// Instance Block
	{
	nextId++;
	this.id=nextId;
	}
	public Employee(){
		this("",0);
	}
	public Employee(String name,double salary){
		nextId++;
		this.name=name;
		this.salary=salary;
	}

	public Employee(String name,double salary,Address address){
		nextId++;
		this.name=name;
		this.salary=salary;
		this.address=address;

	}

	public  int getId(){ return id;}
	public  String getName(){ return name;}
	public  double getSalary(){ return salary;}

	public  void setName(String name){ this.name=name;}
	public  void setSalary(double salary){ this.salary=salary;}
    
    public  void setAddress(Address address){ this.address=address;}
    public  Address getAddress(){ return address;}

    public  void showEmployee(){
    	System.out.println("**** EMP INFO *****");
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(salary);
    	System.out.println(address.getLandMark());
    	System.out.println(address.getCity());
    	System.out.println(address.getPincode());
    }

    @Override
    public String toString(){
    	return  " "+id+" "+name +" "+salary+"  "+address;
    }

	
}