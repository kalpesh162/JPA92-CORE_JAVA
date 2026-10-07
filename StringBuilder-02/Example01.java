class Example01{
	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("I Love India");
		System.out.println(sb1);
		sb1.delete(2,6);
		System.out.println(sb1); // I  India
		sb1.insert(2,'A');
		System.out.println(sb1); // 

		//StringBuilder	replace(int start, int end, String str)	
		StringBuilder sb2=new StringBuilder("Playing Cricket");

		//sb2.insert(7,"FootBall");
		sb2.replace(8,sb2.length(),"FootBall");

		System.out.println(sb2);

		// StringBuilder reverse()

		StringBuilder sb3=new StringBuilder("Hello");
		System.out.println(sb3.reverse());

		//void	setCharAt(int index, char ch)	

		StringBuilder sb4=new StringBuilder("Kareena");
		sb4.setCharAt(0,'R');
		System.out.println(sb4);

	}
}