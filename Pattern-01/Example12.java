/*
A A A A A
B B B B B
C C C C C
D D D D D
E E E E E

11111
22222
33333
44444
55555

*/
// CODE UNICODE
// A     65
// a     97
//       32
// 0     48

public class Example12{
	public static void main(String[] args) {
		int x=65;
		System.out.println(x);  // x int  
		System.out.println((char)x);
		// Narrowing

		int N=5;
		for(int i=1;i<=N;i++){
			 for(int j=1;j<=N;j++)
			 	//System.out.print((char)(64+i));
			 System.out.print((char)(96+i));
			 System.out.println();
		}
		
	}
}