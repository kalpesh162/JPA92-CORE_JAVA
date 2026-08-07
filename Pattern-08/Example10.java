/*
*****     *****     *****
*****     *****     *****
*****     *****     *****
*****     *****     *****
*****     *****     *****

     *****     *****
     *****     *****
     *****     *****
     *****     *****
     *****     *****

*****     *****     *****
*****     *****     *****
*****     *****     *****
*****     *****     *****
*****     *****     *****

     *****     *****
     *****     *****
     *****     *****
     *****     *****
     *****     *****

*****     *****     *****
*****     *****     *****
*****     *****     *****
*****     *****     *****
*****     *****     *****
*/
public class Example10{
	public static void main(String[] args) {
			int N=5;

			for(int  i=1;i<=N;i++){


			for(int j=1;j<=N;j++){

			for(int l=1;l<=N;l++){
				
				if(i%2==1 && l%2==1){
				for(int m=1;m<=N;m++){
					System.out.print("*");
				}
			}
			else{

					if(i%2==0 && l%2==0){
						for(int m=1;m<=N;m++){
							System.out.print("*");
					}
					
				}else{
					for(int m=1;m<=N;m++){
					System.out.print(" ");
				}
			}
				
			}
				//System.out.println();
			}
			System.out.println();

		}
					System.out.println();

	}





	}
}