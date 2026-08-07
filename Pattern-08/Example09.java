public class Example09{
	public static void main(String[] args) {
			int N=5;

			for(int i=1;i<=N;i++){

				for(int j=1;j<=N;j++){

						if((i+j)%2==0){
								for(int k=1;k<=N;k++){
									  for(int l=1;l<=N;l++)
									  	System.out.print("*");
									  System.out.println();
								}
								System.out.println();

						}
						else{

								for(int k=1;k<=N;k++){
									  for(int l=1;l<=N;l++)
									  	System.out.print(" ");
								System.out.println();	  
								}
								System.out.println();
								

						}

						
				}

				System.out.println();

			}
	}
}