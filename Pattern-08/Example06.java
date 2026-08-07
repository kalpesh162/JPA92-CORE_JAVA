/*
    +
    +
    +
    +
+++++++++
    +
    +
    +
    +
*/
public class Example06{
	public static void main(String[] args) {
		int N=9;
		int mid=(N+1)/2;
		for(int i=1;i<=N;i++){
			 for(int j=1;j<=N;j++){
			 	   if(i==mid || j==mid)
			 	   	System.out.print("+");
			 	   else
			 	   	System.out.print(" ");
			 }
			 System.out.println();
		}
	}
}