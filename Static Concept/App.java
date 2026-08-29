
class Employee{
	  private static int cnt=0;
	  private int id;
	  private String firstName="";
	  private String lastName="";
	  private double salary;

	  Employee(){
	  	    // check field intilization
	  	    salary=0.0;
	  	    cnt++;
	  	    id=cnt;
	  }

	  Employee(String firstName,String lastName,double salary){
	  		this.firstName=firstName; this.lastName=lastName; this.salary=salary;
	  		cnt++;
	  		id=cnt;
	  }
	  public int getId(){return id;}
	  // not setter

	  public String getFullName(){
	  	 return firstName+"  "+lastName;
	  }

}

public  class App{
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Employee e2=new Employee("Ramesh","Patil",10000);
		Employee e3=new Employee("Suresh","Jadhav",11000);
		Employee e4=new Employee("Kalpesh","Chopade",15000);

		System.out.println(e1.getId());
		System.out.println(e2.getId());
		System.out.println(e3.getId());
		System.out.println(e4.getId());

		System.out.println(e1.getFullName());
		System.out.println(e2.getFullName());
		System.out.println(e3.getFullName());
		System.out.println(e4.getFullName());

		System.out.println(e1.cnt);


	}
}