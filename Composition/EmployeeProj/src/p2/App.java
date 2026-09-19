package p2;

import p1.Employee;
import p1.Address;
public  class  App {

	public static void main(String[] args) {
		
		Employee emp1=new Employee("Sachin",10000);  // null
		Address add1=new Address("VMT ","PUNE",411250);

		emp1.setAddress(add1);

		Address add2=new Address("FC ROAD ","PUNE",411251);
		Employee emp2=new Employee("Tushar",20000,add2);


		emp1.showEmployee();

		System.out.println(emp1.getAddress());
		emp1.getAddress().displayAddress();

		System.out.println("------------------------");
		System.out.println(emp2);


	}
	
}