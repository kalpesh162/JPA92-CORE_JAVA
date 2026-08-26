public  class App{
	public static void main(String[] args) {
		
		Watch rolex=new Watch();  
		rolex.displayTime();
		System.out.println("--------------");
		//rolex.hour=11;hour has private access in Watch
		rolex.setHours(8); 
		rolex.setMinutes(8);
		rolex.setSeconds(8);
		System.out.println(rolex.getHours());

		rolex.displayTime();

	}
}