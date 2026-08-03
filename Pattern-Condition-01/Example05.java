/*
11111    i=1
AAAAA    i=2   64 + i/2
11111    i=3
BBBBB    i=4   64 + i/2
11111    i=5
CCCCC    i=6
11111    i=7  64 + i/3
*/
public class Example05{
	public static void main(String[] args) {
		int N=5;

		for(int i=1;i<=N;i++){
			  for(int j=1;j<=N;j++){
			  	  if(i%2==1){
			  	  	System.out.print("1");
			  	  }
			  	  else{
			  	  	 System.out.print((char)(64+(i/2)));
			  	  }
			  }
			  System.out.println();
		}
	}
}