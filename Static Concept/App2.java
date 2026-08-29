import java.util.Random;
class Employee{
	  private int id;
	  private String firstName="";
	  private String lastName="";
	  private double salary;

	  private Random generator=new Random();

	  private int generatorId(){
	  		int id=0;
	  		while(true){
	  			id=generator.nextInt(1000);
	  				if(id%2==0) break;
	  		}
	  		return id;
	  }
	  Employee(){
	  	    // check field intilization
	  	    salary=0.0; 		
	  		id=generatorId();
	  }

	  Employee(String firstName,String lastName,double salary){
	  		this.firstName=firstName; this.lastName=lastName; this.salary=salary;
	  	    id=generatorId();  
	  }
	  public int getId(){return id;}
	  // not setter

	  public String getFullName(){
	  	 return firstName+"  "+lastName;
	  }
}

public  class App2{
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

	


	}
}