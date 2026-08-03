/*
EEEEE   64+i 
ddddd   96+i
CCCCC   64+i
bbbbb   96+i
AAAAA   64+i
*/
public class Example03{
	public static void main(String[] args) {
		int N=5;

		for(int i=N;i>=1;i--){
			  for(int j=1;j<=N;j++){
			  	  if(i%2==1){
			  	  	System.out.print((char)(64+i));
			  	  }
			  	  else{
			  	  	 System.out.print((char)(96+i));
			  	  }
			  }
			  System.out.println();
		}
	}
}