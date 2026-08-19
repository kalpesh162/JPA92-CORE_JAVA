import java.util.Scanner;
public class LargestNum{
     static int large(int n1,int n2,int n3){
     	   //return n1>n2 && n1>n3 ? n1 : (n2>n3) ? n2 : n3;
     	   if(n1>n2 && n1>n3)
     	   	 return n1;
     	   else if(n2>n3)
     	   	return n2;
     	   else 
     	   	return n3;
     }

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter ");
		num1=scanner.nextInt();
		System.out.println("Enter ");
		num2=scanner.nextInt();
		System.out.println("Enter ");
		num3=scanner.nextInt();

		int res=large(num1,num2,num3);

		System.out.println(res);

	}
}