class Example01 {

	public static void main(String[] args) {
		
		try{
			System.out.print(11/0);
		}
		finally{
			System.out.println("finally block Executes");
			// Generally in finally block we write code for to release resouurces
			// Here resources mean can be anything like 
			// System(OS) resources or Connection resources or database resources etc
			// ideal code is code if we terminate abnormally we should close that resource and then terminate
		}

		System.out.println("THANKS...");

	}
	
}