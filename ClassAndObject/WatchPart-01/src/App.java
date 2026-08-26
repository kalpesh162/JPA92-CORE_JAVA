
public  class App{
	 public static void main(String[] args) {
	 	
	 	Watch fastrack=new Watch();  // 0 0 0
	 	fastrack.hour=8;
	 	fastrack.minutes=11;
	 	fastrack.seconds=5;
	 	/*
	 	System.out.println(fastrack.hour);
	 	System.out.println(fastrack.minutes);
	 	System.out.println(fastrack.seconds);
	 	*/

	 	fastrack.displayTime();

	 	fastrack.minutes=15;  // Object minute data 
	 	// Nob
	 	fastrack.setHour(9);
	 	fastrack.displayTime();

	 	System.out.println("Seconds  :  "+fastrack.getSeconds());

	 }
}