class App {

	public static void main(String[] args) {
		
		Point p1=new Point(11,22);
		Point p2=new Point(11,22);

		if(p1.equals(p2))
			System.out.println("equals");
		else
			System.out.println("NOT equals");

		if(p1.equals(p1))
			System.out.println("equals");

		// If we are using refereence type  
		// ANd if we to check equality of 2 Object 
		// And u use equals() then
		// equals method by default check two Object references 

		// so for your ref type Object Equality
		// u should override equals method fron an Object class in your class[Type]
		// provide appropriate implementation
		
	}
	
}