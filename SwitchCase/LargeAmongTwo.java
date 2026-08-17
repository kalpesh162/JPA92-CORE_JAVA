import java.util.Scanner;
public class LargeAmongTwo{
	public static void main(String[] args) {
			int num1,num2;
  			Scanner scanner=new Scanner(System.in);
  			System.out.println("Enter Num1");
  			num1=scanner.nextInt();
  			System.out.println("Enter Num2");
  			num2=scanner.nextInt();
  			// incompatible types: boolean cannot be converted to int
  			boolean val=num1>num2;
  			int x;
  			if(val==true)
  				 x=1;
  		    else
  		    	x=0;
  	
  			//System.out.println((int)val);	
  			switch(x){
  				    
  				   case 1 : 
  				   System.out.println(num1); break;

  				   case 0 :
					System.out.println(num2);  	break;			   
  			}
  			
	}
}