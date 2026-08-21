/*Write a  Java  program to check whether a number is an Armstrong number or not.*/
import java.util.Scanner;
public  class Example04  {

	static int  countDigit(int num){
		 int cnt=0;
		 while(num>0){
		 	 cnt++;
		 	 num/=10;//num=num/10;
		 }
		 return cnt;
	}

	public static boolean  isArmStrong(int num){
		// Copy Num
		int temp=num;  int sum=0;
		// step 1 : countDigit
		int y=countDigit(num);
		// Step 2 : Extarct Digits
		while(num>0){
			  int x=num%10;
			  sum=sum+(int)Math.pow(x,y) ;  // Step 3 : Power
			  // step 4 : Accumulator (Dabba Bisuits)
			  num=num/10;
		}
		return sum==temp;
	}

   public  static int power(int x,int y){
             int res=1;
   	         while(y>=1){
                   res=res*y;
                   y--;
   	         }

   	         return res;
   } 





	public static void main(String[] args) {

		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Num");
		num=scanner.nextInt();

		System.out.println(isArmStrong(num));
		
	}
	
}