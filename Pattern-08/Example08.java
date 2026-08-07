// Code With UnSucess

public class Example08{

	public static void main(String[] args) {
		int N=5;

		for(int i=1;i<=N;i++){

			for(int j=1;j<=N;j++){

				if(i%2==1){
						// print *
						if(j%2==1){
							for(int k=1;k<=N;k++){
								 for(int m=1;m<=5;m++)
								System.out.print("*");
						}
							System.out.println();

						}
						else{
							// print Space
							for(int k=1;k<=N;k++){
								 for(int m=1;m<=5;m++)
							System.out.print(" ");
					}
						System.out.println();
						}
				}

				else{

					// print *
						if(j%2==1){
							for(int k=1;k<=N;k++){
								 for(int m=1;m<=5;m++)
								System.out.print(" ");
						}
							System.out.println();
						}
						else{
							// print Space
							for(int k=1;k<=N;k++){
								 for(int m=1;m<=5;m++)
							System.out.print("*");
					}
						System.out.println();
						}


				}


			}


				System.out.println();

		}
		
	}
}