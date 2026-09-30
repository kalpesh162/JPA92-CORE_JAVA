/*  Write a Java  program to find the reverse of a string.  */
import java.util.Scanner;

public  class Example03  {

    /*
    public static String reverse(String input){
        String output="";
        for(int i=input.length()-1;i>=0;i--){
            output=output+input.charAt(i);
        }

        return output;

    }
    */
    /*
     public static String reverse(String input){
        char output[]=new char[input.length()];
        int index=0;
        for(int i=input.length()-1;i>=0;i--){
            output[index]=input.charAt(i);
            index++;
        }

        return new String(output);  // convert char[]  to String

    }
    */
     public static String reverse(String input){
        char output[]=new char[input.length()];
        int index=0;
        for(int i=input.length()-1;i>=0;i--){
            output[index]=input.charAt(i);
            index++;
        }

        return String.valueOf(output);

    }



    public static void main(String[] args) {
        
        String input;
        System.out.println("Enter Input To reverse String ");
        Scanner scanner=new Scanner(System.in);
        input=scanner.nextLine();

        String op=reverse(input);
        System.out.println(input);
        System.out.println(op);
    }
    
}
