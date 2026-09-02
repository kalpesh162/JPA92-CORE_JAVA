public  class Student {
	private static int nextId=0;
	private int id;
	private String name;
	private double marks; // double marks[]=new double[5];

	Student(String name,double marks){
		this.name=name;
		this.marks=marks;
		id=++nextId;
	}

	public  int getId(){ return this.id;}
	public  String getName(){ return this.name;}
	public  double getMarks(){ return this.marks;}

	public  void setName(String name){ this.name=name;}
	public  void setMarks(double marks){ this.marks=marks;}

   public void studentInfo(){
   	 System.out.printf("%-5d %-10s %10.2f",id,name,marks);
   	 System.out.println();
   }
}