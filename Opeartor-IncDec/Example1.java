public class Example1{
	public static void main(String[] args) {

		int num=11;

		//num=num+1;  
		//PreIncrement
		++num;
		System.out.println(num);

		//POST INCREMENT
		num++;
		System.out.println(num);

		int x=10;

		int y=++x; // Pre first increment then assign
		
		int z=x++; // post  first use value then assign

		System.out.println(y);
		System.out.println(z);
		System.out.println(x);
 
		
	}
}