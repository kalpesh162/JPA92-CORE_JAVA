class Example02 {
	public static void main(String[] args) {
		try{
			System.out.print(11/0);
		}
		catch(ArithmeticException e){
			System.out.println("Exception CAUGHT ...");
		}
		finally{
			System.out.println("finally block Executes");
		}
		System.out.println("THANKS...");
	}
	
}