

public class Example05{

	public static void main(String[] args) {
		int N=5;

		// Upper Part
		for(int i=1;i<=N;i++){

			if(i==1){
				  for(int j=1;j<2*N;j++)
				  	System.out.print("*");
			}
			else{

					for(int j=i;j<=N;j++)
						System.out.print("*");

					for(int sp=1;sp<=2*i-3;sp++)
						System.out.print(" ");						

					for(int j=i;j<=N;j++)
						System.out.print("*");

			}
			System.out.println();						

		}

		// Lower part

		for(int i=2;i<=N;i++){

			if(i==N){
				  for(int j=1;j<2*N;j++)
				  	System.out.print("*");
			}
			else{

					for(int j=1;j<=i;j++)
						System.out.print("*");

					for(int sp=1;sp<=2*(N-i)-1;sp++)  // 2*(2*N)-i)  // 
						System.out.print(" ");						

					for(int j=1;j<=i;j++)
						System.out.print("*");

			}
			System.out.println();						

		}



	}

}