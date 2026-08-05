/*
12345
12344
12333
12222
11111
*/
public class Example01{
	public static void main(String[] args) {
		int N=5;
		for(int i=N;i>=1;i--){
			for(int j=1;j<=5;j++){
					if(j<i){
						System.out.print(j);
					}
					else{
						System.out.print(i);
					}
			}
			System.out.println();
		}
		
	}
}