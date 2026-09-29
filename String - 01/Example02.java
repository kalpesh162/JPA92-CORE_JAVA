/*
class String{
	  public String concat(String);
}
*/
public  class Example02 {

	public static void main(String[] args) {
			// public String(String)
		
		String s1=new String("Kareena");  // immutable

		s1=s1.concat("Kapoor");

		System.out.println(s1);

	}
	
}