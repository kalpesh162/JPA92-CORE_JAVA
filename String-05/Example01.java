class Example01 {

		public static void main(String[] args) {
			
			String str1="good";
			String str2=str1+"time";
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