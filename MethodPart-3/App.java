
/*
🔢 Problem 9: Append Two Numbers
📜 Task: Append one number to another.
int a = 123;
int b = 234;

Result:
123234
*/
import java.util.Scanner;
class App{
	public static int countDigit(int num){
		   int cnt=0;
		   while(num>0){
		   		cnt++;
		   		num=num/10;
		   }
		   return cnt;
	}
   public static int getMultiplier(int cnt){
   	    int multiplier=1;
   	    while(cnt>=1){
   	    	  multiplier=multiplier*10;
   	    	 cnt--;
   	    }
   	    return multiplier;

   }

	public static  int appendTwoNum(int a,int b){
                 // b --> digitCount
				int noOfDigits=countDigit(b);

				int multiplier=getMultiplier(noOfDigits);
				
               int result=a*multiplier+b;

               return result;
	}

	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int num1; int num2; int res;
			System.out.println("Enter Num1");
			num1=scanner.nextInt();
			System.out.println("Enter Num2");
			num2=scanner.nextInt();

			int result=appendTwoNum(num1,num2);

			System.out.println(result);

		
	}
}1