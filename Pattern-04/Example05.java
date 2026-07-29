/*
1
2  6
3  7  10
4  8  11  13
5  9  12  14  15
*/
public class Example05{

	public static void main(String[] args) {
			
			int N=5;
			int cnt=1;
			for(int i=N;i>=1;i--){

				int c=cnt;
				for(int j=n;j >= i;j--){    // 4 >= 5
					System.out.println(c);
					c=c+j-1;    // c=3+5-1   c=7+4-1	
				}

				cnt++;

			}
	}
}
