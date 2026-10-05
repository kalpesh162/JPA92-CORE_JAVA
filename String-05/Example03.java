class Example03 {

		public static void main(String[] args) {
			
			// COnstanr String are computed at Compile time

			String str1="good";
			//COSTNAT + CONSTANT ---> goodtime
			String str2="good"+"time";
			String str3="goodtime";

			if(str2==str3)
				System.out.println("Equal");
			else
				System.out.println("NOT Equal");

			
			if(str2.equals(str3))
				System.out.println("Equal");
			else
				System.out.println("NOT Equal");

	}
	
}