public class Example03{
	public static void main(String[] args) {
		for(int i=5;i>=1;i--){
				for(int j=1;j<=5;j++){
					System.out.printf("%d %d  ",i,j);
				}
				System.out.println();
		}
	}
}

/*
5 1  5 2  5 3  5 4  5 5
4 1  4 2  4 3  4 4  4 5
3 1  3 2  3 3  3 4  3 5
2 1  2 2  2 3  2 4  2 5
1 1  1 2  1 3  1 4  1 5
*/