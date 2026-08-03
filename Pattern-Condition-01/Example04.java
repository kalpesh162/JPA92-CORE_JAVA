/*
AbCdE
AbCdE
AbCdE
AbCdE
AbCdE
*/
public class Example04{
	public static void main(String[] args) {
		int N=5;

		for(int i=1;i<=N;i++){
			  for(int j=1;j<=N;j++){
			  	  if(j%2==1){
			  	  	System.out.print((char)(64+j));
			  	  }
			  	  else{
			  	  	 System.out.print((char)(96+j));
			  	  }
			  }
			  System.out.println();
		}
	}
}