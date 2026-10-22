public  class App {

	public static void main(String[] args) {
		
		Student s1=new Student(11,"Kareena",66.66);
		Address add1=new Address("FC ROAD","PUNE",421124);

		s1.setAddress(add1);

		System.out.println(s1);
		System.out.println(s1.getAddress());

		System.out.println("--------------------------");
		Student s2=null;
		 try{
		 s2=s1.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}


		System.out.println(s2);
		System.out.println(s2.getAddress());

		System.out.println("--------------------------");

		System.out.println("Student 1    "+s1.hashCode());
		System.out.println("Student 2    "+s2.hashCode());
		System.out.println("Address 1    "+s1.getAddress().hashCode());
		System.out.println("Address 2    "+s2.getAddress().hashCode());


	}
	
}