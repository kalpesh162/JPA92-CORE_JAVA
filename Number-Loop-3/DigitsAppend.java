import java.util.Scanner;

public class DigitsAppend{
	public static void main(String[] args) {
			int num1; int num2;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Num1 ");
			num1=scanner.nextInt();
			System.out.println("Enter Num2 ");
			num2=scanner.nextInt();

			// count  num2
			int temp=num2;
			int cnt=0;
			while(temp>0){
				 temp=temp/10;
				 cnt++;
			}

			// multiplier
			int multiplier=1;
			while(cnt>=1){
				 multiplier=multiplier*10;
				 cnt--;
			}

			// num1*multiplier+num2
			int res=num1*multiplier+num2;

			System.out.println(res);

			//System.out.println(10**2);  // PYTHON
			// Math.pow(10,2)
	}
}