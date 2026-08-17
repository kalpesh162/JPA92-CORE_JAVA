import java.util.Scanner;

class Day{
  

    public static void main(String[] args) {
  			int dayNum;
  			Scanner scanner=new Scanner(System.in);
  			System.out.println("Enter Day Num");
  			dayNum=scanner.nextInt();

  			int x=3;
  			switch (dayNum) {
  				
  				case 1 :
  				{
  				System.out.println("SUNDAY"); 
  				break;
  				}
  				case 2 :
  				System.out.println("MON");break;
  				/*
  				case 3.3 :    //  case x:  constant expression required
  				System.out.println("TUEDAY");break;
					double case not allow
  				*/
  				case 3 :    //  case x:  constant expression required
  				System.out.println("TUEDAY");break;
  				

  				case 4 :
  				System.out.println("WEDDAY");break;
  				case 5 :
  				System.out.println("THRDAY");break;
  				/*case "x" :   //  case x+3:  constant expression required
  				System.out.println("FRIDAY");break;
  				*/
  				case 3+3 :
  				System.out.println("FRIDAY");break;
  				
  				//duplicate case label	
  				case 6 :
  				System.out.println("FRIDAY");break;
  				

  				case 7 :
  				System.out.println("SATDAY");break;


  			}
  


    }


	
}