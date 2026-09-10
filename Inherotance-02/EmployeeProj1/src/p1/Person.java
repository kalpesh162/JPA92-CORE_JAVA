package p1;
public class Person{
	private String name;
	private int age;

	public Person(){ this("",1); };
	
	public Person(String name,int age){
		if(! name.isEmpty() && ! name.equals(null))	
		 this.name=name; 
		
		if(age>0  && age<200)
		this.age=age;
	}
	public Person(String name){
		  this(name,1);	
	}

	public void setAge(int age){
		if(age>0  && age<200)
		 this.age=age;

	}

	public void setName(String name){
		if(! name.isEmpty() && ! name.equals(null))	
		this.name=name;

	}

	public String getName(){ return name;}
	public  int getAge(){ return age; }

	public void displayPerson(){
		   System.out.println("Name  "+name);
		   System.out.println("Age  "+age);
	}

}