//let say 1234  --> 2
// 435353  --->3   
// second digit from left  
import java.util.Scanner;
public class Example05{
	public static void main(String[] args) {
    int num;
    System.out.println("Enter Number");
    Scanner scanner=new Scanner(System.in);
    num=scanner.nextInt();
        
     while(num>100)
     	num=num/10;

     //num

     System.out.println(num%10);

    }
}

//123456

