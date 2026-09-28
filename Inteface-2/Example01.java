import java.util.Arrays;

public  class Example01 {

	public static void main(String[] args) {
		boolean barr[]={true , false,true,false};
		long larr[]={111,222,11,33,555};
		double darr[]={55.66,33.33,55.64,66.7};
		char letters[]={'f','t','y','D','G'};
		String friends[]={"Tom","David","Kareena","Kunal"};


		//Arrays.sort(barr);
		Arrays.sort(larr);
		Arrays.sort(darr);
		Arrays.sort(letters);
		Arrays.sort(friends);

		System.out.println(Arrays.toString(barr));
		System.out.println(Arrays.toString(larr));
		System.out.println(Arrays.toString(darr));
		System.out.println(Arrays.toString(letters));
		System.out.println(Arrays.toString(friends));

		System.out.println("-------------------------------");
		Student s1=new Student(3,"Rahul",66.66);
		Student s2=new Student(13,"Shyam",86.66);
		Student s3=new Student(23,"Tushar",56.66);
		Student s4=new Student(30,"Kareena",96.66);
		Student s5=new Student(34,"Katrina",86.66);
		Student s6=new Student(12,"Janvi",76.66);

		Student sarr[]={s1,s2,s3,s4,s5,s6};

		// Arrays.sort(Object o1[]){}
		/*
		void static sort(Object arr[]){
					//arr[0]  tere andar kya  --> Student
					//arr[0]  are u type of comparable
			   // int compareTo()
 		}
 		*/

 		Arrays.sort(sarr);

 		//System.out.println(Arrays.toString(sarr));

 		for(Student stud : sarr)
 			System.out.println(stud);

 		/*
 		Student student=s1.clone();
 		System.out.println(student);
 		*/
	}
	
}