
import java.util.Scanner;
public class Calculator{
	public static void main(String[] args) {
			double num1,num2,res;  int y;
  			Scanner scanner=new Scanner(System.in);
  			
			do{
  			System.out.println("Enter NUM1 ");
  			num1=scanner.nextDouble();
  			System.out.println("Enter NUM2 ");
  			num2=scanner.nextDouble();

			
  			System.out.println("**** OPERATIONS *****");
  			System.out.println("      +              ");
  			System.out.println("      -              ");
  			System.out.println("      /              ");
  			System.out.println("      *              ");
  			System.out.println("Enter  ...");
  			char op=scanner.next().charAt(0);

  			switch(op){

  				case '+'  :
  				  res=num1+num2;
  				  System.out.println(res);
  				  break;
  				case '-'  :
  				  res=num1-num2;
  				  System.out.println(res);
  				  break;
  				case '/'  :
  				  res=num1/num2;
  				  System.out.println(res);
  				  break;
  				case '*'  :
  				  res=num1*num2;
  				  System.out.println(res);
  				  break;
  			}
  			System.out.println("For Continue Press 1 :");
  			y=scanner.nextInt();

  		}while(y==1);
	}
}