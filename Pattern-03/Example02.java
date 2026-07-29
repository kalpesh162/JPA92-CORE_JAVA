/*
eeeee
dddd
ccc
bb
a

55555
4444
333
22
1
a -> 97

96+i
*/
public class Example02{
	public static void main(String[] args) {
		int N=5;

		for(int i=N;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print((char)(96+i));
			}
			System.out.println();
		}
	}
}