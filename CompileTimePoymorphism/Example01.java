public  class Example01 {

	static void doAdd(byte x , byte y){
		System.out.println(x+y);
	}

	public static void main(String[] args) {
			
			//doAdd(11,22);
			// incompatible types: possible lossy conversion from int to byte
			byte x=11;
			byte y=22;
			doAdd(x,y);

			doAdd((byte)11,(byte)22);   //Narrowing   // Explicit Type casting

	}
	
}