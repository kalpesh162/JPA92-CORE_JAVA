public  class Example02 {

	static void doAdd(byte x , byte y){
		System.out.println(" Byte  "+(x+y));
	}
	static void doAdd(short x , short y){
		System.out.println(" Short "+(x+y));
	}

	public static void main(String[] args) {
			
			//doAdd(11,22);  
			//no suitable method found for doAdd(int,int)
			/*
			byte x=11;
			byte y=22;
			doAdd(x,y);

			doAdd((byte)11,(byte)22);   //Narrowing   // Explicit Type casting
			*/

			//doAdd((short)11,(short)22);

			//doAdd('A','B');  // no suitable method found for doAdd(char,char)

	}
	
}