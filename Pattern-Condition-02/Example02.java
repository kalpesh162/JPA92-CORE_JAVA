/*
55555
54444
54333
54322
54321
*/
public class Example02{
	public static void main(String[] args) {
		int N=5;
		for(int i=N;i>=1;i--){
			for(int j=N;j>=1;j--){
					if(j>i){
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