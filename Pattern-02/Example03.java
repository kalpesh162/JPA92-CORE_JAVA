/*
5
44
333
2222
11111
*/
public class Example03{
	public static void main(String[] args) {
		int N=5;
		for(int i=N;i>=1;i--){
				for(int j=N;j>=i;j--){
					System.out.print(i);
				}
				System.out.println();

		}

	}
}