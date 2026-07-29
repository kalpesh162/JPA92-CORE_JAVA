/*
a
bb
ccc
dddd
eeeee

a -> 97

96+i
*/
public class Example01{
	public static void main(String[] args) {
		int N=5;

		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)(96+i));
			}
			System.out.println();
		}
	}
}