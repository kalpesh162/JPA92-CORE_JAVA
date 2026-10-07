// JAVA 8 String join() method elaborate this code
class Example05 {

	public static void main(String[] args) {
		
		String friends[]={"Kareena","Raveena","Akshay","Manoj"};

		// Kareena-Raveena-Akshay-Manoj  Expeted OUTPUT

		String res="";
		for(int i=0;i<friends.length;i++)
			res=res+friends[i]+"-";

		System.out.println(res);

		String res1="";
		int i;
		for(i=0;i<friends.length-1;i++)
			res1=res1+friends[i]+"-";

		if(i<friends.length)
			  res1=res1+friends[i];

		System.out.println(res1);

		// String join(String delimeter,String)

		String result=String.join("-",friends);

		System.out.println(result);

	}
	
}