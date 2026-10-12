class Example03 {

	public static void main(String[] args) {
		
		try{
			System.exit(1);  // finally block will not execute in case of System.exit(status_code)
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