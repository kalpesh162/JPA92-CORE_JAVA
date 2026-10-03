public  class Example02{
	public static void main(String[] args) {

		//boolean	contains(CharSequence s)
		//boolean	contentEquals(CharSequence cs)

		String sent="Hi I Love India";
		String word="Love";
		System.out.println("contains   "+sent.contains(word));
		System.out.println("contentEquals  "+sent.contentEquals(word));

		String film="Hum Apke Hai Kaun";
		System.out.println("contentEquals  "+film.contentEquals("Hum Apke Hai Kaun"));


		String friends="Kareena Raveena Kareena Kareena Raveena Janvi Rekha  Madhuri Deepika";
		String actress="Kareena";

		// split()
		  int cnt=0;
		   String []words=friends.split(" ");
		    for(String word1: words){
		    	    if(word1.contentEquals(actress)) cnt++;
		    }

		    System.out.println(actress+" occurance at "+cnt);


		//static String	format(String format, Object... args)
		
		    /*
		    public String toString(){
			 	return ""+id+" "+name+" "+marks;
			}
			public String toString(){
			    return String.format("%-5d %-10s %-10.2f",id,name,marks);
			}
		*/

		//String	intern()

		String s1=new String("Hello");

		// s1 is ponting to heap area Object

		s1=s1.intern();
		//s1 is now pointing to literal pool Object

	}

}

		// ==
		// int	compareTo(String anotherString)
		//int	compareToIgnoreCase(String str)
		//boolean	equals(Object anObject)
		//boolean	equalsIgnoreCase(String anotherString)
