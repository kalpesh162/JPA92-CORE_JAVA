/**
 *   @author  : Kalpesh
 *   @since   : 1.0 
 * 
 * */
public class NumberOperation{
	int number;
	
	public int sumOfDigit(){
		int temp=number;
		int sum=0;
		while(temp>0){
			 sum=sum+temp%10;
			 temp=temp/10;
		}
		return sum;
	}

	public void printFactor(){
		System.out.println("Number Factors :  "+number);
		System.out.println("---------------------------");
		for(int i=1;i<number;i++){
			if(number%i==0)
			System.out.printf("%-2d \n",i);
	}
	}

	//.....
}